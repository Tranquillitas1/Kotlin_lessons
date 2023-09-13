
fun main(){
    var from = "E2"
    var to = "E4"
    var turnNumber = 1

    val firstTurnName = "$from - $to #$turnNumber"
    println(firstTurnName)

    from = "D2"
    to = "D3"
    turnNumber += 1
    val secondTurnName = "$from - $to #$turnNumber"
    println(secondTurnName)
}