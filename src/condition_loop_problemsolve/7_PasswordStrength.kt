package condition_loop_problemsolve

import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    val passWord = sc.nextLine()
    val passQuality = when{
        passWord.length in 6..10->"Medium"
        passWord.length > 10->{
            var isStrong = false
            for(char in passWord){

                if (char in '0'..'9' || char !in 'a'..'z' && char !in 'A'..'Z'){
                    isStrong = true
                    break
                }
            }
            if(isStrong){
                "Strong"
            }else{
                "Medium"
            }
        }
        else ->"Week"
    }
    println(passQuality)
}