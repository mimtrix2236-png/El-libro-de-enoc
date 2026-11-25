# Auditoría de capítulos 66–108

**Fecha:** 19 de noviembre de 2026  
**Proyecto:** El Libro de Enoc — Mauro Iván Maidana

## Comprobaciones de estructura

- Se verificaron los 43 archivos canónicos de paráfrasis, capítulos 66 a 108, en `docs/chapters/`; no hay huecos en esta secuencia.
- Cada capítulo tiene un archivo Markdown individual, una paráfrasis provisional, nota de estado, fuente de trabajo e idea de ilustración.
- Hay 43 archivos SVG individualizados en `assets/illustrations/chapter_66.svg`–`chapter_108.svg` y 43 copias con los mismos nombres en `app/src/main/assets/illustrations/`.
- Los capítulos 66–80, 81–95 y 96–108 están en catálogos Kotlin separados y concatenados por `EnocContent.chapters`; por tanto el contenido y las ilustraciones se empaquetan para lectura offline.

## Estado de la fuente

Las paráfrasis son originales y no reproducen literalmente una traducción moderna. El principal texto de trabajo citado es R. H. Charles, *The Book of Enoch* (edición de 1912 reimpresa por SPCK en 1917), transcripción de Project Gutenberg eBook 77935, que declara dominio público en EE. UU. Debe comprobarse la jurisdicción antes de redistribuir cualquier texto completo; en esta fase se usan paráfrasis.

En la revisión se corrigieron las referencias del catálogo Android para los capítulos 72–77, que antes tenían “Fuente y cotejo pendientes”. Ahora señalan Charles y Global Grey; el cotejo de cifras, numeración y variantes sigue pendiente.

Online Critical Pseudepigrapha es un recurso académico multilingüe de ediciones críticas y aparatos, pero su sitio informa transición de plataforma; el lector 1 Enoch consultado no presentó texto durante esta revisión. No se afirmó cotejo con su aparato.

## Estado de arte

Los 43 SVG capítulo-específicos existen y están vinculados por número. 66–75 fueron refinados; 89, 92, 94 y 106 cuentan con previews raster generadas integradas dentro de SVG; capítulo 76 tiene una preview separada no integrada. El resto de 76–108 conserva conceptos vectoriales. La revisión de archivos no equivale a QA artístico; todos los assets necesitan inspección y refinamiento. Ninguna preview se considera lámina de imprenta definitiva.

## Build / corrección técnica

El workflow Android anterior falló por paréntesis de cierre omitidos en los 73 registros `ChapterEntry` de los cinco catálogos Kotlin que cubren capítulos 36–108. La corrección fue comprometida en `613cd34fb462294a2a1d558dd8fb6ab87440222b`; el workflow 44536929563 terminó **success** y los pasos de `assembleDebug` y `upload-artifact` también fueron exitosos. El APK debug de 9,180,825 bytes está disponible en el artifact de esa ejecución (retención temporal de GitHub).

El commit posterior `645837c80ba361d42fe6a4bf46476b1d18961e07` añade las referencias para 72–77; su CI estaba en curso al crear este informe.

## Pendientes antes de publicación

1. Cotejo versículo por versículo con una edición crítica y testimonios, anotando lagunas, suplementos y variantes.
2. Revisión de la precisión de cada paráfrasis y de la terminología (astronomía/calendario, alegoría animal, Apocalipsis de las Semanas, fragmento noánico).
3. Refinar y aprobar las 43 ilustraciones individualizadas.
4. Integrar audio ambiente con origen/licencia verificables y probar que funcione offline.
5. Completar búsqueda, marcadores, paginación/swipe, ajuste tipográfico, modo nocturno y pruebas de navegación/lector.
6. Generar y verificar PDF de libro completo; hacer pruebas finales de Android y entregar APK final.

**Conclusión:** los borradores y el arte de 66–108 existen y están integrados al catálogo offline. No equivalen a una traducción crítica ni a una edición terminada.


## Lector y build actualizados — 19-11-2026

Se añadió búsqueda de capítulos (título/número), marcadores guardados en SharedPreferences, persistencia del capítulo, tamaño de letra y modo nocturno, y gesto horizontal para anterior/siguiente. El CI ejecuta tres tests de catálogo y la build APK.

Se refinó el arte SVG de los capítulos 66–70. La comprobación de archivos confirma las copias en los assets Android. La build en commit `e2def78` pasó: workflow 44538335785, artifact debug de 9,194,893 bytes. Sigue siendo una build de desarrollo; no se ha probado en un teléfono real ni es una release final.


## Ambiente y arte refinado — 19-11-2026

Se implementó el sonido celestial de forma procedural (sine-pad con progresión lenta, fade-in/crossfade/release) mediante `AudioTrack`, sin muestras ni archivos de terceros; toggle apagado por defecto, control de volumen, offline, pausa en `onStop` y reanudación en `onStart`. Build/tests de commit `a802f77` pasaron; artifact debug 9,205,699 bytes. La escucha real en dispositivo queda pendiente.

Se refinó el arte de capítulos 66–75 (10 SVG de escenas específicas) y sus copias en assets Android. Los capítulos 76–108 mantienen el arte vectorial de concepto que requiere refinamiento. El CI de commits de arte posteriores a `a802f77` estaba en cola al registrar esto.


## Estado consolidado — 19-11-2026

La sección de progreso confirma ahora: lector offline con búsqueda de título/número, marcadores, progreso/tipografía/modo guardados, swipe y ambiente celestial procedural original. Build/tests de commit `a802f77` pasaron y el artifact debug se generó. Las ilustraciones 66–75 se refinaron; las 76–108 aún requieren mejora. No se ha probado el audio en dispositivo y no existe PDF final.


## Capítulo 66: traducción indirecta provisional

Se añadió una traducción española nueva de 66:1–3 basada en R. H. Charles (1917), desde su inglés. El suplemento `[abide and]` se conserva como `[permanecen y]` y se explica; la frase final sobre alejarse de la presencia de Enoc se mantiene sin armonización. El texto está en `docs/chapters/66_capitulo_66_traduccion_de_trabajo.md` y en el catálogo Android. No se ha cotejado con Ge'ez ni con un aparato crítico; por tanto no es una traducción final.


## Addendum de cotejo — 19 de noviembre de 2026

Se añadieron notas de fuente y límites de evidencia a cada archivo de paráfrasis de 76–108 y se crearon informes separados:

- `docs/auditoria_76-82_fuentes.md` — puertas de vientos, regiones, ciclo solar/lunar, numerales, variante de 81:5 y fragmento 4Q209 82:9–13.
- `docs/auditoria_83-90_fuentes.md` — sueños, Vision of the Beasts, variante aramea más corta del diluvio 89:1b–9, y debate sobre 89:55–58 / 89:59–90:42.
- `docs/auditoria_91-95_fuentes.md` — orden de 91–93, 4Q212, suplemento de 93:11–14 y límites del testimonio en 94–95.
- `docs/auditoria_96-100_fuentes.md` — papyrus griego Chester Beatty-Michigan parcial 97:6–104:13 y lagunas.
- `docs/auditoria_101-105_fuentes.md` — testimonio griego parcial y 4Q204 104:13–105:2; cuidado con 105 y “su hijo”.
- `docs/auditoria_106-108_fuentes.md` — Nacimiento de Noé y testigos fragmentarios; 108 señalado como Ge'ez-only en los testigos consultados.

**Estado actualizado:** los 108 archivos de capítulo existen y 66–108 tienen notas de cotejo documental con referencias y límites explícitos. Estas notas se basan en fuentes secundarias y ediciones digitales revisadas; no constituyen cotejo directo de fotografías ni aparato crítico completo. Los borradores son paráfrasis, no traducción final.

### Ilustración generada
Se guardó `assets/generated/chapter_76_winds_gates_preview.jpg`, una preview IA comprimida de 160×160. No es lámina final de impresión ni está integrada en el lector; el SVG capítulo 76 permanece como recurso de app. Ver `assets/generated/README.md`.

### CI reciente
El CI de los commits de notas falló por un paréntesis de cierre faltante en `LaterEnocContent66_80.kt`, capítulo 66. Se corrigió en `78a256b5d5433821be2063e3001142ecf1532047`. La ejecución de esa corrección todavía debe confirmarse; no se declara build success.

## Revisión incremental — 23 de noviembre de 2026
- Capítulo 94: borrador editorial expandido a 11 unidades por versículo y catálogo Android actualizado. Separación entre 94:1–5 (marco/exhortación) y 94:6–11 (ayes); suplemento 94:7 y frase difícil 94:5 anotados.
- Fuentes: Charles 1917/1912 y extracto digital Stuckenbruck 2007 revisados. La asignación aramea citada de 4Q212 a 94:1–2 es fragmentaria; no se afirma que 94:3–11 esté atestiguado ni que la ausencia de fragmento pruebe inexistencia.
- Arte generado específico de 94 integrado como preview embebido en SVG en editorial y Android; el master 1024×1536 no se ha archivado en GitHub. La calidad de impresión queda pendiente.
- La actualización aún no tiene build CI verificado ni prueba de render en dispositivo.


## Actualización incremental — 24 de noviembre de 2026

- Capítulo 95 ampliado a siete paráfrasis por versículo en `docs/chapters/95_capitulo_95_parafrasis.md` y en el catálogo Kotlin `LaterEnocContent81_95.kt`.
- Se registran explícitamente el suplemento y la expresión dañada de 95:1, y la corrupción textual de 95:2 en Charles 1917; no se reconstruyen las palabras inciertas.
- Se anotó la diferencia de versificación entre Charles 1917 (siete unidades) y la presentación de Charlesworth 1983; no se la etiqueta como variante manuscrita.
- Ilustración específica de 95 generada e integrada como preview 128×192 embebida en SVG para el lector offline. El master 1024×1536 permanece fuera del repositorio y aún no es lámina de imprenta.
- La integración Kotlin y los assets se han modificado, pero esta actualización no tiene todavía un resultado CI verificado ni prueba en dispositivo.


## Actualización incremental — 24 de noviembre de 2026 (capítulo 96)

- El borrador del capítulo 96 se amplió a ocho paráfrasis por versículo y se integró al catálogo offline `LaterEnocContent96_108.kt`.
- La unidad 96:2, que Charles imprime completa entre corchetes, queda marcada como suplemento editorial y separada del núcleo; no se afirma que la marca demuestre por sí sola una interpolación manuscrita.
- Se registran los límites de los testigos consultados: el mapeo secundario de 4Q212 no asigna un fragmento directo a 96 y el papyrus griego Chester Beatty-Michigan XII se cataloga desde 97:6. No hubo inspección de imágenes de manuscritos.
- La ilustración de capítulo 96 permanece como concepto SVG; la ilustración generada específica y su QA siguen pendientes.
- Build CI y prueba en dispositivo de esta integración pendientes.


## Actualización incremental — 25 de noviembre de 2026 (capítulo 97)

- Capítulo 97 ampliado a paráfrasis por unidades y subdivisiones de Charles 1917; catálogo offline actualizado con doce unidades legibles.
- Se anotó la división 97:1–2 / 97:3–6 / 97:7–10 del comentario de Stuckenbruck, la cobertura griega desde mitad de 97:6 y las diferencias de lectura en 97:8–10.
- Ilustración original generada para el tema de la riqueza injusta, integrada como preview SVG de 128×192 con raster embebido de 64×96 en el árbol editorial y Android. MainActivity usa el asset generado en ambos caminos de carga.
- No se inspeccionaron facsímiles ni aparato completo; el borrador es provisional. CI y prueba en dispositivo de esta actualización pendientes.


## Actualización incremental — 25 de noviembre de 2026 (capítulos 97–98)

- Capítulo 97: 13 unidades de lectura; 97:9d y 97:9e conservan la numeración marginal de Charles 1917. Se registran las diferencias etiópico/griego de 97:8–10 y el inicio del papyrus griego a mitad de 97:6.
- Capítulo 98: 16 unidades de lectura. Se anotan la variante “sabios y necios / sabios y no necios” de 98:1, las diferencias de 98:2–3 y las lagunas griegas 98:3b–4a, 98:11b–12a y 98:15.
- Ambos capítulos están integrados en el catálogo offline. Se añadió una prueba de regresión para sus referencias y notas de testigos.
- Se corrigieron las etiquetas de estado provisional de los capítulos 95 y 96 detectadas por CI. Las ejecuciones previas fallaron en el test de estado; la verificación posterior a las correcciones está pendiente.
- La ilustración generada del capítulo 97 está integrada como preview SVG; el capítulo 98 conserva su concepto vectorial específico y requiere refinamiento.
