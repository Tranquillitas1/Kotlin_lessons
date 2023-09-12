fun main() {
    val countOfWorker = 50
    val workersSalary = 30000
    val countOfNewbee = 30
    val newbeesSalary = 20000

    val workersCost = countOfWorker * workersSalary
    val newbeesCost = countOfNewbee * newbeesSalary
    val totalSalary = workersCost + newbeesCost
    val averageSalaryForWorker = totalSalary / (countOfWorker + countOfNewbee)

        println("Расход на постоянных сотрудников составил: $workersCost")

    println("Расход на стажёров составил: $newbeesCost")
    println("Средняя оплата сотрудника после устройста стажёров составила: $averageSalaryForWorker")
}