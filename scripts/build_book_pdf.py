#!/usr/bin/env python3
"""Build a clearly labelled editorial proof PDF from the repository's Markdown drafts.

This is a proofing artifact, not a final critical edition. Chapters 66–108 are
original provisional paraphrases and are labelled as such in their source files.
"""
from __future__ import annotations

import argparse
import hashlib
import html
import json
import re
from pathlib import Path

from reportlab.lib import colors
from reportlab.lib.enums import TA_CENTER, TA_JUSTIFY, TA_LEFT
from reportlab.lib.pagesizes import A5
from reportlab.lib.styles import ParagraphStyle, getSampleStyleSheet
from reportlab.lib.units import mm
from reportlab.pdfbase import pdfmetrics
from reportlab.pdfbase.ttfonts import TTFont
from reportlab.platypus import (
    BaseDocTemplate, Frame, Flowable, HRFlowable, KeepTogether,
    NextPageTemplate, PageBreak, PageTemplate, Paragraph, Spacer
)
from reportlab.pdfgen.canvas import Canvas
from pypdf import PdfReader

ROOT = Path(__file__).resolve().parents[1]
CHAPTER_DIR = ROOT / "docs" / "chapters"
FRONT = ROOT / "docs" / "00_front_matter.md"
COVER = ROOT / "assets" / "book_cover.svg"

INK = colors.HexColor("#38271d")
WINE = colors.HexColor("#6b2835")
GOLD = colors.HexColor("#a77b3d")
PAPER = colors.HexColor("#f2e7d2")
PALE = colors.HexColor("#e8d7b7")


def register_fonts() -> tuple[str, str, str]:
    candidates = [
        Path("/usr/share/fonts/truetype/dejavu/DejaVuSerif.ttf"),
        Path("/usr/share/fonts/truetype/dejavu/DejaVuSerif-Bold.ttf"),
        Path("/usr/share/fonts/truetype/dejavu/DejaVuSerif-Italic.ttf"),
        Path("/usr/share/fonts/truetype/dejavu/DejaVuSans.ttf"),
    ]
    if all(p.exists() for p in candidates[:3]):
        pdfmetrics.registerFont(TTFont("BookSerif", str(candidates[0])))
        pdfmetrics.registerFont(TTFont("BookSerif-Bold", str(candidates[1])))
        pdfmetrics.registerFont(TTFont("BookSerif-Italic", str(candidates[2])))
        pdfmetrics.registerFontFamily("BookSerif", normal="BookSerif", bold="BookSerif-Bold", italic="BookSerif-Italic", boldItalic="BookSerif-Bold")
        if candidates[3].exists():
            pdfmetrics.registerFont(TTFont("BookSans", str(candidates[3])))
        return "BookSerif", "BookSerif-Bold", "BookSerif-Italic"
    return "Times-Roman", "Times-Bold", "Times-Italic"


def inline_markup(text: str) -> str:
    value = html.escape(text, quote=False)
    value = re.sub(r"`([^\`]+)`", r'<font name="Courier">\1</font>', value)
    value = re.sub(r"\*\*(.+?)\*\*", r"<b>\1</b>", value)
    value = re.sub(r"(?<!\*)\*([^*]+?)\*(?!\*)", r"<i>\1</i>", value)
    value = re.sub(
        r"\[([^\]]+)\]\((https?://[^)]+)\)",
        r'<link href="\2" color="#7a4a2a">\1</link>',
        value,
    )
    return value


def make_styles():
    base, bold, italic = register_fonts()
    return {
        "h1": ParagraphStyle("H1", fontName=bold, fontSize=20, leading=25, textColor=WINE, spaceAfter=10, alignment=TA_CENTER),
        "h2": ParagraphStyle("H2", fontName=bold, fontSize=15, leading=19, textColor=WINE, spaceBefore=12, spaceAfter=7, keepWithNext=True),
        "h3": ParagraphStyle("H3", fontName=bold, fontSize=11.5, leading=15, textColor=GOLD, spaceBefore=9, spaceAfter=5, keepWithNext=True),
        "body": ParagraphStyle("Body", fontName=base, fontSize=9.4, leading=14, textColor=INK, alignment=TA_JUSTIFY, spaceAfter=6),
        "quote": ParagraphStyle("Quote", fontName=italic, fontSize=8.6, leading=12, textColor=colors.HexColor("#654b36"), leftIndent=12, rightIndent=10, spaceBefore=3, spaceAfter=8),
        "bullet": ParagraphStyle("Bullet", fontName=base, fontSize=8.9, leading=13, textColor=INK, leftIndent=13, firstLineIndent=-8, spaceAfter=4),
        "toc": ParagraphStyle("TOC", fontName=base, fontSize=8.4, leading=11, textColor=INK, spaceAfter=2),
        "small": ParagraphStyle("Small", fontName=italic, fontSize=8, leading=11, textColor=GOLD, alignment=TA_CENTER, spaceAfter=8),
    }


def markdown_flowables(markdown: str, styles) -> list:
    story = []
    paragraph_lines: list[str] = []

    def flush():
        if paragraph_lines:
            text = " ".join(x.strip() for x in paragraph_lines)
            if text:
                story.append(Paragraph(inline_markup(text), styles["body"]))
            paragraph_lines.clear()

    for raw in markdown.splitlines():
        line = raw.rstrip()
        if not line.strip():
            flush()
            continue
        if line.strip() in ("---", "***", "___"):
            flush()
            story.append(Spacer(1, 3))
            story.append(HRFlowable(width="100%", thickness=.6, color=GOLD, spaceBefore=3, spaceAfter=8))
            continue
        if line.startswith("# "):
            flush()
            story.append(Paragraph(inline_markup(line[2:].strip()), styles["h1"]))
        elif line.startswith("## "):
            flush()
            story.append(Paragraph(inline_markup(line[3:].strip()), styles["h2"]))
        elif line.startswith("### "):
            flush()
            story.append(Paragraph(inline_markup(line[4:].strip()), styles["h3"]))
        elif line.startswith(">"):
            flush()
            story.append(Paragraph(inline_markup(line.lstrip("> ").strip()), styles["quote"]))
        elif line.startswith("- ") or line.startswith("* "):
            flush()
            story.append(Paragraph("• " + inline_markup(line[2:].strip()), styles["bullet"]))
        elif re.match(r"^\d+\.\s+", line):
            flush()
            story.append(Paragraph(inline_markup(line), styles["bullet"]))
        else:
            paragraph_lines.append(line)
    flush()
    return story


class CoverFlowable(Flowable):
    """ReportLab-native cover matching the approved leather/aged-gold design.

    The SVG remains the canonical Android/editorial asset. Drawing this cover
    directly with ReportLab keeps the PDF build independent of Cairo bindings.
    """
    def __init__(self, svg_path: Path):
        super().__init__()
        self.svg_path = svg_path

    def wrap(self, avail_width, avail_height):
        self.width = avail_width
        self.height = avail_height
        return self.width, self.height

    def draw(self):
        c = self.canv
        w, h = self.width, self.height
        c.saveState()
        c.setFillColor(colors.HexColor("#321c13"))
        c.rect(0, 0, w, h, fill=1, stroke=0)
        # Quiet leather grain: deterministic, low-contrast tooling marks.
        c.setStrokeColor(colors.HexColor("#6b432b"))
        c.setLineWidth(.35)
        for row in range(18):
            y = 8*mm + row * (h-16*mm) / 17
            for col in range(11):
                x = 8*mm + col * (w-16*mm) / 10
                c.line(x, y, x+2.5*mm, y+0.7*mm)
        c.setStrokeColor(colors.HexColor("#c49a5a"))
        c.setLineWidth(1.6)
        c.rect(8*mm, 8*mm, w-16*mm, h-16*mm, fill=0, stroke=1)
        c.setLineWidth(.55)
        c.rect(11*mm, 11*mm, w-22*mm, h-22*mm, fill=0, stroke=1)
        # Corner tooling and celestial seal.
        for x, y, sx, sy in [
            (14*mm, h-14*mm, 1, -1), (w-14*mm, h-14*mm, -1, -1),
            (14*mm, 14*mm, 1, 1), (w-14*mm, 14*mm, -1, 1)
        ]:
            c.setLineWidth(1)
            c.line(x, y, x+12*mm*sx, y)
            c.line(x, y, x, y+12*mm*sy)
            c.circle(x+5*mm*sx, y+5*mm*sy, 2.2*mm, fill=0, stroke=1)
        cx, cy = w/2, h*.79
        c.setLineWidth(1)
        c.circle(cx, cy, 15*mm, fill=0, stroke=1)
        c.setDash(1.2, 2.4)
        c.circle(cx, cy, 12*mm, fill=0, stroke=1)
        c.setDash()
        c.line(cx, cy-19*mm, cx, cy+19*mm)
        c.line(cx-19*mm, cy, cx+19*mm, cy)
        c.setFillColor(colors.HexColor("#e0c184"))
        c.circle(cx, cy, 1.5*mm, fill=1, stroke=0)
        gold = colors.HexColor("#e1c184")
        c.setFillColor(gold)
        c.setFont("Times-Bold", 17)
        c.drawCentredString(cx, h*.60, "EL LIBRO DE ENOC")
        c.setStrokeColor(gold)
        c.setLineWidth(.7)
        c.line(w*.28, h*.575, w*.72, h*.575)
        c.setFont("Times-Roman", 9)
        c.drawCentredString(cx, h*.535, "EDICIÓN ILUSTRADA")
        c.setFont("Times-Roman", 7.2)
        c.drawCentredString(cx, h*.505, "LECTURA · ESTUDIO · TRADICIÓN TEXTUAL")
        c.line(w*.36, h*.465, w*.64, h*.465)
        c.setFont("Times-Bold", 11)
        c.drawCentredString(cx, h*.405, "MAURO IVÁN MAIDANA")
        c.setFont("Times-Roman", 7.5)
        c.drawCentredString(cx, h*.37, "108 CAPÍTULOS")
        c.restoreState()


def body_page(canvas: Canvas, doc):
    canvas.saveState()
    w, h = A5
    canvas.setFillColor(PAPER)
    canvas.rect(0, 0, w, h, fill=1, stroke=0)
    canvas.setStrokeColor(colors.HexColor("#b18a56"))
    canvas.setLineWidth(.45)
    canvas.line(17*mm, h-13*mm, w-17*mm, h-13*mm)
    canvas.setFillColor(GOLD)
    canvas.setFont("Times-Italic", 7)
    canvas.drawString(17*mm, h-10.5*mm, "El Libro de Enoc")
    canvas.drawRightString(w-17*mm, h-10.5*mm, "Mauro Iván Maidana")
    canvas.line(17*mm, 13*mm, w-17*mm, 13*mm)
    canvas.setFont("Times-Roman", 7)
    canvas.drawString(17*mm, 8.5*mm, "BORRADOR EDITORIAL · PARÁFRASIS PROVISIONALES")
    canvas.drawRightString(w-17*mm, 8.5*mm, str(doc.page))
    canvas.restoreState()


def chapter_files() -> list[tuple[int, Path]]:
    found = []
    for path in CHAPTER_DIR.glob("*_capitulo_*_parafrasis.md"):
        match = re.match(r"(\d+)_capitulo_(\d+)_parafrasis\.md$", path.name)
        if match:
            found.append((int(match.group(1)), path))
    return sorted(found, key=lambda item: item[0])


def build(output: Path):
    chapters = chapter_files()
    expected = list(range(1, 109))
    actual = [n for n, _ in chapters]
    if actual != expected:
        raise SystemExit(f"Se esperaban los capítulos 1–108 sin huecos; encontrados: {len(actual)}")

    styles = make_styles()
    output.parent.mkdir(parents=True, exist_ok=True)
    page_w, page_h = A5
    doc = BaseDocTemplate(
        str(output), pagesize=A5, title="El Libro de Enoc — edición de lectura y estudio",
        author="Mauro Iván Maidana", subject="Borrador editorial provisional de 1 Enoc",
        leftMargin=17*mm, rightMargin=17*mm, topMargin=19*mm, bottomMargin=19*mm,
    )
    cover_frame = Frame(0, 0, page_w, page_h, id="cover", leftPadding=0, rightPadding=0, topPadding=0, bottomPadding=0)
    body_frame = Frame(doc.leftMargin, doc.bottomMargin, page_w-doc.leftMargin-doc.rightMargin,
                       page_h-doc.topMargin-doc.bottomMargin, id="body", leftPadding=0, rightPadding=0,
                       topPadding=0, bottomPadding=0)
    doc.addPageTemplates([
        PageTemplate(id="Cover", frames=[cover_frame]),
        PageTemplate(id="Body", frames=[body_frame], onPage=body_page),
    ])

    story = [CoverFlowable(COVER), NextPageTemplate("Body"), PageBreak()]
    story += markdown_flowables(FRONT.read_text(encoding="utf-8"), styles)
    story.append(PageBreak())
    story.append(Paragraph("ÍNDICE DE LOS 108 CAPÍTULOS", styles["h1"]))
    story.append(Paragraph("Los títulos siguen la organización de los documentos editoriales de trabajo.", styles["small"]))
    for number, path in chapters:
        first = path.read_text(encoding="utf-8").splitlines()[0].lstrip("# ").strip()
        story.append(Paragraph(f"{number:03d} · {inline_markup(first)}", styles["toc"]))
    story.append(PageBreak())

    for number, path in chapters:
        story.append(PageBreak())
        story.extend(markdown_flowables(path.read_text(encoding="utf-8"), styles))

    optional = [
        ("Glosario preliminar", ROOT / "docs" / "glosario_preliminar.md"),
        ("Bibliografía y fuentes de cotejo", ROOT / "docs" / "bibliografia_fuentes_cotejo.md"),
    ]
    for title, path in optional:
        if path.exists():
            story.append(PageBreak())
            story.extend(markdown_flowables(path.read_text(encoding="utf-8"), styles))

    story.append(PageBreak())
    story.append(Paragraph("Estado de esta prueba editorial", styles["h1"]))
    story.append(Paragraph(
        "Este PDF es una prueba de composición generada a partir de los archivos Markdown actuales. "
        "No es una edición crítica ni una traducción definitiva. Los capítulos 66–108 se presentan "
        "como paráfrasis originales provisionales basadas en la numeración de Charles 1917. "
        "Las notas de variantes, reconstrucciones y testigos deben revisarse capítulo por capítulo. "
        "Los apéndices de manuscritos y fragmentos, textos relacionados y aparato crítico completo "
        "todavía no están incorporados a esta prueba.", styles["body"]))
    doc.build(story)

    reader = PdfReader(str(output))
    if len(reader.pages) < 108:
        raise SystemExit(f"PDF incompleto: {len(reader.pages)} páginas.")
    extracted = "\n".join((page.extract_text() or "") for page in reader.pages)
    if "108:15" not in extracted or "Mauro Iván Maidana" not in extracted:
        raise SystemExit("La verificación del PDF no encontró el capítulo 108 o los créditos.")
    digest = hashlib.sha256(output.read_bytes()).hexdigest()
    result = {
        "output": str(output.relative_to(ROOT)),
        "bytes": output.stat().st_size,
        "pages": len(reader.pages),
        "chapters": len(chapters),
        "sha256": digest,
        "status": "editorial proof; not final",
    }
    print(json.dumps(result, ensure_ascii=False, indent=2))


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--output", default="dist/El_Libro_de_Enoc_prueba_editorial.pdf")
    args = parser.parse_args()
    out = Path(args.output)
    if not out.is_absolute():
        out = ROOT / out
    build(out)
