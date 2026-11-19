package com.mimtrix.libroenoc

data class VerseEntry(val reference: String, val text: String)
data class ChapterEntry(
    val number: Int,
    val title: String,
    val status: String,
    val editorialNote: String,
    val criticalNote: String,
    val verses: List<VerseEntry>
)

object EnocContent {
    // Base de trabajo: traducción provisional. Cada versículo debe cotejarse con los testigos antes de declararse definitivo.
    val chapters = listOf(
        ChapterEntry(1, "Bendición y juicio", "Borrador · cotejo crítico pendiente",
            "Enoc bendice a los elegidos y anuncia la manifestación del Santo, el juicio y la paz para los justos.",
            "Comparar ge'ez de Dillmann, fotografías de Rylands MS 23, versión de Charles y paralelos de Judas 14–15. Registrar reconstrucciones editoriales y no incorporarlas silenciosamente.",
            listOf(
                VerseEntry("1:1", "Estas son las palabras de bendición de Enoc, con las que bendijo a los elegidos y a los justos que vivirán en el día de la tribulación."),
                VerseEntry("1:2", "Enoc, hombre justo, cuyos ojos fueron abiertos por Dios, contempló la visión del Santo en los cielos, que los ángeles le mostraron."),
                VerseEntry("1:3", "Hablé acerca de los elegidos y pronuncié mi oráculo sobre ellos: el Santo y Grande saldrá de su morada."),
                VerseEntry("1:4", "El Dios eterno caminará sobre la tierra, sobre el monte Sinaí, y se manifestará en la fuerza de su poder."),
                VerseEntry("1:5", "Todos serán sobrecogidos por el temor; los Vigilantes temblarán y un gran estremecimiento alcanzará los confines de la tierra."),
                VerseEntry("1:6", "Las altas montañas serán sacudidas, las colinas serán abatidas y se derretirán como cera ante la llama."),
                VerseEntry("1:7", "La tierra se abrirá y habrá juicio sobre todos."),
                VerseEntry("1:8", "Con los justos establecerá la paz, protegerá a los elegidos y tendrá misericordia de ellos."),
                VerseEntry("1:9", "He aquí que viene con miríadas de sus santos para ejecutar juicio y hacer comparecer a toda carne por sus obras.")
            )),
        ChapterEntry(2, "El orden de la creación", "Borrador · cotejo crítico pendiente",
            "La regularidad de las luminarias y los ciclos de la naturaleza se presenta como testimonio del orden creado.",
            "Numeración versicular de trabajo según Charles; cotejar el texto ge'ez y registrar diferencias de segmentación.",
            listOf(
                VerseEntry("2:1", "Observad las obras de los cielos: las luminarias no cambian sus caminos y cada una sale y se pone en el tiempo que le corresponde."),
                VerseEntry("2:2", "Contemplad la tierra y las cosas que suceden sobre ella, desde el principio hasta el fin."),
                VerseEntry("2:3", "Considerad el verano y el invierno, cómo la tierra recibe el agua, las nubes, el rocío y la lluvia.")
            )),
        ChapterEntry(3, "Los árboles y sus hojas", "Borrador · cotejo crítico pendiente",
            "Descripción de los árboles que pierden sus hojas y de aquellos que conservan el follaje.",
            "Verificar el número catorce en los testigos y la formulación exacta de la duración de las hojas.",
            listOf(
                VerseEntry("3:1", "Observad cómo los árboles pierden sus hojas, excepto algunos que conservan su follaje."),
                VerseEntry("3:2", "Estos árboles mantienen sus hojas antiguas durante dos o tres años, hasta que llegan las nuevas.")
            )),
        ChapterEntry(4, "El calor del verano", "Borrador · cotejo crítico pendiente",
            "El calor estival y la búsqueda de sombra ilustran la observación de los ciclos naturales.",
            "Capítulo breve; respetar su unidad textual sin crear divisiones adicionales.",
            listOf(VerseEntry("4:1", "Observad los días del verano: el sol calienta la tierra y los seres humanos buscan sombra y refugio."))),
        ChapterEntry(5, "La fidelidad de la creación y la infidelidad humana", "Borrador · cotejo crítico pendiente",
            "El orden de la creación contrasta con la conducta humana; el capítulo exhorta a la justicia y anuncia paz para los elegidos.",
            "Revisar especialmente la segmentación de 5:6–7 y las marcas de reconstrucción de Charles.",
            listOf(
                VerseEntry("5:1", "Observad cómo los árboles se cubren de hojas verdes y producen frutos."),
                VerseEntry("5:2", "Las obras de la creación continúan de año en año conforme al orden establecido."),
                VerseEntry("5:3", "El mar y los ríos cumplen sus funciones y siguen el orden que les ha sido asignado."),
                VerseEntry("5:4", "Pero vosotros no habéis permanecido firmes ni habéis cumplido los mandamientos; os habéis apartado y habéis pronunciado palabras arrogantes."),
                VerseEntry("5:5", "Enoc anuncia las consecuencias de la injusticia y la ausencia de paz."),
                VerseEntry("5:6", "Los nombres de quienes persisten en la maldad serán recordados como advertencia."),
                VerseEntry("5:7", "Para los elegidos habrá luz, gracia y paz."),
                VerseEntry("5:8", "A los elegidos se les concederá sabiduría y humildad."),
                VerseEntry("5:9", "La vida de los justos transcurrirá en paz y sus años de alegría aumentarán.")
            )),
        ChapterEntry(6, "El descenso de los Vigilantes", "Borrador traducido · cotejo crítico pendiente",
            "Doscientos Vigilantes descienden en el tiempo de Jared, pactan en el monte Hermón y toman mujeres humanas.",
            "Rylands MS 23, fol. 2r col. c. El texto ge'ez de Dillmann se cotejó en la edición digital con la apertura del capítulo en la fotografía. Charles marca una posible adición editorial en la referencia a los días de Jared. Los nombres propios presentan variantes de transliteración; conservar una forma normalizada y registrar alternativas.",
            listOf(
                VerseEntry("6:1", "Cuando los seres humanos comenzaron a multiplicarse sobre la tierra, en aquellos días nacieron hijas hermosas y agraciadas."),
                VerseEntry("6:2", "Los ángeles, hijos del cielo, las vieron, las desearon y se dijeron unos a otros: «Vamos, escojamos mujeres entre las hijas de los hombres y engendremos hijos»."),
                VerseEntry("6:3", "Semihazá, su jefe, les dijo: «Temo que quizá no queráis llevar a cabo esta acción y que yo solo tenga que responder por este gran pecado»."),
                VerseEntry("6:4", "Todos le respondieron: «Juremos juntos y comprometámonos mediante una maldición recíproca a no abandonar este propósito, sino a realizarlo»."),
                VerseEntry("6:5", "Entonces todos juraron juntos y se comprometieron unos con otros mediante aquella maldición."),
                VerseEntry("6:6", "Eran doscientos en total. Descendieron en los días de Jared sobre la cima del monte Hermón, y lo llamaron Hermón porque allí habían jurado y se habían comprometido mediante una maldición."),
                VerseEntry("6:7", "Estos son los nombres de sus jefes: Semihazá, su dirigente; Arakiba; Rameel; Kokabiel; Tamiel; Ramiel; Daniel; Ezequiel; Baraqiel; Asael; Armaros; Batariel; Ananel; Zaqiel; Samsapeel; Satariel; Turel; Yomiel y Sariel."),
                VerseEntry("6:8", "Estos eran los jefes de decenas de todos ellos.")
            )),
        ChapterEntry(7, "Los gigantes y la violencia sobre la tierra", "Borrador traducido · cotejo crítico pendiente",
            "Los Vigilantes toman mujeres, transmiten conocimientos y engendran gigantes cuya violencia desborda a la humanidad.",
            "Rylands MS 23, fol. 2r col. c–2v col. a. La cifra de tres mil codos aparece en Charles y en el texto transmitido, pero es extraordinaria y debe conservarse como lectura textual, no corregirse como dato histórico. Revisar variantes de la secuencia de enseñanza.",
            listOf(
                VerseEntry("7:1", "Los demás, junto con ellos, tomaron mujeres; cada uno escogió una para sí. Comenzaron a unirse con ellas y a corromperse. Les enseñaron encantamientos, conjuros, el corte de raíces y el conocimiento de las plantas."),
                VerseEntry("7:2", "Las mujeres quedaron embarazadas y dieron a luz grandes gigantes, cuya estatura era de tres mil codos."),
                VerseEntry("7:3", "Los gigantes consumieron todos los recursos que los seres humanos habían producido."),
                VerseEntry("7:4", "Cuando los hombres ya no pudieron sostenerlos, los gigantes se volvieron contra ellos y devoraron a la humanidad."),
                VerseEntry("7:5", "Comenzaron a pecar contra las aves, las bestias, los reptiles y los peces; se devoraban unos a otros y bebían sangre."),
                VerseEntry("7:6", "Entonces la tierra presentó una acusación contra los violentos.")
            )),
        ChapterEntry(8, "Las enseñanzas prohibidas", "Borrador traducido · cotejo crítico pendiente",
            "Azazel enseña la fabricación de armas y adornos; otros Vigilantes transmiten artes, encantamientos y conocimientos astrales.",
            "Rylands MS 23, fol. 2v col. a. Charles señala entre corchetes angulares una lista de enseñanzas añadida o reconstruida —signos del suelo y del sol—; mantenerla en el aparato y no mezclarla con la lectura principal sin advertencia. Los nombres y atribuciones de maestros requieren cotejo con variantes.",
            listOf(
                VerseEntry("8:1", "Azazel enseñó a los seres humanos a fabricar espadas, cuchillos, escudos y corazas. Les mostró los metales de la tierra y cómo trabajarlos, así como brazaletes, adornos, el uso del antimonio, el embellecimiento de los párpados, piedras preciosas y toda clase de tintes."),
                VerseEntry("8:2", "Se extendió una gran impiedad; cometieron actos de inmoralidad, fueron desviados y se corrompieron en todos sus caminos."),
                VerseEntry("8:3", "Semihazá enseñó encantamientos y el corte de raíces; Armaros, cómo deshacer encantamientos; Baraqiel, la astrología; Kokabiel, las constelaciones; Ezequiel, el conocimiento de las nubes; [Araqiel, los signos de la tierra; Shamsiel, los signos del Sol]; y Sariel, el curso de la Luna. La edición de Charles señala entre corchetes angulares la cláusula sobre Araqiel y Shamsiel como suplemento; se mantiene aquí entre corchetes para no confundirla con la lectura no marcada."),
                VerseEntry("8:4", "Mientras los seres humanos perecían, clamaban, y su clamor subió hasta el cielo.")
            )),
        ChapterEntry(9, "La súplica de los arcángeles", "Borrador traducido · cotejo crítico pendiente",
            "Miguel, Uriel, Rafael y Gabriel contemplan la violencia y elevan ante el Señor la causa de las víctimas.",
            "Rylands MS 23, fol. 2v col. a–b. Charles marca una frase difícil en 9:2 y una cláusula añadida en 9:3; mantener las señales de incertidumbre. El orden y la forma de los nombres angélicos varían entre testigos y ediciones.",
            listOf(
                VerseEntry("9:1", "Entonces Miguel, Uriel, Rafael y Gabriel miraron desde el cielo y vieron la mucha sangre derramada sobre la tierra y toda la injusticia que allí se cometía."),
                VerseEntry("9:2", "Se dijeron unos a otros: «La tierra, privada de habitantes, eleva el clamor de sus voces hasta las puertas del cielo». La formulación de este versículo es textualmente difícil."),
                VerseEntry("9:3", "«Ahora, a vosotros, santos del cielo, las almas de los seres humanos presentan su súplica y dicen: llevad nuestra causa ante el Altísimo»."),
                VerseEntry("9:4", "Y dijeron al Señor de los señores, al Rey de los reyes: «Señor de los siglos, Dios de los dioses, Rey de los reyes; tu trono glorioso permanece por todas las generaciones. Tu nombre es santo, glorioso y bendito por todos los siglos»."),
                VerseEntry("9:5", "«Tú has hecho todas las cosas y tienes autoridad sobre todas ellas. Todo está descubierto y manifiesto ante tu mirada; todo lo ves y nada puede ocultarse de ti»."),
                VerseEntry("9:6", "«Has visto lo que ha hecho Azazel: ha enseñado toda injusticia sobre la tierra y ha revelado los secretos eternos que estaban guardados en el cielo y que los seres humanos procuraban conocer»."),
                VerseEntry("9:7", "«También has visto a Semihazá, a quien diste autoridad sobre sus compañeros»."),
                VerseEntry("9:8", "«Ellos fueron juntos a las hijas de los hombres, se unieron a ellas, se contaminaron y les revelaron toda clase de pecados»."),
                VerseEntry("9:9", "«Las mujeres dieron a luz gigantes, y por ello toda la tierra se llenó de sangre e injusticia»."),
                VerseEntry("9:10", "«Ahora, mira: las almas de quienes han muerto claman y presentan su súplica hasta las puertas del cielo; sus lamentos han subido y no pueden cesar a causa de las injusticias cometidas sobre la tierra»."),
                VerseEntry("9:11", "«Tú conoces todas las cosas antes de que sucedan; ves esto y lo permites, pero no nos has indicado qué debemos hacer con ellos».")
            )),
        ChapterEntry(10, "Las sentencias contra los Vigilantes", "Borrador traducido · cotejo crítico pendiente",
            "El Altísimo encomienda a Uriel, Rafael, Gabriel y Miguel distintas misiones: advertir a Noé, atar a Azazel, contener a los gigantes y juzgar a los Vigilantes; anuncia la purificación de la tierra.",
            "Rylands MS 23, fol. 2v col. b–3r col. a. Charles incluye suplementos y reconstrucciones importantes: «ve a Noé» en 10:2; palabras entre corchetes en 10:9; y una cláusula en 10:16 y 10:21. Se conservarán como intervenciones editoriales señaladas. El capítulo tiene 22 versículos en la numeración de Charles.",
            listOf(
                VerseEntry("10:1", "Entonces habló el Altísimo, el Santo y Grande, y envió a Uriel al hijo de Lamec."),
                VerseEntry("10:2", "Le dijo: «Ve a Noé y anúnciale en mi nombre: escóndete. Revela el final que se aproxima: toda la tierra será destruida; viene un diluvio sobre ella y destruirá cuanto exista en su superficie»."),
                VerseEntry("10:3", "«Instrúyelo para que escape y para que su descendencia sea preservada a través de todas las generaciones del mundo»."),
                VerseEntry("10:4", "Después el Señor dijo a Rafael: «Ata a Azazel de pies y manos y arrójalo a las tinieblas. Abre una cavidad en el desierto de Dudael y échalo allí»."),
                VerseEntry("10:5", "«Coloca sobre él piedras ásperas y puntiagudas; cúbrelo de oscuridad y déjalo allí para siempre. Cubre su rostro para que no vea la luz»."),
                VerseEntry("10:6", "«En el día del gran juicio será arrojado al fuego»."),
                VerseEntry("10:7", "«Sana la tierra que los ángeles corrompieron y anuncia su curación, para que se remedie la plaga y los seres humanos no perezcan por los secretos que los Vigilantes revelaron y enseñaron a sus hijos»."),
                VerseEntry("10:8", "«Toda la tierra ha sido corrompida por las obras que Azazel enseñó. A él atribúyase toda culpa»."),
                VerseEntry("10:9", "El Señor dijo a Gabriel: «Ve contra los bastardos, los réprobos y los hijos de la transgresión; destruye a los hijos de los Vigilantes de entre los seres humanos. Envíalos unos contra otros para que se destruyan en combate, pues no tendrán larga vida». Algunas palabras de esta orden están reconstruidas en la edición de Charles."),
                VerseEntry("10:10", "«No se concederá a sus padres ninguna petición en favor de ellos, pues esperan vivir eternamente y que cada uno alcance quinientos años»."),
                VerseEntry("10:11", "El Señor dijo a Miguel: «Ve y ata a Semihazá y a sus compañeros, que se unieron a las mujeres y se contaminaron con ellas en toda su impureza»."),
                VerseEntry("10:12", "«Cuando sus hijos se hayan matado entre sí y ellos hayan visto la destrucción de sus seres queridos, átalos durante setenta generaciones en los valles de la tierra, hasta el día de su juicio y de su consumación, hasta que se complete el juicio eterno»."),
                VerseEntry("10:13", "«En aquellos días serán conducidos al abismo de fuego, al tormento y a la prisión donde permanecerán encerrados para siempre»."),
                VerseEntry("10:14", "«Quien sea condenado y destruido quedará desde entonces ligado a ellos hasta el fin de todas las generaciones»."),
                VerseEntry("10:15", "«Destruye todos los espíritus de los réprobos y a los hijos de los Vigilantes, porque hicieron daño a la humanidad»."),
                VerseEntry("10:16", "«Haz desaparecer toda injusticia de la faz de la tierra y pon fin a toda obra malvada. Que aparezca la planta de la justicia y de la verdad; que sea bendición y que sus obras sean plantadas para siempre en verdad y alegría». La frase sobre la bendición contiene una reconstrucción editorial."),
                VerseEntry("10:17", "«Entonces todos los justos escaparán y vivirán hasta engendrar miles de hijos; completarán en paz todos los días de su juventud y de su vejez»."),
                VerseEntry("10:18", "«En aquellos días toda la tierra será cultivada con justicia y quedará plantada de árboles; se llenará de bendición»."),
                VerseEntry("10:19", "«Se plantarán en ella árboles agradables y viñas. La vid dará vino en abundancia; cada medida de semilla sembrada producirá mil medidas, y una medida de aceitunas dará diez medidas de aceite»."),
                VerseEntry("10:20", "«Purifica la tierra de toda opresión, injusticia, pecado e impiedad; elimina de ella toda impureza que se comete sobre su superficie»."),
                VerseEntry("10:21", "«Que todos los hijos de los hombres lleguen a ser justos y que todas las naciones me adoren, me bendigan y se inclinen ante mí». Esta cláusula está señalada como reconstrucción en Charles."),
                VerseEntry("10:22", "«La tierra quedará limpia de toda corrupción, pecado, castigo y tormento. Nunca más enviaré estas cosas sobre ella, de generación en generación y para siempre»." )
            ))
    )
}
