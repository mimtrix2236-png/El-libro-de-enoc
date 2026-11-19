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
            ))
    )
}
