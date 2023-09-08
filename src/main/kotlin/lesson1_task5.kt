fun main() {
    var timeInSpaceBySeconds = 6480
    val timeInSpaceByHourse = ((timeInSpaceBySeconds / 60) / 60)
    val timeInSpaceByMinutes = (timeInSpaceBySeconds - (timeInSpaceByHourse * 60 * 60)) / 60
    timeInSpaceBySeconds = timeInSpaceBySeconds - (((timeInSpaceByHourse * 60) + timeInSpaceByMinutes) * 60)

    print("$timeInSpaceByHourse:$timeInSpaceByMinutes:$timeInSpaceBySeconds"+0)

}