# El Libro de Enoc

Aplicación de lectura y proyecto editorial de **Mauro Iván Maidana**.

**Fecha de inicio de esta edición:** 18 de noviembre de 2026.

## Arquitectura editorial
1. Portada ilustrada
2. Página de título
3. Créditos y datos de edición
4. Dedicatoria
5. Nota editorial y criterios de texto
6. Prólogo
7. Introducción histórica
8. Índice general
9. Texto principal: 1 Enoc (108 capítulos), organizado por secciones
10. Notas de lectura e históricas
11. Glosario
12. Manuscritos y fragmentos
13. Textos relacionados (claramente separados): Libro de los Gigantes, 2 Enoc y 3 Enoc
14. Apéndice de tradiciones e interpretaciones posteriores (incluida Cábala)
15. Bibliografía y fuentes

## Criterio editorial
Se identificará la procedencia de cada texto. Los fragmentos, reconstrucciones, variantes e interpretaciones se marcarán como tales y no se presentarán como texto antiguo íntegro. La traducción o transcripción incorporada deberá ser verificable y compatible con derechos de uso.

## Estado de desarrollo
- Proyecto Android Kotlin/Compose con catálogo offline de 108 capítulos (paráfrasis provisional).
- Índice con búsqueda por título/número, tamaño de letra, modo nocturno, marcadores por capítulo, progreso local y swipe.
- Ilustración vectorial ornamental integrada en la cabecera.
- Ilustraciones vectoriales originales específicas para los capítulos 6–16.
- Contenido provisional de los capítulos 1–16 incorporado versículo por versículo y marcado como borrador.
- Registro y protocolo de cotejo crítico: `editorial/cotejo_critico.md`.
- Los capítulos 6–16 cuentan con mapas de folios y notas críticas en `editorial/fuentes_capitulos_06_10.md`, `editorial/fuentes_capitulos_11_13.md` y `editorial/fuentes_capitulos_14_16.md`.
- Los 108 capítulos tienen archivos individuales de trabajo; el capítulo 66 cuenta además con una traducción indirecta de 3 versículos basada en Charles 1917 (no cotejada con Ge'ez), y 67–108 son paráfrasis provisionales integradas en el catálogo offline.
- 43 SVG capítulo-específicos (66–108) en `assets/illustrations/` y duplicados en `app/src/main/assets/illustrations/`; 66–75 refinados. Los capítulos 89, 92, 94 y 106 tienen previews raster generadas e integradas; 76 tiene una preview separada sin integración. Los restantes 76–108 siguen siendo conceptuales y todos requieren QA visual; los previews no son láminas de impresión.
- El cotejo integral de los 108 capítulos sigue pendiente; no presentar los borradores como edición definitiva.
- Tres tests de catálogo y build debug con audio procedural pasan en CI, commit `a802f77`: [ejecución](https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44539201507). No es release final; falta prueba en dispositivo.
- Auditoría 66–108: `docs/auditoria_capitulos_66-108.md`.
- CI Android: compilación verificada con éxito en commit `613cd34`; artifact APK debug disponible en [GitHub Actions](https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44536929563). Es un build de desarrollo, no APK final.
- Audio celestial: sintetizador offline original, sin samples externos, opcional con control de volumen; requiere prueba auditiva real.
- Flujo CI verificado; APK debug de desarrollo, no release final.

## Registro de trabajo reciente

- Corregí la selección del SVG generado de capítulo 107 al cambiar de capítulo dentro del WebView; CI pendiente.

- Ilustración generada específica para el capítulo 89 reemplazó el SVG en source y assets Android; preview 128×192, master de impresión pendiente. Registro: assets/generated/README.md.
- Fuente-audit de capítulos 76–82: `docs/auditoria_76-82_fuentes.md`; notas críticas agregadas a cada paráfrasis, sin convertirlas en traducciones finales. Revisión de fuentes secundarias y bibliografía; cotejo directo de manuscritos aún pendiente.

- Fuente-audit 83–90: `docs/auditoria_83-90_fuentes.md`; notas por capítulo añadidas, con variante aramea más corta de 89:1b–9 y debate de división 89:55–58/89:59–90:42 registrados.
- Preview generado de capítulo 76 en `assets/generated/chapter_76_winds_gates_preview.jpg` (160×160, comprimido, no final ni integrado); ver `assets/generated/README.md`.

- Fuente-audit 91–95: `docs/auditoria_91-95_fuentes.md`; corregida la omisión de 93:11–14 y anotado el desplazamiento de la Apocalipsis de las Semanas entre testigos.

- Fuente-audit 96–100: `docs/auditoria_96-100_fuentes.md`; anotado el alcance parcial del papyrus griego Chester Beatty-Michigan y lagunas, sin afirmar testimonio arameo directo.

- Fuente-audit 101–105: `docs/auditoria_101-105_fuentes.md`; anotados los testigos griegos parciales y 4Q204 para 104:13–105:2.

- Fuente-audit 106–108: `docs/auditoria_106-108_fuentes.md`; apéndice de Noé con testigos fragmentarios y capítulo 108 señalado como Ge'ez-only en los testigos consultados.
- Hito de borradores: están presentes 108 archivos de capítulos; 66–108 cuentan con notas críticas de fuentes y límites de evidencia, aún no traducción crítica final.

- Auditoría combinada 66–108 actualizada con seis informes de fuente 76–108. Commit `78a256b` corrige paréntesis faltante del catálogo capítulo 66; la verificación CI de ese fix está pendiente.

- 76–78: paráfrasis originales por versículo integradas en el lector offline (14, 8 y 17 unidades respectivamente); test de secuencia añadido. CI de estos cambios pendiente.

- 79: paráfrasis por versículo integrada (6 unidades); el test de catálogo ahora verifica 76–79. CI de estos cambios pendiente.

- 80: paráfrasis por versículo integrada (8 unidades), con suplementos de Charles claramente marcados; test de catálogo ahora verifica 76–80. CI pendiente.

- 81–82: paráfrasis por versículo integradas (10 y 20 unidades); test de catálogo ahora verifica 76–82. CI pendiente.

- 83–85: paráfrasis por versículo integradas (11, 6 y 10 unidades); test de catálogo ahora verifica 76–85. CI pendiente.

- 86–88: paráfrasis por versículo integradas (6, 4 y 3 unidades); test de catálogo ahora verifica 76–88. CI pendiente.

- 89: dividido en 13 unidades narrativas (1–77), integrado al lector; test de orden añadido. CI pendiente.

## Criterio de avance
La aplicación se desarrolla en paralelo con la edición, pero el texto se publicará como definitivo únicamente después del cotejo de manuscritos, ediciones y variantes. Las ilustraciones originales se integrarán como recursos de la aplicación y se vincularán a capítulos concretos.


## Objetivos de la app
- Lectura con diseño de libro y navegación por páginas/capítulos
- Índice navegable
- Ajuste de tipografía y marcadores
- Modo oscuro y lectura sin conexión
- Ilustraciones con vista ampliada
- Preparación de edición para imprimir


## Última revisión registrada — 20 de noviembre de 2026

- 106–108: paráfrasis provisionales ampliadas por rangos; auditoría de fuentes y testigos actualizada. La fuente de 108 se corrigió a Charles SPCK 1917 / Project Gutenberg #77935 (la reproducción de Charles 1912 citada anteriormente no incluía ese capítulo).
- Capítulo 106: ilustración generada específica integrada en el lector como preview 160×240 px embebido en SVG; se conserva el concepto vectorial previo. No es recurso de impresión.
- Build previo a estos cambios: CI run 299, commit efc00173564331d1bc3bcfe0822307639368698a, éxito y APK debug artifact 9,218,655 bytes. Una compilación nueva de los cambios actuales está pendiente.
- Los borradores 1–108 existen, pero son paráfrasis provisionales; el cotejo completo de fuentes/variantes, revisión visual, PDF y APK final aún no están completados.


- **Build verificado después de la integración del arte 106:** CI run 312 para commit ebdd9e2de0f7ed723bea6f2bbdf3a2d253f0e8a3 pasó tests, assembleDebug y upload-artifact. APK debug de 9,229,448 bytes, expira 20-12-2026 13:18 UTC: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44743101905. Es una build intermedia; no se probó en teléfono.


- 106–108 también se integraron al catálogo offline con rangos narrativos (106: 4, 107: 3, 108: 4 unidades) y notas de testigos/limitaciones; test de regresión añadido. Build de esta revisión pendiente.


- **Build verificado después de integrar 106–108 en el catálogo:** CI run 317 (commit ff195efe91850f5c3625c79805dc71b43f166e5f) pasó tests, assembleDebug y upload; APK debug 9,229,830 bytes. Run 320 (commit bf53c357b74a38f5a5572982706f070c36abd221, documentación posterior) también pasó y generó APK debug 9,229,829 bytes: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44743746076. Artifact temporal, expira 20-12-2026 13:24 UTC. Sin prueba en dispositivo; aún no es release final.

## Actualización de trabajo — 23 de noviembre de 2026
- El capítulo 94 se amplió a 11 paráfrasis provisionales por referencia y se integró al lector offline; se anotaron la frase ambigua de 94:5 y el suplemento editorial entre corchetes en 94:7.
- Arte específico generado para capítulo 94 e integrado en los dos SVG de recursos (preview 128×192); el concepto vectorial anterior se conserva. El master 1024×1536 no está archivado en GitHub.
- La revisión de fuentes 91–95 registra el mapeo fragmentario de 4Q212 a 94:1–2 y los límites de evidencia; no hubo cotejo de fotos ni aparato crítico completo.
- Build/CI de estos commits y prueba en teléfono pendientes. No es release final.


- **24 de noviembre de 2026 — capítulo 95:** paráfrasis provisional ampliada a siete unidades y sincronizada con el catálogo Android. Se registran el suplemento y la lectura dañada de 95:1, el versículo corrupto 95:2 y la diferencia de versificación Charles 1917 / Charlesworth 1983 sin confundirla con variante manuscrita. Ilustración específica generada e integrada como preview 128×192 en SVG editorial y Android; master 1024×1536 fuera del repositorio. CI y prueba en dispositivo pendientes.


- **24 de noviembre de 2026 — capítulo 96:** paráfrasis provisional ampliada a ocho unidades y sincronizada con el catálogo Android. La unidad 96:2, marcada entre corchetes por Charles, se separa como suplemento editorial. Límites de testigos registrados; no hubo cotejo directo de manuscritos. El arte sigue siendo un concepto SVG, pendiente de ilustración generada específica y QA. CI y prueba en dispositivo pendientes.


## Avance editorial y visual — 27 de noviembre de 2026

- El capítulo 102 ya está organizado en once paráfrasis provisionales, una por unidad de la numeración de Charles 1917, con nota explícita de las diferencias Ge'ez/griego en 102:3, 102:5, 102:8 y 102:10–11.
- Se generó una lámina específica de 1 Enoc 102 y se integró como raster 64×96 embebido en el SVG editorial y en el asset Android; el visor la presenta en 128×192. El concepto vectorial anterior se preservó como `chapter_102_vector_concept.svg`.
- La paráfrasis y el catálogo Android siguen marcados como provisionales; no se afirma colación directa de manuscritos.
- El siguiente borrador que requiere conversión a unidades versiculares es el capítulo 103.


## Avance incremental — capítulos 102–103 (27 de noviembre de 2026)

- Capítulo 102: paráfrasis provisional por sus once unidades de Charles 1917; se documentan diferencias de la forma griega en 102:3, 102:5, 102:8 y 102:10–11. Ilustración generada integrada como preview raster embebida en el SVG offline; el concepto vectorial previo se conserva.
- Capítulo 103: paráfrasis provisional por sus quince versículos; se registran el suplemento de 103:10, la lectura corrupta de 103:12 y las lagunas griegas reportadas en fuentes secundarias. No se afirma cotejo directo de manuscritos.
- Capítulo 103: nueva lámina vectorial específica con tablas celestiales, memoria de los justos, destino oscuro de los pecadores y trabajadores bajo yugo ante una autoridad que no escucha. Se conserva el concepto anterior; las imágenes generadas disponibles para este capítulo resultaron genéricas y no se incorporaron.
- El lector Android muestra ambos capítulos offline con once y quince unidades, respectivamente; pruebas automatizadas de secuencia añadidas. Build CI de los cambios recientes aún pendiente de resultado.


## Estado consolidado — 28 de noviembre de 2026
- Los borradores individuales 66–108 existen; 102–108 están ya desglosados por unidades de Charles 1917 en la documentación y el lector offline. Son paráfrasis provisionales, no una traducción crítica ni una colación directa del Ge'ez.
- Capítulo 108: ilustración original generada integrada como preview offline 128×192 en los SVG editorial y Android; el concepto vectorial anterior se conserva. Master 1024×1536 pendiente de archivado en GitHub y QA de imprenta.
- CI verificado después de integrar el arte del capítulo 108: [run 46152998777](https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/46152998777), commit `ca2275bc7edddd52910e955f237df5b780b16738`: tests de catálogo, `assembleDebug` y upload-artifact exitosos. Artifact debug 9.310.095 bytes; digest ZIP `sha256:f922e08b96cf7e1adc4bf503627c32466163431bf8c416c97a499a7b34cbc485`, expira el 28-12-2026 14:08 UTC. No es release firmado ni prueba física.
- Pendiente: cotejo crítico, QA de 43 ilustraciones y masters, front matter/apéndices, PDF imprimible, búsqueda completa/paginación, pruebas físicas y APK release firmado.
