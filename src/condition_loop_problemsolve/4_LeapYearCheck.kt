package condition_loop_problemsolve

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    val year = scanner.nextInt()

    val isLeapYear = if(year%4 == 0 && year%100!=0 || year%400==0){
        "Leap Year"
    }else{
        "Not LeapYear"
    }
    println("$year is $isLeapYear")
}