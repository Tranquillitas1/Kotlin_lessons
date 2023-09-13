fun main(){
    val reservedToday = 13
    val reservedTommorov = 9
    val compressionResultToday = reservedToday < COUNT_OF_TABLES
    val compressionResultTommorov = reservedTommorov < COUNT_OF_TABLES
    println("Доступность столиков на сегодня: $compressionResultToday\nДоступность столиков на завтра: $compressionResultTommorov")
}
const val COUNT_OF_TABLES = 13