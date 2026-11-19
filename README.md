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
- Proyecto Android con interfaz inicial de lectura por capítulos.
- Índice con búsqueda por título/número, controles de tamaño de letra, modo nocturno, marcadores locales, guardado de último capítulo y navegación por swipe (implementación inicial).
- Ilustración vectorial ornamental integrada en la cabecera.
- Ilustraciones vectoriales originales específicas para los capítulos 6–16.
- Contenido provisional de los capítulos 1–16 incorporado versículo por versículo y marcado como borrador.
- Registro y protocolo de cotejo crítico: `editorial/cotejo_critico.md`.
- Los capítulos 6–16 cuentan con mapas de folios y notas críticas en `editorial/fuentes_capitulos_06_10.md`, `editorial/fuentes_capitulos_11_13.md` y `editorial/fuentes_capitulos_14_16.md`.
- Los 108 capítulos tienen archivos individuales de paráfrasis provisional; los capítulos 66–108 están integrados en catálogos Kotlin offline. El cotejo crítico sigue pendiente.
- 43 SVG capítulo-específicos (66–108) en `assets/illustrations/` y duplicados en `app/src/main/assets/illustrations/`; son bocetos vectoriales, no arte final.
- El cotejo integral de los 108 capítulos sigue pendiente; no presentar los borradores como edición definitiva.
- Tres pruebas unitarias de catálogo pasan en CI; build debug con ambiente celestial verificada en commit `a802f77`: [ejecución](https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44539201507). No es release final; falta prueba en dispositivo.
- Auditoría 66–108: `docs/auditoria_capitulos_66-108.md`.
- CI Android: compilación verificada con éxito en commit `613cd34`; artifact APK debug disponible en [GitHub Actions](https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44536929563). Es un build de desarrollo, no APK final.
- Flujo de compilación Android configurado en `.github/workflows/android-build.yml`; una compilación debug ya se verificó, pero el APK final de entrega aún requiere pruebas y una build final.

## Criterio de avance
La aplicación se desarrolla en paralelo con la edición, pero el texto se publicará como definitivo únicamente después del cotejo de manuscritos, ediciones y variantes. Las ilustraciones originales se integrarán como recursos de la aplicación y se vincularán a capítulos concretos.


## Objetivos de la app
- Lectura con diseño de libro y navegación por páginas/capítulos
- Índice navegable
- Ajuste de tipografía y marcadores
- Modo oscuro y lectura sin conexión
- Ilustraciones con vista ampliada
- Preparación de edición para imprimir
