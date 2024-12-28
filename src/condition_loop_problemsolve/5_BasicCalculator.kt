package condition_loop_problemsolve

import java.util.*
import kotlin.jvm.Throws

fun main(){
    val scanner = Scanner(System.`in`)
    val num1 = scanner.nextInt()
    val num2 = scanner.nextInt()

    scanner.nextLine()
    val operator = scanner.nextLine()
    val result = when (operator) {
        "+"->num1 + num2
        "-"->num1 - num2
        "*"->num1 * num2
        "/"->{
            try {
                num1 / num2
            }catch (e: ArithmeticException) {
                "Division by zero is not allowed."
            }
        }
        else -> throw IllegalArgumentException()
    }
    println(result)
}