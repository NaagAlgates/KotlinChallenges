fun main() {
    /*val s = readLine()?.let { it.split(" ").map { it.toInt() }.sorted() }
    var low:Long=0
    var high:Long=0
    *//*s?.forEachIndexed { index, value ->
        if(index<4){
            low += value
        }
    }*//*
    //println(s)
    (0..3).forEach{
        low+= s!![it]
    }
    (s!!.size-1 downTo s.size-4).forEach{
        high += s[it]
    }
    println("$low $high")*/

    val values = readLine()!!.split(" ").map { it.toLong() }
    val sum = values.sum()
    println("${sum - values.max()!!} ${sum - values.min()!!}")
}