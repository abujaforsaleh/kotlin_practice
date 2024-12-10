fun main(){
    val n: Int = 5

    for(i in 1..n){
        var tempSum: Int = 0
        for(j in 1..10){
            tempSum+=i
            println("$i X $j = ${tempSum}")
        }
        println()
    }
}