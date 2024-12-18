fun main(){

    if(isPrime(2147483647)){
        println("This is a prime number")
    }else{
        println("This is not a prime number")
    }
}
fun isPrime(number: Int): Boolean {

    val half = number / 2
    if(number<2)return false
    if(number%2==0)return false
    for(i in 3 .. half step 2){
        if(number%i==0) {
            println("dividable number is: $i")
            return false
        }
    }
    return true
}