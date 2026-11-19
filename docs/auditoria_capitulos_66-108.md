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

Los 43 SVG existen y están vinculados por número de capítulo. La auditoría de archivos no equivale a una evaluación de calidad: son dibujos vectoriales de concepto, con una plantilla de pergamino y motivos propios, pero necesitan una revisión artística y refinamiento para la edición final. No se consideran láminas editoriales definitivas.

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
