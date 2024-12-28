package condition_loop_problemsolve

import java.util.*

fun main(){
    val scan = Scanner(System.`in`)
    val char = scan.nextLine().trim()[0]
    val result = when(char) {
        in 'a'..'z' -> "Lowercase Letter"
        in 'A'..'Z' -> "Uppercase Letter"
        in '0'..'9' -> "Digits"
        else ->"Special Character"
    }
    println(result)



}