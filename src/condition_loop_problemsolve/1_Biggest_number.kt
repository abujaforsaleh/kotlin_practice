package condition_loop_problemsolve

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    println("Enter three numbers:")
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()
    val biggest = if(a>=b && a>=c && a>=d){
        a
    }else if(b>=c && b>=d){
        b
    }else if(c>=d){
        c
    }else d
    println("biggest number: $biggest")
    println("biggest number using maxof: ${maxOf(a, b, c, d)}")
}