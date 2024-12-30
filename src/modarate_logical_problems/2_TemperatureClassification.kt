package modarate_logical_problems

import java.util.*

private fun main(){
    val scan = Scanner(System.`in`)
    val inC = scan.nextInt()
    val result = when(inC){
        in Int.MIN_VALUE..0->"Freezing"
        in 1..15->"Cold"
        in 16..30->"Moderate"
        else->"Hot"
    }
    println("${cTof(inC)}°F")
    println(result)


    main()
}
fun cTof(valInC: Int): Int{
    return ((valInC*1.8)+32).toInt()
}