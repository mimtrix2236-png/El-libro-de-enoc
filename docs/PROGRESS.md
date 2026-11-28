# Seguimiento de producción — Libro de Enoc

Autor de esta edición: **Mauro Iván Maidana**  
Repositorio: https://github.com/mimtrix2236-png/El-libro-de-enoc

## Estado actual — 28 de noviembre de 2026

### Libro
- [x] 108 archivos canónicos consecutivos en `docs/chapters/`; los capítulos 66–108 tienen borradores, pero el grado de detalle no es uniforme y no deben considerarse capítulos críticos terminados.
- [x] Capítulos 102–108 convertidos a paráfrasis por unidades de Charles 1917: 102 (11), 103 (15), 104 (13), 105 (2), 106 (19, orden impreso conservado), 107 (3), 108 (15). Todos siguen provisionales; 66–101 requieren auditoría de uniformidad y cotejo.
- [x] 43 SVG individuales 66–108 y copias Android. Previews generados integrados en 89, 92, 97, 99, 100, 102, 104, 106 y 107; 76 tiene preview registrado. Capítulos 105 y 108 tienen SVG vectorial específico refinado; las ilustraciones 76–108 aún requieren QA artístico. Los previews son recursos de lectura, no masters de impresión.
- [ ] Cotejo crítico Ge'ez/griego/arameo/latín por capítulo; aparato de variantes; apéndices completos; PDF de libro imprimible.
- [ ] Archivar masters de alta resolución y aprobar cada lámina para impresión.

### Aplicación
- [x] Catálogo offline de 108 capítulos; capítulos 102–108 con 11, 15, 13, 2, 19, 3 y 15 unidades provisionales respectivamente.
- [x] Índice, búsqueda por título/número, marcadores por capítulo, persistencia del último capítulo, tamaño de letra y modo nocturno.
- [x] Navegación por swipe horizontal y ambiente celestial procedural opcional/offline.
- [x] CI capítulo 104 (run 46150736913) pasó tests, assembleDebug y upload APK. CI capítulos 105–108 pendientes tras correcciones de regresión.
- [ ] Búsqueda de texto completo, paginación tipo libro, ampliación de ilustraciones, QA UX/dispositivo real, PDF y APK release final.

**Nota:** los registros cronológicos de abajo son snapshots de avances anteriores; si alguna casilla/afirmación contradice este estado actual, prevalece esta sección.

## Avances editoriales

- [x] Estructura editorial inicial y criterios de fuentes
- [x] Guía general de secciones y capítulos
- [x] Capítulo 1 — texto español revisado en sus 9 versículos a partir del ge'ez de Dillmann y cotejo con Charles; aparato crítico todavía en preparación
- [x] Capítulo 2 — traducción de trabajo de 2:1–3 revisada contra Dillmann (ge'ez) y Charles (1917); nota sobre el suplemento discutido de 2:3. Documento: docs/chapters/02.md
- [ ] Capítulos 3–20 — rehacer desde el texto fuente, con todos sus versículos; los textos actuales siguen siendo provisionales
- [x] Capítulos 21–25 — borradores preliminares con notas de verificación e ilustración
- [x] Capítulos 26–30 — borradores preliminares con notas de verificación e ilustración
- [x] Capítulos 31–35 — borradores preliminares con notas de verificación e ilustración
- [x] Capítulos 36–40 — borradores preliminares y notas editoriales
- [x] Capítulos 41–45 — borradores preliminares con notas de cotejo
- [x] Capítulos 46–50 — borradores preliminares y notas de interpretación
- [x] Capítulos 51–55 — borradores preliminares con advertencias de cotejo
- [x] Capítulos 56–60 — borradores preliminares con notas de cotejo
- [x] Capítulos 61–65 — borradores preliminares y notas de cotejo
- [x] Capítulos 66–108 — 43 borradores individuales comprobados; 66 tiene traducción indirecta de trabajo en el lector; 67–108 permanecen como paráfrasis provisionales.
- [ ] Revisión de coherencia y notas documentales
- [x] Glosario preliminar (apéndices todavía pendientes)
- [x] Bibliografía base y protocolo de cotejo registrados (ver docs/bibliografia_fuentes_cotejo.md)
- [ ] Bibliografía verificada capítulo por capítulo
- [x] 43 SVG específicos de capítulos 66–108 existen y están copiados a Android. [ ] Refinar los 33 restantes (76–108) y aprobar calidad final.
- [ ] Edición imprimible

## Estado real de la aplicación (actualizado el 19 de noviembre de 2026)

- [x] Proyecto Android Kotlin/Jetpack Compose.
- [x] Catálogo offline 1–108; capítulos 66–108 en tres catálogos Kotlin.
- [x] Índice y lectura por capítulo, búsqueda por título/número, marcadores por capítulo.
- [x] Persistencia local del último capítulo, tipografía y modo nocturno.
- [x] Navegación anterior/siguiente y swipe horizontal.
- [x] SVG de capítulos 66–108 en assets; 66–75 refinados, resto aún conceptual.
- [x] Ambiente celestial procedural original, opcional y offline.
- [x] Tests de catálogo, build debug y artifact verificados en CI (commit a802f77).
- [ ] Paginación tipo libro, búsqueda de texto completo, ampliar ilustraciones, prueba en teléfono, PDF y APK final.

## Convenciones

El texto de lectura se redacta como paráfrasis literaria original y no se presenta como traducción crítica. La fuente tradicional y los límites textuales se indicarán; fragmentos, reconstrucciones y comentarios se distinguirán. Las ilustraciones siguen la estética acordada: libro rústico marrón, páginas ilustradas semi envejecidas, tinta y tonos tierra.

## Próximo paso

Cotejar borradores con fuentes capítulo por capítulo; producir arte individual e integrar, completar apéndices, app y edición imprimible.

## Registro de integración — 19 de noviembre de 2026

- [x] Capítulos 17–20 añadidos al catálogo del lector Android como paráfrasis literarias identificadas, cada uno con nota editorial y advertencia de cotejo pendiente.
- [x] Ilustraciones vectoriales originales de capítulos 17–20 creadas e integradas (`journey_17`, `columns_18`, `abyss_19`, `archangels_20`).
- [ ] Convertir las paráfrasis 17–20 en unidades versiculares cotejadas; no presentarlas como traducción literal.
- [x] Capítulos 21–35 incorporados al lector como paráfrasis preliminares identificadas, con notas editoriales y cotejo pendiente.
- [x] Ilustraciones vectoriales iniciales de capítulos 21–35 creadas y conectadas a la navegación.
- [ ] Continuar desde el capítulo 36. Las paráfrasis no sustituyen el cotejo de los testigos ni constituyen una traducción crítica.

## Cambio de método editorial — 19 de noviembre de 2026

- Se suspende la incorporación de paráfrasis-resumen como si fueran capítulos terminados.
- La edición definitiva se rehace desde el capítulo 1, versículo por versículo, conservando la numeración de la edición base y registrando suplementos, emendaciones, lagunas y variantes.
- Capítulo 1: primera revisión completa 1:1–9 integrada en la app. Base consultada: Dillmann 1851 (ge'ez), Charles 1917 y descripción del testigo Rylands Ethiopic MS 23, fol. 2r col. a. Pendiente el cotejo directo de todas las fotografías y aparatos críticos; por ello no se etiqueta aún como definitivo.
- Capítulo 2: traducción de trabajo 2:1–3 preparada en documento independiente, con ge'ez de Dillmann 1851, Charles 1917 y nota expresa sobre la cláusula 2:3 que Charles marca como suplemento. Todavía no se ha integrado en EnocContent.kt.
- Capítulos 3–20: sus entradas previas siguen siendo borradores y no se cuentan como traducción final. Deben sustituirse capítulo por capítulo.
- Los capítulos 21–108 quedan en estado provisional hasta ser rehechos con este mismo método. Las paráfrasis existentes no cuentan como traducción final.

## Revisión versículo por versículo — capítulos 3–20 (19 de noviembre de 2026)

Se incorporaron documentos editoriales individuales para los capítulos 3–20:
- Cap. 3: 3:1; capítulo de un solo versículo.
- Cap. 4: 4:1; capítulo de un solo versículo.
- Cap. 5: estructura irregular de Charles con subdivisiones alfabéticas en 5:6 y 5:7. El tramo 5:6d–j permanece sin traducción literal cerrada y está descrito como sección problemática; no se debe considerar completo.
- Caps. 6–20: documentos con numeración de Charles, traducción de trabajo y notas de suplementos, reconstrucciones, nombres y pasajes dudosos.
- Fuentes base consultadas: Dillmann 1851 (ge'ez), Charles 1917 (numeración y siglas editoriales), mapeo fotográfico del Rylands Ethiopic MS 23 y descripción de la evidencia en Online Critical Pseudepigrapha.
- Advertencia general: el texto ge'ez digital de Dillmann no tiene numeración versicular y no es transcripción diplomática del Rylands MS 23. La traducción sigue la segmentación editorial de Charles; las variantes requieren cotejo adicional con Charles 1906, Knibb y los testigos griegos/arameos disponibles.
- Los documentos 03.md–20.md están en docs/chapters/.
- No se declara completada la edición crítica ni la compilación APK.

- [x] Integración en `EnocContent.kt`: capítulos 2–20 reemplazados por entradas versículo por versículo extraídas de sus documentos editoriales. Se conservaron las etiquetas alfabéticas del capítulo 5; su sección 5:6d–j sigue identificada como texto problemático y no como traducción literal cerrada.
- [ ] Revisar compilación Kotlin y probar visualmente la navegación de capítulos 3–20. La actualización del archivo fuente no equivale a una compilación verificada.


## Auditoría de archivos — 19 de noviembre de 2026

- Se inspeccionó el contenido real de `docs/chapters/` mediante la API del repositorio. Antes de este avance, existían archivos de paráfrasis para capítulos 1–65; no había archivos 66–108. La marca anterior de “66–108 preparados” era incorrecta y queda corregida.
- [x] Capítulos 66–71: seis paráfrasis narrativas provisionales creadas como archivos individuales, con idea central, fuente de trabajo, advertencias y una propuesta de ilustración específica.
- [x] Capítulos 66–71: seis ilustraciones SVG originales en tinta sepia/pergamino, específicas de cada capítulo. Son arte vectorial de primera pasada, no ilustraciones finales revisadas ni integradas en la app.
- [ ] Capítulos 72–108: todavía no creados.
- [ ] Revisión/cotejo crítico de 66–71: pendiente; se consultó una reproducción online de R. H. Charles, pero no se cotejaron manuscritos ni aparato crítico. Las paráfrasis no son traducciones exactas.
- Fuentes consultadas para 66–71: R. H. Charles, *The Book of Enoch* (1912), reproducción online en https://rojc.uk/book-of-enoch.htm y https://www.globalgreyebooks.com/online-ebooks/r-h-charles_book-of-enoch_complete-text.html. Consultadas el 19-11-2026.
- La laguna editorial indicada por Charles en 71:13 se conserva como laguna; no se rellena con conjetura.


## Build check and fix — 19 de noviembre de 2026

- GitHub Actions run 104 failed during `compileDebugKotlin`: Java compilation target 1.8 conflicted with Kotlin target 17. This is a real failure, not a successful build.
- [x] Fixed the configuration in `app/build.gradle.kts` by aligning Java source/target and Kotlin JVM target to 17.
- [x] CI run 111 completed successfully for commit `fe2150aae85f70669a5bc27fcc14f34a3b982d3f` after the JVM-target fix (run: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44532471736). This verified compilation for that commit only, not the later chapter 72–77 additions.
- [x] Workflow updated to upload `app/build/outputs/apk/debug/app-debug.apk` as a 30-day artifact; this upload configuration still awaits its own successful run.
- [ ] Latest content build and artifact upload verified.


## Avance astronómico — capítulos 72–77 (19 de noviembre de 2026)

- [x] Capítulos 72–77: paráfrasis narrativas originales añadidas con fuente de trabajo y advertencia de cotejo pendiente.
- [x] Capítulos 72–77: ilustraciones SVG individuales creadas en tinta sepia/pergamino; aún no integradas en Android.
- Fuentes consultadas: R. H. Charles, *The Book of Enoch* (1912), caps. LXXII–LXXVII, https://rojc.uk/book-of-enoch.htm y Global Grey, https://www.globalgreyebooks.com/online-ebooks/r-h-charles_book-of-enoch_complete-text.html. Consulta 19-11-2026.
- [ ] Cotejar los cálculos calendáricos y cosmografía; no modernizar ni armonizar cifras sin aparato crítico.
- [ ] Próxima secuencia de archivos faltantes: capítulos 78–108.


## Avance astronómico — capítulos 78–82 (19 de noviembre de 2026)

- [x] Capítulos 78–82: paráfrasis originales provisionales creadas, con fuente y advertencias sobre cálculos/nombres.
- [x] Capítulos 78–82: SVGs específicos creados, estilo sepia sobre pergamino, aún no conectados al lector Android.
- Fuente consultada: R. H. Charles, *The Book of Enoch* (1912), caps. LXXVIII–LXXXII, https://rojc.uk/book-of-enoch.htm y Global Grey, https://www.globalgreyebooks.com/online-ebooks/r-h-charles_book-of-enoch_complete-text.html; 19-11-2026.
- [ ] Cotejo de nombres de luminares, cifras del calendario, tablas celestiales y orden de secciones.
- [ ] Próxima secuencia pendiente: capítulos 83–108.


## APK artifact — 19 de noviembre de 2026

- [x] Workflow updated to package the debug APK artifact; run 117 succeeded for commit `274c0fc8b0316d857cf50492eca9263ed6320471`.
- Artifact verified: `el-libro-de-enoc-debug-apk`, 9,114,756 bytes, expires 19-12-2026. Artifact ZIP: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44532838183
- This APK proves the Kotlin app compiled at that commit; the current app content is still partial and does not yet contain all 108 chapters. This is an intermediate build, not the final delivery.
- [ ] Latest source through chapter 82 must be rebuilt and its artifact verified before this checkpoint can be considered current.


## Avance — Visiones de los Sueños, capítulos 83–88 (19 de noviembre de 2026)

- [x] Capítulos 83–88: paráfrasis narrativas originales creadas y señaladas como provisionales.
- [x] Capítulos 83–88: seis ilustraciones SVG específicas creadas en estilo sepia/pergamino.
- Fuentes consultadas: R. H. Charles, *The Book of Enoch* (1912), caps. LXXXIII–LXXXVIII, reproducción en https://rojc.uk/book-of-enoch.htm y pasajes consultados en https://adfonteslibrary.org/work-st-pseudepigrapha-1-enoch; consulta 19-11-2026.
- [ ] Cotejar secuencia, símbolos de animales/estrellas y variantes. No asignar identidades históricas definitivas en estas paráfrasis.
- [ ] Próximos archivos faltantes: capítulos 89–108.


## Build checkpoint through chapter 82 — 19 de noviembre de 2026

- [x] CI run 122 completed successfully for commit `656be007498839006cf30c2bdf387e7cc65a52c5`: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44533080957
- [x] Debug APK artifact exists: `el-libro-de-enoc-debug-apk`, 9,114,758 bytes, expires 19-12-2026. Run link: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44533080957
- The app source still only includes the earlier partial chapter catalog; this build is an intermediate compile/artifact, not the complete reader or final APK.

## Audit — 19 November 2026

- [x] 88 individual chapter-paraphrase files exist in `docs/chapters/`, numbered 1–88 consecutively.
- [x] 23 individual SVG chapter illustrations exist in `assets/illustrations/`, numbered 66–88 consecutively.
- [ ] Chapters 89–108 and their illustrations are still missing.
- [ ] The chapter text remains provisional; sources have been consulted online but no complete manuscript-by-manuscript critical collation has been done for these batches.
- [ ] The reader app has not yet integrated chapters 36–88 or these new SVGs; the PDF has not been produced.


## Avance — capítulos 89–94 (19 de noviembre de 2026)

- [x] Capítulos 89–94: paráfrasis provisionales y originales creadas, con fuentes de trabajo y notas de orden/división textual.
- [x] Capítulos 89–94: seis ilustraciones SVG individuales, estilo sepia/pergamino.
- Fuentes consultadas: R. H. Charles, *The Book of Enoch* (1912), caps. LXXXIX–XCIV, reproducción en https://rojc.uk/book-of-enoch.htm; https://fishtheright.com/writings/enoch/92/; https://scriptura.si/works/enoch-1-charles-1917/91/; consulta 19-11-2026.
- [ ] Cotejar la historia alegórica de 89–90 y las semanas 91/93; respetar la división de Charles (92 antes de 91; 91:12–17 colocados con 93) sin asumir que es el orden original.
- [ ] Próximos archivos faltantes: capítulos 95–108.


## Avance — capítulos 95–100 (19 de noviembre de 2026)

- [x] Capítulos 95–100: paráfrasis originales provisionales creadas, con fuente de trabajo y advertencias.
- [x] Capítulos 95–100: seis ilustraciones SVG específicas en tinta sepia sobre pergamino.
- Fuente consultada: R. H. Charles, *The Book of Enoch* (1912), caps. XCV–C, reproducción en https://rojc.uk/book-of-enoch.htm; consulta 19-11-2026.
- [ ] Cotejar suplementos, lecturas corruptas y subdivisiones de 95–100 con edición crítica y testigos.
- [ ] Próximos archivos faltantes: capítulos 101–108.


## Avance — capítulos 101–106 (19 de noviembre de 2026)

- [x] Capítulos 101–106: paráfrasis provisionales creadas con fuente de trabajo y notas.
- [x] Capítulos 101–106: seis ilustraciones SVG individualizadas.
- Fuente consultada: R. H. Charles, *The Book of Enoch* (1912), caps. CI–CVI, https://rojc.uk/book-of-enoch.htm; consulta 19-11-2026.
- [ ] Cotejar las referencias a Sheol, los libros, “su hijo”, y el fragmento noánico 106; no resolver interpretaciones doctrinales ni reconstrucciones sin testigos.
- [ ] Próximos archivos faltantes: capítulos 107–108.


## Cierre de borradores de capítulos 1–108 — 19 de noviembre de 2026

- [x] Capítulos 107–108: paráfrasis originales provisionales y fuente registrada.
- [x] Capítulos 107–108: dos ilustraciones SVG específicas creadas.
- Fuentes consultadas: R. H. Charles, *The Book of Enoch* (1912/1917), caps. CVII–CVIII; https://rojc.uk/book-of-enoch.htm (107) y https://apocryphalibrary.weebly.com/1-enoch-108.html; https://ambientbible.com/read/1-enoch/108 (108), consulta 19-11-2026.
- [x] Auditoría de nombres de archivo: 108 documentos consecutivos 1–108 en `docs/chapters/`.
- [x] Auditoría de arte: 43 SVG individuales consecutivos para capítulos 66–108 en `assets/illustrations/`.
- [ ] Las 108 paráfrasis NO son traducción crítica ni están cotejadas íntegramente con manuscritos. Las lagunas y variantes solo se anotaron en varios casos; falta una revisión sistemática.
- [x] Capítulos 36–108 y SVG 66–108 integrados en lector/assets. [ ] PDF de libro completo todavía no creado.


## Auditoría de continuidad 66–108 — 19 de noviembre de 2026

- [x] Se comprobó el árbol de GitHub: 108 archivos canónicos consecutivos en `docs/chapters/`, sin huecos.
- [x] Capítulos 66–108: 43 archivos individuales con paráfrasis provisional, notas editoriales, fuente de trabajo e idea de ilustración.
- [x] Arte: 43 SVG capítulo-específicos en `assets/illustrations/` y 43 copias coincidentes en `app/src/main/assets/illustrations/`.
- [x] Catálogo Kotlin: capítulos 66–80, 81–95 y 96–108 incluidos en `EnocContent.chapters`; el contenido está empaquetado para uso offline.
- [x] Se corrigieron cierres de paréntesis faltantes en los 73 registros `ChapterEntry` de los catálogos 36–108. El CI del commit `613cd34` terminó con éxito y subió el artifact `el-libro-de-enoc-debug-apk` (9,180,825 bytes): https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44536929563.
- [x] Se añadieron referencias de Charles/Global Grey a las notas de app de capítulos 72–77 (commit `645837c`); CI terminó con éxito.
- [ ] Cotejo crítico capítulo por capítulo y revisión versicular; la traducción histórica de Charles es una fuente de trabajo, no un aparato crítico suficiente por sí sola.
- [ ] Revisión visual de las 43 SVG: son dibujos vectoriales de concepto, no ilustraciones finales de calidad editorial.
- [x] Ambiente celestial procedural integrado; [ ] pruebas de dispositivo, funciones restantes, PDF y revisión final.

**Fuentes de referencia:** R. H. Charles, *The Book of Enoch* (1912; edición SPCK 1917), eBook Project Gutenberg #77935, https://www.gutenberg.org/ebooks/77935 y https://www.gutenberg.org/cache/epub/77935/pg77935-images.html; Global Grey, https://www.globalgreyebooks.com/online-ebooks/r-h-charles_book-of-enoch_complete-text.html; Online Critical Pseudepigrapha, https://pseudepigrapha.org/reader.html?doc=1En.xml (la página informa transición de plataforma; el lector no mostró texto en esta revisión). Consultado el 19-11-2026.


## Mejoras del lector y arte — 19 de noviembre de 2026

- [x] Se agregó búsqueda por título o número de capítulo en el índice.
- [x] Marcadores de capítulo guardados/restaurados localmente.
- [x] Guarda el último capítulo leído, tamaño de letra y modo nocturno en preferencias locales.
- [x] Navegación por gesto horizontal: deslizar a la izquierda avanza; a la derecha retrocede.
- [x] Tres pruebas unitarias del catálogo (108 capítulos en orden, texto no vacío y paráfrasis 66–108 marcadas) añadidas; CI ejecutó las pruebas y la compilación con éxito.
- [x] Ilustraciones SVG 66–70 refinadas con escenas más detalladas y específicas, en pergamino/sepia, duplicadas en los assets Android.
- [x] Compilación y artifact debug verificados en commit `e2def78`: workflow 44538335785, tests, `assembleDebug` y upload-artifact completados; APK artifact 9,194,893 bytes. Link: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44538335785.
- [ ] El artifact es una build de desarrollo, no una release final; todavía faltan pruebas de dispositivo, revisión de navegación/UI, cotejo crítico y PDF.


## Ambiente celestial y nuevas láminas — 19 de noviembre de 2026

- [x] Ambiente celestial procedural original (sintetizado con AudioTrack, sin samples/archivos de terceros), interruptor apagado por defecto y volumen.
- [x] Audio offline; se pausa al detenerse la actividad y se reanuda al volver; se detiene al cerrar el lector.
- [x] Build/tests de CI en commit `a802f77` exitosos; APK debug artifact de 9,205,699 bytes: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44539201507. La escucha en teléfono aún no se ha probado.
- [x] Arte SVG detallado revisado/refinado para capítulos 66–75 (10 escenas) y copias de app.
- [ ] Build del commit de arte posterior y prueba física del sonido pendiente; los capítulos 76–108 siguen con SVG conceptuales más simples.


## Corrección del estado de audio/build y arte — 19-11-2026

El ambiente celestial ya está implementado en Kotlin; no es solo una especificación. CI de commit `a802f77` verificó tests, `assembleDebug` y upload-artifact. Las ilustraciones 66–75 refinadas están en ambos árboles de assets. Las commits posteriores `ceef01f` (arte 74–75) y `0364ab4` (documentación) tenían workflows en cola al momento de este ajuste.


## Traducción de trabajo del capítulo 66 — 19 de noviembre de 2026

- [x] Capítulo 66: 3 unidades versiculares traducidas al español desde R. H. Charles 1917 (traducción indirecta desde inglés); suplemento [abide and] preservado entre corchetes; lectura inusual “me alejé de la presencia de Enoc” no armonizada y señalada.
- [x] Documento separado `docs/chapters/66_capitulo_66_traduccion_de_trabajo.md` y contenido integrado al catálogo Android.
- [ ] Cotejo directo con Ge'ez/arameo y aparato crítico; esta traducción no es final.


## Auditoría rápida de continuidad — capítulos 6–10 (19 de noviembre de 2026)

- [x] Verificados los cinco documentos individuales en GitHub: 06.md–10.md.
- [x] La numeración de trabajo coincide con Charles: cap. 6 (8 unidades), 7 (6), 8 (4), 9 (11), 10 (22); total 51 unidades versiculares documentadas.
- [ ] Este conteo estructural no equivale a cotejo crítico completo. Las notas editoriales de cada capítulo siguen indicando pendientes (nombres, variantes, suplementos y pasajes difíciles).
- [ ] Próximo trabajo: verificar el texto de cada unidad contra los testigos/ediciones disponibles, registrar diferencias y revisar su integración Android antes de marcar cualquier capítulo como final.


## 20 November 2026 — Source audit and chapter 106 art

- [x] Revised chapter 106–108 provisional paraphrases by narrative ranges and clarified manuscript limits.
- [x] Corrected chapter 108's source: a 1912 Charles reproduction previously cited does not include 108; the working citation now points to Charles SPCK 1917, Project Gutenberg #77935, and Open Scroll.
- [x] Recorded published partial assignments: 4Q204 104:13–106:2 and 106:13–107:2; Greek Chester Beatty–Michigan XII 106:1–107:3; Latin Royal Ms. 5 E XIII 106:1–18. No direct photos or critical apparatus were collated.
- [x] Separated a reported 106:19–107:1 fragment with unverified archaeological provenance from secure Qumran evidence.
- [x] Generated a chapter-specific Noah-birth illustration and embedded a 160×240 PNG preview in SVG; integrated it into Android's chapter-106 viewer. Original vector concept preserved. Preview is not print master.
- [ ] Rebuild after today's source and app changes; previous verified CI run 299 was commit efc00173564331d1bc3bcfe0822307639368698a, APK artifact 9,218,655 bytes. It is not a verification of today's commit.
- [ ] Full 1–108 source/variant audit, visual QA, complete PDF and final APK remain outstanding.


## 20 November 2026 — Build verification after chapter 106 art

- [x] CI run 312, commit ebdd9e2de0f7ed723bea6f2bbdf3a2d253f0e8a3, completed successfully: catalog unit tests, assembleDebug, and artifact upload.
- [x] Debug APK artifact verified: 9,229,448 bytes; run https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44743101905; expires 20 Dec 2026 13:18 UTC.
- [x] GitHub tree checked: 108 consecutive chapter draft files, 43 chapter-specific SVGs for 66–108, and generated chapter 106 preview present in source and app assets; MainActivity references the special asset in both WebView load paths.
- [ ] No physical-device test of WebView artwork or audio. This is a debug/intermediate APK, not a final release. Full PDF and critical review 1–108 remain pending.


## 20 November 2026 — Integrate chapter 106–108 revisions in Android catalog

- [x] The offline reader catalog now has four narrative ranges for 106, three units for 107, and four ranges for 108 instead of one generic unit per chapter.
- [x] Added source/witness caveats, the generated chapter 106 preview reference, and the Ge'ez-only transmission note for chapter 108.
- [x] Added regression test for the chapter ranges and evidence notes. New CI pending.


## 20 November 2026 — CI after chapter 106–108 catalog integration

- [x] CI run 317, commit ff195efe91850f5c3625c79805dc71b43f166e5f: catalog unit tests, assembleDebug, and artifact upload all succeeded. Debug APK 9,229,830 bytes: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44743708994.
- [x] CI run 320, commit bf53c357b74a38f5a5572982706f070c36abd221 (includes subsequent documentation updates): successful; debug APK artifact 9,229,829 bytes; run https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44743746076; expires 20 Dec 2026 13:24 UTC.
- [ ] Runtime/device testing remains outstanding; debug artifacts are temporary, not final release.


## 21 November 2026 — Chapter 107 source review and generated art preview

- [x] Checked the chapter 107 text in R. H. Charles 1917 (Wikisource and CCEL) and consulted the available Marquette/MAQOM textual notes for 107:1. This is source consultation, not direct manuscript collation.
- [x] Revised `docs/chapters/107_capitulo_107_parafrasis.md` into three narrative/verse units; recorded preliminary lexical variants and the unresolved witness sigla; clarified that Enoc's instruction is to Methuselah and that Methuselah communicates to Lamech and names the child.
- [x] Added `assets/illustrations/chapter_107_generated.svg` (120×180 embedded JPEG preview) and a copy under Android assets. Preserved the original vector concept `chapter_107.svg`.
- [x] Updated the reader's asset routing so chapter 107 uses the generated preview, updated illustration/chapter indexes, and added the 107 focused audit to `docs/auditoria_106-108_fuentes.md`.
- [x] Relevant commits: `760b346` (docs preview), `ed92dc5` (Android asset), `de6d4af` (routing), `56dc016` (paraphrase), `fea17c6` (audit), `96b502c` (illustration README), `9ad0d83` (chapter index).
- [ ] CI run 330 for commit `9ad0d83` is pending/in progress at log update: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44910458123. No build success is claimed for these changes yet.
- [ ] Generated 1024×1536 source image remains in the working session only; repository preview is thumbnail quality and not a print master. Physical-device visual/audio checks, full critical collation, PDF and final release APK remain outstanding.


## 21 November 2026 — Focused source review of chapters 66–67

- [x] Rechecked Charles 1917 chapter 66 (three verses) and chapter 67 (thirteen verses) in two accessible transcriptions; retained the unusual closing line of 66 without harmonization.
- [x] Revised the chapter 67 paraphrase into four ranges (67:1–3, 4–7, 8–10, 11–13), distinguishing the “wooden (building)” editorial supply from the contextual identification as ark.
- [x] Recorded translation/numbering differences: Charles 1917 chapter 66/67 correspond to Laurence 1883 chapters 65/66 in the comparison source; chapter 67:8 wording differs between translations. No manuscript variant is claimed from these English comparisons.
- [x] Added `docs/auditoria_66-75_fuentes.md` with source links and explicit limits: no direct Ge'ez, Aramaic fragments, facsimile or full apparatus collation.
- [ ] Chapters 68–71 remain next for focused source/variant review; chapters 1–108 still not fully critically audited.
- [ ] No new build result claimed for the current branch yet; CI runs 330–332 were in progress/queued at last check. Verify the run on the latest app-code commit.


## 21 November 2026 — CI completed for chapter 107 artwork routing

- [x] GitHub Actions run 330 on commit `9ad0d832132e9e20209290426dc00f65e90ba15f` succeeded: catalog unit tests, `assembleDebug`, and artifact upload. APK artifact 9,234,500 bytes; expires 21-12-2026 13:46 UTC. https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44910458123
- [x] Run 332 on commit `641df2c78962fd37dcda37921800124d2f24202d` also succeeded, with the same test/build/upload steps. APK artifact 9,234,499 bytes; expires 21-12-2026 13:47 UTC. https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44910515601
- [ ] Run 333–335 (chapter 67 text/audit/progress commits) were still in progress when checked. They contain no app-code changes after run 332; wait for completion to confirm latest documentation commits also pass workflow.
- [ ] No physical-device or release/signing verification.


## 21 November 2026 — Chapter 68 source review

- [x] Rechecked the five verse units of Charles 1917 chapter 68 in accessible transcriptions and revised the paraphrase into 68:1, 2–3, and 4–5.
- [x] Recorded transmission note: the Book of Parables (37–71) has no known Qumran fragments; the absence is debated in scholarship and is not treated as proof of a specific date or provenance. Added Devorah Dimant (2005) and Marquette/MAQOM reference links.
- [x] Added chapter 68 notes to `docs/auditoria_66-75_fuentes.md` (now covers 66–68). Charles/Lawrence numbering differences are tracked; no Ge'ez, Greek, Aramaic manuscript or apparatus direct collation claimed.
- [ ] Chapter 69 is next; 68 remains provisional until critical edition and manuscript checks.


## 21 November 2026 — Chapter 69 source and editorial-mark review

- [x] Rechecked Charles 1917 chapter 69 (29 verse units) and revised the paraphrase into ranges: names/ranks, angelic teachings, oath/name, cosmic order, and final judgment.
- [x] Verified Charles's bracket key in the preface (p. xxiv): square brackets mark interpolations. Recorded the bracketed name list (69:2), clauses 69:22–24, and 69:25 wording. This is Charles's editorial mark, not a manuscript collation.
- [x] Kept Biqa/Akae forms at 69:13/15 distinct pending original-language review; added chapter 69 notes to the audit file.
- [ ] Chapter 69 still provisional; chapter 70 is next. Direct Ge'ez/critical apparatus review remains outstanding.


## 21 November 2026 — Chapter 70 translation comparison

- [x] Rechecked Charles 1917 chapter 70 (four verses) and revised the paraphrase, leaving the subject/pronoun ambiguity in 70:1–2 open rather than asserting Enoch's name or the Son of Man as the referent.
- [x] Compared the English syntax in Charles 1917 and Laurence 1883; noted differences in “his name,” “chariots of the spirit,” “vanished/went forth,” and “two winds/two spirits” as translation differences only.
- [x] Added chapter 70 to the audit document (now 66–70); sources consulted online, no Ge'ez or apparatus collation.
- [ ] Chapter 71 next; chapter 70 remains provisional pending critical text review.


## 21 November 2026 — Chapter 71 critical note: Charles emendation

- [x] Rechecked Charles 1917 chapter 71 and revised the paraphrase to mark the lost passage at 71:13 as Charles's conjecture, not preserved text.
- [x] Recorded that Charles 1912/1917 emends 71:14 to third person and extends pronoun changes to 71:15–16. Published notes consulted (Intertextual Bible summarizing Nickelsburg/VanderKam 2012, pp. 321, 327–328) report second-person Ge'ez and no manuscript support known for Charles's third-person emendation. No Ge'ez manuscript was inspected directly; article/capitalization and identity debate remain open.
- [x] Added chapter 71 entry to the audit file (now 66–71) and updated its paraphrase with attribution and limits.
- [ ] Chapter 72 is next. The Parables lack known Qumran/Greek witnesses; critical checks for 71 remain.


## 21 November 2026 — Chapter 72 source and calendar review

- [x] Expanded chapter 72 paraphrase from a brief summary into 72:1–7, 8–14, 15–20, 21–26 and 27–37, recording the gate sequence and day/night parts in Charles 1917.
- [x] Added Qumran transmission context: 4Q208–4Q211 are related Aramaic Astronomical Book witnesses; 4Q208 has synchronistic lunar-calendar material and 4Q209 parallels portions 76–79/82. No direct witness for 72:1–37 was identified in consulted sources; direct collation remains pending.
- [x] Renamed the audit file to `docs/auditoria_66-75_fuentes.md` to reflect its expanded coverage and removed the obsolete filename.
- [ ] Chapter 73 next; verify lunar calculations and textual variants with Drawnel/DJD 36 before interpreting.


## 21 November 2026 — Chapter 73 lunar-cycle review

- [x] Expanded chapter 73 paraphrase to all eight verse units, recording first visibility on the 30th morning and the fractional growth sequence without normalizing the confusing numbers.
- [x] Consulted Charles 1917, Duke/Goff (2014), and a review of Drawnel (2011); recorded that 4Q208–4Q209 contain lunar-calendar material but 73:4–8 is not directly preserved in the fragments identified by these sources and reconstruction depends on Ethiopic/formulaic parallels.
- [x] Renamed the audit file to `docs/auditoria_66-75_fuentes.md` and removed the prior path.
- [ ] Chapter 74 next; review lunar cycle arithmetic, fragment coverage, and version differences without filling gaps.


## 21 November 2026 — Chapter 74 multi-year calendar review

- [x] Expanded chapter 74 into 74:1–4, 5–9, 10–12, and 13–17, recording the five/eight-year counts without “correcting” the text.
- [x] Checked Charles 1917: solar totals 1,092/1,820/2,912 days for 3/5/8 years; lunar totals 1,062/1,770/2,832; the model's deficits are 30 days in five years and 80 in eight. Editorial bracket notes at 74:14/16 are flagged.
- [x] Added the 74 source audit and renamed the audit file to `docs/auditoria_66-75_fuentes.md`.
- [ ] Chapter 75 next; review intercalary days and the 364-day count with source/variant notes.


## 21 November 2026 — Chapter 75 intercalary-day review

- [x] Expanded chapter 75 paraphrase into 75:1–3, 4–7, 8–9; documented the four special days, 364 stations, twelve solar portals, and celestial chariots.
- [x] Preserved Charles's bracketed clause in 75:5 as an editorial addition; left the relation of the four special days to the 364-day year unresolved.
- [x] Added audit note and renamed the source audit to `docs/auditoria_66-75_fuentes.md`.
- [ ] Chapter 76 next; review wind portals, cardinal directions, and weather effects with source notes; direct Qumran collation remains pending.


## 21 November 2026 — Chapter 76 marker and asset verification

- [x] Corrected chapter 76 note: Charles/Open Scroll marks the north/south wording in 76:3 with damage signs (†) and inserts `[after those on the left]`; 76:12 has `[four]` marked as later addition. The paraphrase does not adopt these as secure text.
- [x] Verified the generated preview path `assets/generated/chapter_76_winds_gates_preview.jpg` exists (5,799 bytes, 160×160 per asset README), but it is not integrated in the Android reader; the app still uses the SVG concept.
- [x] Checked Machiela (2023) 4Q210 profile: fragmentary text from the Astronomical Book overlaps chapters 76–78; the overlap is partial and reconstructed, not a witness to the whole chapter.
- [ ] Chapter 77 next; source review of direction names/etymologies and the damaged river/sea description.


## 21 November 2026 — Chapter 77 fragment mapping and editorial signs

- [x] Rechecked Charles 1917 chapter 77 in Open Scroll; confirmed damaged `†west†` (77:5), restored `‹two of them to›` and later addition `[and some say: into the desert]` (77:7).
- [x] Checked Machiela 2023, Brill profile for 4Q209/4Q210: 4Q209 23.5–8 // 4Q210 1ii15–18 corresponds to 77:2–3; 4Q209 frg.23 relates to 76:13–77:4. This is fragmentary overlap, not a witness to chapter77 in full.
- [x] Updated chapter77 paraphrase and audit 76–82 to correct mapping and editorial signs. Direction etymologies remain open; no direct Ge'ez/Aramaic manuscript collation.
- [ ] Chapter 78 next; review names and lunar fractions against Charles and 4Q210 frg.1iii.


## 21 November 2026 — Chapter 78 numbering and fragment audit

- [x] Corrected chapter 78 note: Charles's printed scan has section title LXXVIII but a `CHAPTER LXXVII` heading (numeration typo); Open Scroll uses 78.
- [x] Distinguished Charles's double brackets in 78:6 (Ethiopic-only per Charles's key) from the single-bracket interpolation at 78:11; Open Scroll simplifies the 78:6 mark, so scan is preferred for signs.
- [x] Clarified Qumran mapping: Machiela 2023 supports broad 4Q210 overlap with 76–78; the exact 1iii→78:6–8 concordance is secondary/provisional. 4Q208 has calendrical material; 78:6–17 is an abbreviated Ethiopic extract, not a direct 4Q208 witness. 4Q209 frg.26 78:17–79:2 remains tentative.
- [x] Updated chapter 78 and audit 76–82; no manuscript collation claimed.
- [ ] Chapter 79 next; check the 177-day count and Charles's restoration marks.


## 21 November 2026 — Chapter 79 restoration scope and arithmetic

- [x] Reviewed Charles 1917 chapter 79: 79:4 restores only `<the waning>` to connect the sentence; the 177-day total and 25 weeks + 2 days are recorded.
- [x] Verified 177 = 3×30 + 3×29 from 78:15–16; consistency does not validate the restoration. Left “one period” in 79:5 undefined rather than attaching it to a 5- or 8-year cycle.
- [x] Corrected the fragment note: 4Q209 frg.26 is tentative at 78:17–79:2 and is not used as direct witness for 79:3–6.
- [ ] Chapter 80 next; review the prediction of disorder and editorial brackets, avoid historicizing it as a scientific forecast.


## 21 November 2026 — Chapter 80 editorial-mark review

- [x] Rechecked Charles 1917 chapter 80 and clarified its apocalyptic framing (cosmic/seasonal disorder as judgment, not scientific forecast).
- [x] Recorded the bracketed scene at 80:5, Charles's `+on the extremity of the great chariot+` correction, and the interpolated phrase at 80:7; kept them out of the secure paraphrase.
- [x] Updated chapter 80 and audit 76–82. No direct Aramaic witness for 80 is assigned in the consulted 4Q208–211 profiles.
- [ ] Chapter 81 next; review the heavenly tablets, numerals, and “seven saints/three” variant without choosing by guess.


## 21 November 2026 — Chapter 81 numeral variant

- [x] Rechecked Charles 1917 chapter 81 and the accessible Theosis/Dillmann digital text. The phrase at 81:5 appears as “seven holy ones” in Charles and “three” in the Dillmann digital text/modern translation source; the exact manuscript distribution is not verified.
- [x] Revised the chapter and audit to avoid attributing either numeral to a specific manuscript without direct collation; the paraphrase leaves it out.
- [ ] Chapter 82 next; review transmission of books, intercalary days, calendar and the fragment 4Q209 frg.28 without overstating overlap.


## 21 November 2026 — Chapter 82 numbering and fragment audit

- [x] Corrected the chapter 82 paraphrase: Charles 1917 skips from verse 13 to 15; the previous draft incorrectly renumbered 15–20 as 14–19. The gap is preserved; no verse 14 invented.
- [x] Checked fragment mapping: 4Q209 frg.28 corresponds to 82:9–13 according to Tyndale Bulletin 68.2 (2017) table; 4Q204 1vi.9 is a thematic parallel for book-transmission, not a direct witness to 82:1–3.
- [x] Updated chapter 82 and audit 76–82, recording the bracketed clause at 82:2 and the limits of fragment evidence.
- [ ] Chapter 83 next; review dream-before-marriage frame and the collapsed heaven without interpreting it as literal history.


## 25 de noviembre de 2026 — Capítulo 97 y arte generado

- [x] Reescrito `docs/chapters/97_capitulo_97_parafrasis.md` como paráfrasis original por unidades: 97:1–7, 97:8a–b, 97:9a–c, 97:9d, 97:9e y 97:10.
- [x] Revisada la estructura del capítulo con Stuckenbruck: consuelo a los justos (97:1–2), advertencia sobre el juicio (97:3–6) y ayes contra la riqueza injusta (97:7–10).
- [x] Registrados los límites del papyrus griego Chester Beatty–Michigan XII (comienza en medio de 97:6), las diferencias griego/Ge'ez en 97:8–10 y la numeración editorial 9d/9e de Charles 1917. No se afirma colación directa de manuscritos ni aparato completo.
- [x] Integradas las unidades al catálogo offline `LaterEnocContent96_108.kt`; el lector muestra ahora las subdivisiones y notas de 97.
- [x] Generada una ilustración específica de 97 e integrada como preview SVG de 128×192 con raster embebido de 64×96 en los árboles editorial y Android; MainActivity selecciona el asset generado en los dos caminos de carga. El concepto vectorial previo se conserva.
- [ ] CI de estos cambios pendiente de verificación; no se afirma build success. Master de alta resolución aún no archivado como lámina de impresión; QA en teléfono real pendiente.


## 25 de noviembre de 2026 — Capítulos 97 y 98

- [x] Capítulo 97: paráfrasis por unidades, 13 entradas en catálogo Android, con la subdivisión 97:9d/9e de Charles 1917 y las diferencias de transmisión en 97:8–10 registradas.
- [x] Ilustración específica generada para 97 e integrada como SVG 128×192 con raster 64×96 en los árboles editorial y Android; selector de MainActivity actualizado en ambos caminos de carga. El SVG conceptual anterior se conserva.
- [x] Capítulo 98: paráfrasis por los 16 versículos, con variantes de 98:1–3 y lagunas griegas 98:3b–4a, 98:11b–12a y 98:15 anotadas. Catálogo Android actualizado con 16 entradas.
- [x] Añadida prueba de regresión para las unidades y notas de testigos de 97–98. Se detectaron etiquetas de estado no conformes en 95 y 96; se corrigieron para que todos los capítulos 67–108 conserven la marca `Paráfrasis provisional`.
- [x] CI run 45631047654, commit `f5ca50a16c5efa6d63943931e6619dfa8c8d74b6`: tests de catálogo, `assembleDebug` y subida del artifact finalizaron correctamente. APK debug: 9.269.933 bytes; [workflow](https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/45631047654); artifact temporal, expira 25-12-2026 14:10 UTC. Esta verificación cubre el código hasta ese commit; no es APK release ni prueba física.
- [x] Refinado el SVG vectorial del capítulo 98: dos ricos con vestiduras y metales, mesa de lujo, libro de registro, vecino humilde y horno simbólico; se actualizó la copia Android.
- [ ] QA de las ilustraciones 76–108, prueba física y masters de imprenta pendientes.


## 26 de noviembre de 2026 — Capítulo 100 y arte generado

- [x] Reemplazado el resumen único del capítulo 100 por 13 paráfrasis originales, organizadas según los 13 versículos de Charles 1917.
- [x] Añadidas notas sobre el carácter visionario de las imágenes de sangre, el sentido abierto de 100:4 y 100:5, y la personificación de la creación en 100:10–13.
- [x] Delimitada la evidencia sin exagerarla: la vista previa introductoria de Stuckenbruck sitúa el papiro griego Chester Beatty–Michigan XII en 97:6–104:13, rango que abarca 100, pero no demuestra preservación continua de cada verso. El mapa resumido de 4Q212 y 4Q204 no asigna fragmento arameo directo a 100.
- [x] Generada una ilustración específica del capítulo 100 e integrada en los dos SVG offline como preview 128×192; guardado también el JPEG de preview. El antiguo SVG conceptual se preservó con nombre separado.
- [x] Actualizado el catálogo Android a 13 unidades versículo por versículo y añadida una prueba de regresión para numeración, estado provisional y límites de testigos.
- [ ] CI del nuevo commit pendiente de resultado; no se declara compilación verificada hasta consultar Actions.
- [ ] Master 1024×1536 y QA de impresión, cotejo directo de Ge'ez/papiro y pruebas en dispositivo real pendientes.

- [x] Corrección de QA: el primer test de capítulo 100 consultaba la nota editorial en lugar de la nota crítica, donde el catálogo guarda la ruta de ilustración. Se ajustó la aserción para comprobar el campo correcto; nueva CI pendiente.


## 26 de noviembre de 2026 — Verificación del capítulo 100 y capítulo 101

- [x] CI para el capítulo 100 y su corrección de prueba: run 45835679787, commit `abd6847d3eec2f2b7889c8138eebb6aef6e61f9c`. Pasaron las pruebas del catálogo, `assembleDebug` y la subida del APK.
- [x] Artifact debug verificado: `el-libro-de-enoc-debug-apk`, 9.279.382 bytes, SHA-256 `342ceea96016c735b1a065f3ca94760e025a4d8959a26a4ed92e55fa97bee152`; expira el 26-12-2026 14:07 UTC. [Workflow](https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/45835679787).
- [x] Capítulo 101: reemplazado el resumen único por nueve paráfrasis originales siguiendo Charles 1917; añadidas notas sobre «hijos del cielo», lluvia/rocío y el mar como imágenes del discurso, sin convertirlas en afirmaciones científicas.
- [x] Capítulo 101: actualizado el catálogo Android con nueve unidades y añadida prueba de regresión.
- [x] Capítulo 101: creada una ilustración vectorial original específica de navegación en mar agitado, con costa arenosa y Enoc observando; integración offline en preparación dentro de este commit.
- [x] CI run 45836262085, commit `eb64b71d528ea0f823cc232e29920916bc883879`: pruebas del catálogo, `assembleDebug` y subida del artifact finalizaron correctamente. [Workflow](https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/45836262085).
- [x] Artifact debug `el-libro-de-enoc-debug-apk`: 9.281.465 bytes; SHA-256 `ee164b285e333f27e377109a2a081d195f2990d53abbed24ae932d4437d4c884`; expira el 26-12-2026 14:11 UTC. Es una compilación debug, no release firmado ni prueba física.
- [ ] Cotejo de manuscritos, QA en dispositivo y arte final de impresión pendientes.


## Avance incremental — 27 de noviembre de 2026

- [x] Capítulo 102: reemplazado el resumen único por once paráfrasis originales, una por unidad de Charles 1917; no se presenta como traducción literal.
- [x] Capítulo 102: nota textual ampliada tras consultar la transcripción de Charles 1917 en Scriptura, la transcripción OCR de The Book and Me y la reproducción del texto griego del Chester Beatty–Michigan XII. Se registran la lectura corrupta de 102:3, Sheol/Hades en 102:5 y la diferencia sustantiva de 102:8 y 102:10–11. No se inspeccionaron fotografías ni aparato crítico completo.
- [x] Capítulo 102: ilustración generada específica integrada en `assets/illustrations/chapter_102.svg` y `app/src/main/assets/illustrations/chapter_102.svg`; raster embebida 64×96, mostrada a 128×192. El concepto vectorial previo se preservó en `chapter_102_vector_concept.svg` en ambos árboles.
- [x] Catálogo offline actualizado a once unidades y prueba de regresión añadida para referencias 102:1–11 y cautelas textuales.
- [x] Inventario de arte, auditoría 101–105 y README actualizados.
- Commits de contenido: `018ea17055bcbc902689561a0f67365d2975fc8a` (capítulo 102), `172a2621010a78b1c811c3f2226266adb6d6b39b` (catálogo), `397befe8bfb4653fecc412c3d7c7e51cf44c68a7` (test), `631e946de147b32e5e14e4c83962111653f39bd7` (auditoría), `c33a561a330a7c2ec5aad1f328eef782c0c0f5f6` y `6450b92636a5b828eca1d43e9de30aff05f92d5a` (SVG generado editorial y Android).
- [ ] CI de los cambios del 27-11 pendiente de consulta; no declarar compilación verificada hasta obtener el resultado de Actions.
- [ ] Cotejo directo Ge'ez/griego, fotografías y aparato crítico; master de ilustración para impresión; capítulo 103 versículo por versículo.


## Avance incremental — capítulo 103 — 27 de noviembre de 2026

- [x] Capítulo 103: reemplazado el resumen único por quince paráfrasis originales siguiendo la numeración de Charles 1917; se mantiene el estado provisional.
- [x] Capítulo 103: documentadas la voz elogiosa de 103:5–6, la queja de los justos vivos en 103:9–15, el suplemento editorial de 103:10 y la lectura corrupta marcada en 103:12.
- [x] Capítulo 103: anotadas las lagunas del papiro griego a partir de un resumen bibliográfico que cita Stuckenbruck 2007, p. 186; se aclara que no se inspeccionaron el aparato ni fotografías.
- [x] Catálogo offline actualizado a quince unidades y prueba de regresión añadida.
- [x] Ilustración vectorial capítulo-específica integrada en editorial y Android; el concepto previo se conserva. Los intentos de raster generada fueron descartados por genéricos y no se presentan como lámina específica.
- [x] Auditoría 101–105, inventario de arte y README actualizados.
- Commits: `7c2f0975591c89383cd3894e420a86e52dcfc665` (paráfrasis), `63f4c12d9f57fcd206713da75aa6de14c0828572` (catálogo), `38953b5c94b852a54ba6d1d47e59b5c61515d48d` (test), `79e6ee7e29589c710629610af61823a97696ec6e` y `829cf95a073e27b8537729f5862945f99c8f9233` (arte editorial y Android), `2ca8214ec8de92e6cd285eda42fcb8da19467591` (auditoría), `acb40e06e4eb7a7432e7fc232dd68505aa4d4eea` (inventario).
- [ ] CI de los cambios del capítulo 103 pendiente de consulta; no afirmar compilación hasta revisar Actions.
- [ ] Cotejo directo de Ge'ez/griego y revisión del arte para impresión.
- **Siguiente capítulo de trabajo:** 104, que sigue siendo un resumen general y debe convertirse en unidades versiculares con cautelas de 4Q204 y del papiro griego.
