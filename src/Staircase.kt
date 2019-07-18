fun main(args: Array<String>) {
    /*val n = readLine()?.toInt().takeIf {
        it!! >0 && it <=100
    } ?:-1
    for (i in 0 until n) {
        for (j in 0 until n) {
            //if(j==n-i)
            if(j>=n-1-i)
                print("#")
            else
                print(" ")
        }
        println("")
    }*/
    val size = readLine()!!.toInt()
    (1..size).forEach {
        println(" ".repeat(size - it) + "#".repeat(it))
    }
}