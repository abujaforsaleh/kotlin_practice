package modarate_logical_problems

import java.util.Scanner

private fun main(){
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val printmsg = if(a+b>c && b+c>a && c+a>b){
        when{
            a==b && b==c-> "Equilateral"
            a==b || b==c || c==a -> "Isosceles"
            else -> "Scalene"
        }
    }else{
        "This is not a valid triangle type"
    }
    println(printmsg)

}