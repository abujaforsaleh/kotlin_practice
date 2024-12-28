package condition_loop_problemsolve

fun main(){
    val score = 100
    val grade = when(score){
        in 90..100->"A"
        in 80..89->"B"
        in 70..79->"C"
        in 60..69->"D"
        in 50..59->"E"
        in 0..49->"F"
        else -> "Not valid Score"
    }
    println(grade)
}