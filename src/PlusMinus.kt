
import java.util.*
import kotlin.collections.*
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>): Unit {
    var positive =0.0
    var negative =0.0
    var zero=0.0
    arr.forEach {
        when {
            it==0 -> zero++
            it>0 -> positive++
            else -> negative++
        }
    }

    println(String.format("%.5f", positive/arr.size))
    println(String.format("%.5f", negative/arr.size))
    println(String.format("%.5f", zero/arr.size))
}

fun main(args: Array<String>) {
    /*val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)*/
    val list = readLine()!!.split(" ").map { it.toInt() }
    println(String.format("%.5f",list.count { it > 0}.toDouble() / list.size))
    println(String.format("%.5f",list.count { it < 0}.toDouble() / list.size))
    println(String.format("%.5f",list.count { it == 0}.toDouble() / list.size))
}
