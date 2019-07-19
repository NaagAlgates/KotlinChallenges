fun main() {
    /*val s = readLine()!!.split(":").toMutableList()
    if(s[2].substring(s[2].length-2,s[2].length) == "AM"){
        if(s[0] == "12"){
            s[0]="00"
        }
    }else if(s[2].substring(s[2].length-2,s[2].length) == "PM"){
        if(s[0].toInt()<=11) {
            s[0] = (s[0].toInt() + 12).toString()
        }
    }else{
        print("Wrong input")
    }
    s[2]=s[2].substring(0,2)
    println("${s[0]}:${s[1]}:${s[2]}")*/

    fun formatMilitary(parts: List<Int>) = parts.joinToString(":") { "%02d".format(it) }
    val time = readLine()!!
    val values = time.removeSuffix("PM").removeSuffix("AM").split(":").map { it.toInt() }
    val military = if (time.endsWith("PM"))
        formatMilitary(listOf(if (values[0] < 12) values[0] + 12 else 12, values[1], values[2]))
    else
        formatMilitary(listOf(if (values[0] < 12) values[0] else 0, values[1], values[2]))
    println(military)
}