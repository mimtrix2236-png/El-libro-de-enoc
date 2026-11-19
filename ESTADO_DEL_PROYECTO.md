# Estado maestro del proyecto — El Libro de Enoc

Actualizado: 2026-11-19
Repositorio: https://github.com/mimtrix2236-png/El-libro-de-enoc

## Mandato del usuario
- Terminar la edición editorial completa del libro (capítulos 1–108), cotejo de fuentes, corrección justificada, verificación de datos cronológicos/fechas/calendario/nombres/medidas, ilustraciones y aplicación.
- No presentar aplicación ni APK al usuario antes de que todo esté completo y comprobado.
- Guardar avances frecuentes en GitHub para poder continuar desde un chat nuevo sin depender del historial de conversación.
- No pedir confirmación capítulo por capítulo ni para ilustraciones rutinarias.
- El usuario pide que el trabajo no se detenga hasta completar. **Limitación real:** el asistente no puede garantizar trabajo autónomo continuo en segundo plano ni superar límites de automatizaciones; la continuidad debe hacerse en sesiones o ejecuciones disponibles. En nuevas sesiones, abrir este archivo y los registros y continuar desde el estado guardado. No afirmar progreso no realizado.

## Diseño editorial y visual
Libro antiguo de cuero marrón, pergamino envejecido, ornamentación dorada discreta, tipografía serif, grabados originales en sepia. Conservar el texto fiel y usar notas editoriales para variantes, interpolaciones, lagunas y problemas de transcripción.

## Estado real (no confundir notas preliminares con cotejo completo)
- **Capítulos 1–75:** el estado previo del chat decía borrador, pero el manuscrito y los archivos completos no están disponibles en el repositorio. No se puede certificar el cotejo ni dar por finalizados estos capítulos.
- **76–90:** existe un registro de observaciones estructurales/provisionales; NO es cotejo crítico versículo a versículo. Revisar antes de aplicar enmiendas.
- **91–108:** existen observaciones de estructura y variantes de orden; NO cotejo versículo a versículo.
- **Ilustración 76:** generada en chat, escena de doce puertas/vientos celestes en grabado sepia. Archivo binario en GitHub no verificado.
- **App/APK:** no implementada ni compilada/verificada en este repositorio; no presentar como producto listo.

## Fuentes y hallazgos guardados
Ver editorial/REGISTRO_VERIFICACION_FUENTES.md y editorial/COTEJO_CAPITULOS_76-90.md.
1 Enoc es una colección de unidades literarias con transmisión/composición diferenciada, no una obra de autoría y fecha uniformes.
- Astronómico: 72–82; Sueños: 83–90; final: 91–108 (incluye unidades editoriales distintas).
- El calendario de 364 días es un sistema antiguo descrito en el texto; no debe confundirse con el año tropical astronómico actual.
- Hay diferencias de orden y numeración editorial, especialmente en la composición de 91–93. No reorganizar sin documentar la edición base.
- Distinguir error de OCR, errata de edición, variante de traducción, variante textual, interpolación, laguna y corrección conjetural.

## Lista de trabajo (no declarar capítulo terminado hasta completar texto, cotejo y nota de verificación)
- [ ] 1–10
- [ ] 11–20
- [ ] 21–30
- [ ] 31–40
- [ ] 41–50
- [ ] 51–60
- [ ] 61–71
- [ ] 72–82
- [ ] 83–90
- [ ] 91–105
- [ ] 106–108
- [ ] Apéndice/notas editoriales y bibliografía
- [ ] Ilustraciones: catalogar/crear para cada capítulo y guardar archivos verificables
- [ ] App: implementación completa (texto íntegro de edición legalmente utilizable, imágenes, índice, navegación, búsqueda, favoritos/marcadores, progreso, ajustes, lectura offline)
- [ ] Build reproducible, pruebas y APK final comprobado

## Requisitos para cotejo
Cada tramo debe registrar: edición española base (traductor/editor/año/licencia o estado legal), referencias consultadas, lista de discrepancias por capítulo/versículo, clasificación del problema, propuesta, justificación, decisión editorial, confianza y cualquier texto incierto. Validar datos astronómicos/cronológicos contra fuentes académicas y distinguir el contenido histórico de explicaciones científicas actuales.

## Bloqueos
- Falta recuperar/definir el texto español base y verificar su derecho de uso.
- La automatización diaria no pudo crearse porque la cuenta alcanzó el máximo de 3 tareas activas; no se canceló ninguna tarea ajena.
- No hay build ni pruebas confirmadas.

## Continuidad para el próximo chat
1. Leer este archivo y todos los documentos editoriales.
2. No repetir ni sobrevalorar avances anteriores; corregir registro si una afirmación no está sustentada.
3. Conseguir/definir edición base y legalidad.
4. Trabajar consecutivamente, cotejar capítulos y guardar commits incrementales.
5. No entregar la app hasta que cada casilla esté verificada y el build/test esté comprobado.


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
