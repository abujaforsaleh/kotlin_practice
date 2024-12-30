package modarate_logical_problems

import java.util.*

fun main(args: Array<String>){

    val scanner = Scanner(System.`in`)
    var questionSet : MutableList<QuestionModel> = mutableListOf()
    questionSet.add(QuestionModel(
        question = "What is the output of 5 + 3 * 2?",
        optionA = "16",
        optionB = "13",
        optionC = "10",
        optionD = "11",
        currectAnswer = "D"))

    questionSet.add(QuestionModel(
        question = "Which programming language is used to build Android apps with Jetpack Compose?",
        optionA = "Java",
        optionB = "Swift",
        optionC = "Kotlin",
        optionD = "Python",
        currectAnswer = "C"))

    questionSet.add(QuestionModel(
        question = "What is the capital of France?",
        optionA = "Berlin",
        optionB = "Paris",
        optionC = "Rome",
        optionD = "Madrid",
        currectAnswer = "B"))

    questionSet.add(QuestionModel(
        question = "Which of these is NOT a data type in Kotlin?",
        optionA = "Int",
        optionB = "Boolean",
        optionC = "String",
        optionD = "Tuple",
        currectAnswer = "D"))

    questionSet.add(QuestionModel(
        question = "What is the boiling point of water at sea level?",
        optionA = "90°C",
        optionB = "100°C",
        optionC = "120°C",
        optionD = "80°C",
        currectAnswer = "B"))

    questionSet.add(QuestionModel(
        question = "Which of these is the keyword to declare a constant in Kotlin?",
        optionA = "const",
        optionB = "val",
        optionC = "var",
        optionD = "let",
        currectAnswer = "A"))

    questionSet.add(QuestionModel(
        question = "What does 'OOP' stand for in programming?",
        optionA = "Object-Oriented Programming",
        optionB = "Optimal Operation Protocol",
        optionC = "Output-Only Processing",
        optionD = "Online Object Parsing",
        currectAnswer = "A"))

    questionSet.add(QuestionModel(
        question = "What planet is known as the 'Red Planet'?",
        optionA = "Venus",
        optionB = "Mars",
        optionC = "Jupiter",
        optionD = "Saturn",
        currectAnswer = "B"))

    questionSet.add(QuestionModel(
        question = "What is 2 raised to the power of 5?",
        optionA = "16",
        optionB = "25",
        optionC = "32",
        optionD = "64",
        currectAnswer = "C"))

    questionSet.add(QuestionModel(
        question = "Which keyword in Kotlin is used to make a function available only to its class and subclasses?",
        optionA = "public",
        optionB = "private",
        optionC = "protected",
        optionD = "internal",
        currectAnswer = "C"))
    var score: Int = 0
    for(question in questionSet){
        println(question.question)
        println("A) ${question.optionA}\tB) ${question.optionB}\tC) ${question.optionC}\tD) ${question.optionD}")
        print("Answer: ")
        when(scanner.nextLine().equals(question.currectAnswer)){
            true -> {
                println("Correct Answer")
                score++
            }
            else -> {println("Wrong Answer")}
        }
        println()
    }

    println("Your score is $score")
}
data class QuestionModel(val question: String, val optionA: String, val optionB: String, val optionC: String, val optionD: String, val currectAnswer: String){


}