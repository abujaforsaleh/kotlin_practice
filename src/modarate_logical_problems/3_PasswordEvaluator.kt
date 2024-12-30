package modarate_logical_problems

fun main(){
    val password: String = "Pulok&1234"

    var hasUppercase: Boolean = password.any { it.isUpperCase() }
    var hasLowercase: Boolean = password.any { it.isLowerCase() }
    var hasDigit: Boolean = password.any { it.isDigit() }
    var hasSpecialChar: Boolean = password.any { !it.isLetterOrDigit() }
    println("hasUpperCase = ${hasUppercase.toString()}, hasLowercase = ${hasLowercase.toString()}, hasDigit = ${hasDigit.toString()}, hasSpecialChar = ${hasSpecialChar.toString()}")
    println(when(listOf(hasUppercase, hasLowercase, hasDigit, hasSpecialChar, hasUppercase).count{it}){
        in 4..5->"Strong"
        3->"Medium"
        else->"Week"

    })

}