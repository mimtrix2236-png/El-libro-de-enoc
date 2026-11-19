# Seguimiento de producción — Libro de Enoc

Autor de esta edición: **Mauro Iván Maidana**  
Repositorio: https://github.com/mimtrix2236-png/El-libro-de-enoc

## Estado actual — 19 de noviembre de 2026

### Libro
- [x] 108 archivos canónicos consecutivos en `docs/chapters/`; 66–108 son borradores, capítulo 66 además tiene traducción indirecta en archivo separado.
- [x] Capítulos 66–108: 43 archivos con resumen, fuente, notas e idea de ilustración; capítulo 66 tiene traducción indirecta desde Charles (1917); cotejo crítico/versicular pendiente.
- [x] 43 SVG individuales 66–108 y copias Android; capítulos 66–75 refinados en escenas más detalladas; 76–108 siguen conceptuales y requieren revisión artística.
- [ ] Traducción final y cotejo versículo por versículo; aparato de variantes; apéndices completos; PDF de libro.

### Aplicación
- [x] Catálogo offline de 108 capítulos; capítulo 66 con traducción indirecta de trabajo, capítulos 67–108 con paráfrasis provisionales.
- [x] Índice, búsqueda por título/número, marcadores por capítulo, persistencia del último capítulo, tamaño de letra y modo nocturno.
- [x] Navegación por swipe horizontal.
- [x] Ambiente celestial original procedural (AudioTrack), opcional, apagado por defecto, control de volumen, offline y pausa/resume al salir/volver.
- [x] 3 tests unitarios de catálogo y CI build debug verificados; artifact de desarrollo en commit `a802f77`: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44539201507 (9,205,699 bytes).
- [ ] Probar audio y navegación en dispositivo real; paginación tipo libro, búsqueda de texto completo, ampliación de ilustraciones, pruebas UX y APK final.

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
