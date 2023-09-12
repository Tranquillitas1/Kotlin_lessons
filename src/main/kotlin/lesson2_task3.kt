fun main(){
    val exitTimeByHour = 9
    val exitTimeByMinute = 39
    val fullTimeInRoadByMinute = 457

    val timeInRoadByHour = fullTimeInRoadByMinute / 60
    val timeInRoadByMinute = fullTimeInRoadByMinute - (timeInRoadByHour * 60)

    val arrivalTimeByHour = exitTimeByHour + timeInRoadByHour + (exitTimeByMinute + timeInRoadByMinute) / 60
    val arrivalTimeByMinute = (exitTimeByMinute + timeInRoadByMinute) % 60
    println("$arrivalTimeByHour:$arrivalTimeByMinute")
}