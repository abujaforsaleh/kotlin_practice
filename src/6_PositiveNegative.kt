import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    var counter = arrayOf(0, 0, 0)
    for(i in 0..arr.size-1){
        if(arr[i]>0){
            counter[0]++
        }else if(arr[i]<0){
            counter[1]++
        }else{
            counter[2]++
        }
    }
    for(i in 0..counter.size-1){
        val decimalFormat = DecimalFormat("0.000000")
        println(decimalFormat.format(counter[i].toDouble()/arr.size))
    }
    //println(counter.contentToString())

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
