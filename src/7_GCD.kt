fun main(){
    val x: Int = -48
    val y: Int = 18
    val smallest = if(x < y) x else y
    var gcd = 1

    for(i in smallest downTo 1){
        if(x%i==0 && y%i==0){
            gcd = i
            break
        }
    }
    println("gcd:$gcd")
}