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
- 43 SVG capítulo-específicos (66–108) en `assets/illustrations/` y duplicados en `app/src/main/assets/illustrations/`; 66–75 refinados, 76–108 conceptuales.
- El cotejo integral de los 108 capítulos sigue pendiente; no presentar los borradores como edición definitiva.
- Tres tests de catálogo y build debug con audio procedural pasan en CI, commit `a802f77`: [ejecución](https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44539201507). No es release final; falta prueba en dispositivo.
- Auditoría 66–108: `docs/auditoria_capitulos_66-108.md`.
- CI Android: compilación verificada con éxito en commit `613cd34`; artifact APK debug disponible en [GitHub Actions](https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44536929563). Es un build de desarrollo, no APK final.
- Audio celestial: sintetizador offline original, sin samples externos, opcional con control de volumen; requiere prueba auditiva real.
- Flujo CI verificado; APK debug de desarrollo, no release final.

## Registro de trabajo reciente
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

## Criterio de avance
La aplicación se desarrolla en paralelo con la edición, pero el texto se publicará como definitivo únicamente después del cotejo de manuscritos, ediciones y variantes. Las ilustraciones originales se integrarán como recursos de la aplicación y se vincularán a capítulos concretos.


## Objetivos de la app
- Lectura con diseño de libro y navegación por páginas/capítulos
- Índice navegable
- Ajuste de tipografía y marcadores
- Modo oscuro y lectura sin conexión
- Ilustraciones con vista ampliada
- Preparación de edición para imprimir
