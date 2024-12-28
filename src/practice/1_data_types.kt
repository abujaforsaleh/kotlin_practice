package practice

import java.util.*

fun main(){
    val x = 12

    var res = when(x) {
        in 1..100->{
            println("x is in the range between 1 and 100")
            12
        }
        else -> "x is not between 1 and 100"
    }
    println(res)
}