import kotlin.time.times

fun main(){
    val cristal = 7
    val iron = 11

    val buffValue = 0.2

    val cristalWithBuff = cristal * buffValue
    val ironWithBuff = iron * buffValue
    println(cristalWithBuff.toInt())
    println(ironWithBuff.toInt())
}
