var DAY = 0

fun main() {
    evaporator(100.0,5.0,5.0)
    println(DAY)
}

fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
    val percent = evap_per_day.div(100)
    val residue = threshold.div(100)
    val residueOfDay = content.times(residue)
    var content2 = content
    while (content2 > residueOfDay) {
        val residue_per_day = content2.times(percent)
        content2 -= residue_per_day
        DAY += 1
    }
    return(DAY)
}