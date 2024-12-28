package condition_loop_problemsolve

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter a number:")
    val x = scanner.nextInt()

    val classifications = mutableListOf<String>()

    when {
        x < 0 -> classifications.add("Negative")
        x == 0 -> classifications.add("Zero")
        x > 0 -> {
            classifications.add("Positive")
            if(x in 1..10){
                classifications.add("Small Positive Number")
            }
            else{
                classifications.add("Large Positive Number")
            }
        } // General positive classification
    }


    println("Classifications: ${classifications.joinToString(", ")}")
}
