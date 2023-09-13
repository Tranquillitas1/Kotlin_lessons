import kotlin.math.pow

fun main(){
    val basedСontribution = 70000
    val interestRate = 16.7
    val yearsTime = 20

    val finalContribution = basedСontribution * (1 + interestRate/100).pow(yearsTime)
    println(String.format("%.3f",finalContribution))
}