# Seguimiento de producción — Libro de Enoc

Autor de esta edición: **Mauro Iván Maidana**  
Repositorio: https://github.com/mimtrix2236-png/El-libro-de-enoc

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
- [ ] Capítulos 66–108 — el estado real se audita a continuación; no se cuentan como preparados sin archivo comprobable.
- [ ] Revisión de coherencia y notas documentales
- [x] Glosario preliminar (apéndices todavía pendientes)
- [x] Bibliografía base y protocolo de cotejo registrados (ver docs/bibliografia_fuentes_cotejo.md)
- [ ] Bibliografía verificada capítulo por capítulo
- [ ] Ilustraciones finales (se generaron varias láminas/portadas conceptuales en sepia; son bocetos de referencia y no están integrados como archivos de arte finales)
- [ ] Edición imprimible

## Estado real de la aplicación (revisado el 18 de noviembre de 2026)

- [x] Proyecto Android Kotlin/Jetpack Compose inicial y archivos Gradle/manifest en el repositorio
- [x] Prototipo de lector con páginas preliminares (título, dedicatoria-placeholder, nota editorial, prólogo-placeholder, introducción-placeholder e índice)
- [x] Controles de índice, tamaño de letra y navegación preliminar
- [ ] Texto de los 108 capítulos integrado en la app (avance parcial: capítulos 1–16 en borrador y capítulos 17–35 incorporados como paráfrasis literarias identificadas; 36–108 pendientes de integración y cotejo)
- [ ] Navegación de índice a capítulo y paginación/swipe
- [x] Marcadores guardados/restaurables (implementación inicial con preferencias locales)
- [x] Modo nocturno (implementación inicial)
- [ ] Búsqueda dentro del libro
- [ ] Lectura offline con contenido completo
- [ ] Ilustraciones finales integradas
- [ ] Audio ambiental opcional, original o con licencia verificable
- [ ] Compilación y pruebas Android verificadas
- [ ] APK de entrega verificado

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
- [ ] The new CI run after this fix must complete successfully; APK generation is not verified yet.
