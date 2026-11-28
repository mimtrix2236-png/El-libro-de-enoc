# Auditoría de integridad documental y visual — capítulos 66–108

**Fecha:** 28 de noviembre de 2026  
**Editor:** Mauro Iván Maidana  
**Alcance:** inspección del árbol Git recursivo de la rama `main`, comparación de nombres/SHA de assets y lectura de los SVG para identificar previews raster embebidas. No equivale a evaluación estética experta ni a revisión del texto fuente.

## Integridad de archivos

- **43/43** archivos de paráfrasis individual existen: `docs/chapters/66_capitulo_66_parafrasis.md` hasta `docs/chapters/108_capitulo_108_parafrasis.md`, con prefijo de tres dígitos para 100–108.
- **43/43** SVG editoriales existen en `assets/illustrations/chapter_N.svg`.
- **43/43** copias Android existen en `app/src/main/assets/illustrations/chapter_N.svg`.
- Los SHA de blob de las 43 parejas editorial/Android coinciden: no se detectaron copias desactualizadas.
- Esta comprobación confirma presencia e identidad de archivos, no que cada dibujo represente con precisión todos los detalles del capítulo.

## Previews generadas integradas

Se detectaron doce capítulos con imagen raster generada incorporada al recurso activo del lector:

| Capítulo | Forma de integración |
|---|---|
| 89 | JPEG embebido en `chapter_89.svg` |
| 92 | `chapter_92_generated.svg`, seleccionado por el lector |
| 94 | JPEG embebido en `chapter_94.svg` |
| 95 | JPEG embebido en `chapter_95.svg` |
| 97 | `chapter_97_generated.svg`, seleccionado por el lector |
| 99 | JPEG embebido en `chapter_99.svg` |
| 100 | JPEG embebido en `chapter_100.svg` |
| 102 | JPEG embebido en `chapter_102.svg` |
| 104 | JPEG embebido en `chapter_104.svg` |
| 106 | `chapter_106_generated.svg`, seleccionado por el lector |
| 107 | `chapter_107_generated.svg`, seleccionado por el lector |
| 108 | JPEG embebido en `chapter_108.svg` |

El capítulo 76 tiene además `assets/generated/chapter_76_winds_gates_preview.jpg`, pero el inventario indica que no está integrado en el lector.

## Capítulos cuyo recurso principal sigue siendo vectorial

No se encontró raster embebido ni archivo alternativo `*_generated.svg` activo para:  
**66–88, 90–91, 93, 96, 98, 101, 103 y 105** (31 capítulos).

Estos SVG son composiciones vectoriales específicas de capítulo; no se los clasifica como ilustraciones generadas ni como masters de imprenta. Deben pasar revisión visual y, donde el concepto no sea suficientemente específico, rediseño antes de aprobarse.

## Límites de calidad y producción

1. Las previews generadas son pequeñas y se diseñaron para el lector móvil; no sustituyen masters de 300 dpi ni archivos de impresión.
2. El master generado 1024×1536 del capítulo 108 se conserva temporalmente en el entorno de trabajo como `/mnt/data/chapter_108_master.jpg`, pero no está archivado en GitHub.
3. Los masters de otros capítulos generados tampoco se consideran archivados por el mero hecho de existir una preview SVG.
4. No se realizó inspección de todas las imágenes en una pantalla física ni prueba de impresión.
5. La presencia de una ilustración no valida la interpretación textual; cada escena debe contrastarse con su paráfrasis y sus notas.

## Próxima prioridad visual

- Revisar los 31 capítulos con SVG vectorial solamente, empezando por los capítulos finales 105, 103, 101 y 98.
- Mantener los conceptos anteriores cuando se genere una lámina nueva, con nombres `*_vector_concept.svg`.
- Archivar masters de alta resolución y registrar tamaño, SHA-256, licencia/procedencia y estado de aprobación antes de preparar el PDF.
