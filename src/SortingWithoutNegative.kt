import java.io.*
import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
        val size = readLine()!!.toInt()
        val matrix = (1..size).map { readLine()!!.split(" ").map { it.toInt() }}
        val diff = matrix.indices.sumBy { matrix[it][it] - matrix[it][size-it-1]}
        println(abs(diff))
}