# Estado maestro del proyecto — El Libro de Enoc

Actualizado: 2026-11-21
Repositorio: https://github.com/mimtrix2236-png/El-libro-de-enoc

## Mandato del usuario
- Terminar la edición editorial completa de 1 Enoc (capítulos 1–108), el cotejo de fuentes, correcciones justificadas, verificación de cronología/medidas/nombres, ilustraciones y la aplicación Android.
- No presentar como final ni entregar release hasta que se verifique todo. Guardar cambios incrementales en GitHub y continuar sin pedir confirmaciones rutinarias.
- El usuario quiere que se siga trabajando hasta completar los capítulos y las ilustraciones; no enviar mensajes de avance intermedios salvo que lo pida o haya una noticia realmente útil.
- Continuidad: el trabajo depende de ejecuciones/sesiones disponibles; no prometer que un agente trabaja ininterrumpidamente. Registrar el estado real y continuar desde el siguiente pendiente.

## Diseño editorial y visual aprobado
- Cubierta rústica de cuero marrón; interior en pergamino semienvejecido, grabados originales, tinta sepia y tonos tierra, serif y ornamentación discreta.
- Editor/autor de la edición: Mauro Iván Maidana.
- El diseño no está declarado final hasta revisar la cubierta y las páginas en alta resolución y preparar PDF de imprenta.

## Estado real (revisado contra el árbol del repositorio)
- **Capítulos:** existen archivos de borrador para los 108 capítulos. Los archivos 66–108 son paráfrasis provisionales, no traducciones exactas ni edición crítica. Cap. 66 tiene además una traducción de trabajo indirecta separada. Capítulos 106–108 están ampliados por rangos y documentan límites de testigos; 107 se revisó el 21-11-2026 con Charles 1917 y notas de variantes disponibles, sin cotejo directo de manuscritos. Capítulos 66–75 se revisaron en fuentes públicas y cuentan con auditoría preliminar en `docs/auditoria_66-75_fuentes.md`; no se cotejaron directamente Ge'ez ni manuscritos. En 71 se documentó la emendación de Charles 1912/1917 de segunda a tercera persona y la laguna conjetural de 71:13. En 72 se registró el esquema de puertas y el contexto de 4Q208–4Q211, sin identificar un fragmento directo de 72:1–37. En 73 se anotaron fracciones lunares y el límite de reconstrucción de 73:4–8. En 74 se registraron las cuentas de 3, 5 y 8 años; en 75, los cuatro días especiales, sin armonizarlos. Los capítulos 76–77 se revisaron en `docs/auditoria_76-82_fuentes.md`: marcas editoriales, preview 76 (160×160, no integrado) y testimonio fragmentario 4Q210/4Q209 para 77:2–3.
- **Fuentes:** algunas ediciones públicas y referencias críticas se consultaron en línea; el cotejo de todo el corpus (1–108) con manuscritos/aparatos no está hecho. No afirmar que los capítulos están verificados.
- **Ilustraciones:** hay 43 SVG conceptuales para capítulos 66–108. Se generaron previews raster embebidos para 106 y 107; son thumbnails y no masters de impresión. Se conserva el concepto original de 107 y el app muestra el preview generado. El concepto de 67 es específico (Noé, estructura de madera y valle ardiente), pero no se generó master raster para ese capítulo. Capítulos 76–108 aún requieren QA visual y arte de mayor detalle; no todos los capítulos 1–65 están catalogados en este árbol como assets ilustrativos.
- **Android:** lector Compose integrado con catálogo offline de 108 capítulos, índice y búsqueda, guardado local de capítulo/progreso, marcadores, escala de texto, modo nocturno, gesto horizontal y ambiente celestial procedural original (sin samples externos, interruptor OFF por defecto). El código está implementado, pero no se ha probado en teléfono real.
- **CI/build:** run 330 (commit `9ad0d832132e9e20209290426dc00f65e90ba15f`) y run 332 (commit `641df2c78962fd37dcda37921800124d2f24202d`) tuvieron tests de catálogo, `assembleDebug` y artifact exitosos. Run 330 APK debug 9,234,500 bytes; run 332 APK 9,234,499 bytes. Run 338, que incluye cambios de capítulo 68, tuvo tests de catálogo, `assembleDebug` y artifact exitosos: https://github.com/mimtrix2236-png/El-libro-de-enoc/actions/runs/44910822699. Runs 339–349 (auditorías 66–70 y actualizaciones de docs) completaron exitosamente. Runs 350–352 (auditoría 66–71) están en curso/cola; no hay release final ni prueba física.
- **Entregables:** no se ha generado/verificado PDF final; no hay APK release firmado ni pruebas de dispositivo; debug APKs son artifacts temporales de CI, no entregables finales.
- **Cubierta:** la estética aprobada está registrada, pero no se afirma que exista una cubierta final de alta resolución verificada en el repo.

## Lista de trabajo
- [ ] Cotejo textual/filológico 1–108, capítulo y versículo, con apparatus, nombres, variantes, reconstrucciones y lagunas.
- [ ] Verificar base legal: usar paráfrasis originales y/o traducción de fuente de dominio público con licencia registrada; documentar derechos y edición base.
- [ ] Completar front matter, introducción histórica, índice, notas, glosario, manuscritos/fragmentos, apéndices de textos relacionados separados, bibliografía.
- [ ] Crear/revisar ilustración específica de cada capítulo; documentar filename, fuente, master/preview, QA y rights.
- [ ] Integrar el contenido editorial completo en la app offline; revisar índice, búsqueda, progreso, bookmarks, ajustes, gestos, audio y accesibilidad.
- [ ] Revisar UI en teléfono real (incluidos WebView SVG, escalado y audio/focus).
- [ ] Generar PDF imprimible con cubierta e interior de pergamino y verificar páginas, márgenes, imágenes, fuentes y cortes.
- [ ] Release build reproducible; pruebas; APK release; verificar firma, instalación y funcionamiento.

## Bloqueos/limitaciones
- Falta el cotejo directo de manuscritos/fotografías y el aparato crítico completo para gran parte de los capítulos.
- Falta QA físico de Android y audio; falta PDF y release final.
- Las paráfrasis son material de trabajo; no deben presentarse como texto exacto ni académicamente definitivo.

## Próxima prioridad
Continuar con capítulo 78: revisar nombres del Sol/Luna, fracciones, marcas editoriales y el fragmento 4Q210 1iii; distinguir paráfrasis de reconstrucción, luego seguir secuencialmente por 79–108; auditar assets y completar arte generado pendiente. Mantener el progress log con commits y build IDs reales.

## Avance guardado — control académico de capítulos 72–82 (2026-11-19)
- Se creó `editorial/CONTROL_CAPITULOS_72-82.md` (commit `6a27f0b72119547ce92bc0386160bde9f25f5f10`).
- Registra el contenido por capítulo, las cifras sensibles (364, 354 y 360 días; puertas solares y de vientos; listas del capítulo 77), y la posible pérdida de material tras 82:20.
- Fuente de control: Andrei A. Orlov, “Enoch, Astronomical Book of (1 Enoch 72–82)”, *Dictionary of Early Judaism*, pp. 580–581 del PDF consultado.
- Se documenta que el propio PDF extraído contiene errores de OCR en nombres/referencias; no trasladarlos al texto ni tratarlos como variantes antiguas.
- **Alcance real:** avance de control estructural y numérico. No se ha hecho aún cotejo versículo por versículo, no se declara terminado ningún capítulo y no se ha producido todavía el texto español final.


- Nuevo documento `editorial/INCIDENCIAS_77-82.md` (commit `4448d05414a9428a5a0d7731758b756085d0bc64`): registra una advertencia de encabezado 77/78 ausente en una transcripción digital y una variante numérica 360/364 en 82:11 reportada para distintos testigos. Ambas quedan pendientes de verificación directa en facsímiles; no se ha impuesto ninguna lectura.


- Verificación bibliográfica añadida en `editorial/VERIFICACION_EJEMPLAR_CHARLES.md` (commit `5fb854096c1fff7e5b695dd4e0346ac46d5c4066`): el PDF abierto es la décima impresión de 1962, que reproduce la traducción de la segunda edición de Charles (1912); no debe llamarse facsímil de la primera impresión de 1917. La introducción de Oesterley se considera fuente historiográfica de época, no consenso académico actual. No se ha verificado aún en imagen el texto de 72–82 ni 82:11.


## Dictamen de trabajo 82:11 — variante 360/364 (2026-11-19)
- Se creó `editorial/DICTAMEN_82-11_360-364.md` (commit `74f52d6cbe6b9c3c7ff9d4fd8285b62fb28fabdd`).
- Evidencia comprobada: Dillmann 1851, p. 58, imprime el numeral Ge'ez `፫፻ወ፷ወ፬` = 364; Charles 1912 reporta 360 en manuscritos g, q, u y 364 en t y el grupo β.
- Decisión editorial de trabajo: texto principal 360 días + cuatro días intercalares, porque 82:6 ya da 364 para el año y 360 + 4 explica la distribución sin duplicar los días intercalares. Aparato obligatorio conserva la variante 364 de Dillmann y de otros testigos.
- Alcance: dilema resuelto para el texto de trabajo, no declarado resuelto paleográficamente en forma definitiva. Falta inspección directa de los manuscritos y revisión sintáctica experta del Ge'ez. No afirmar que se ha realizado una traducción independiente integral del manuscrito.


## Avance guardado — capítulos 83–90 (2026-11-19)
- Se creó `editorial/CONTROL_CAPITULOS_83-90.md` (commit `c20b00f236c930b79c03927c0fdc58beeaa4d75a`).
- Se estableció el mapa general: 83–84 primer sueño (diluvio y oración); 85–90 segundo sueño o Apocalipsis de los animales.
- Se documentó la distinción entre el texto Ge'ez digital de Dillmann 1851 y las fotografías del manuscrito Rylands Ethiopic MS 23 del siglo XVIII: no son el mismo testimonio ni una transcripción diplomática.
- Controles de ubicación publicados para Rylands MS 23: capítulo 83 en fol. 11v a–b; 86–87 en fol. 12r a–b; capítulo 90 desde fol. 13r c hasta fol. 14r a. No se extrapola esto a un cotejo completo.
- OCP declara que su codificación etiópica disponible no cubre 83–90; no se lo presentará como testigo digital de esos capítulos.
- **Alcance real:** reconocimiento estructural y procedencia/ubicación de testigos. 83–90 aún no está cotejado versículo por versículo ni traducido definitivamente.
- Fuente de control principal: Theosis Library, “1 Enoch 83–90: The Book of Dream Visions (Ethiopic)”, https://theosislibrary.com/library/verified-enoch-ethiopic-dream-visions.
