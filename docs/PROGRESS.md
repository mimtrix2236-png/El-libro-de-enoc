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
- [x] Capítulos 66–108 — borradores preparados; pendiente cotejo y revisión editorial
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
