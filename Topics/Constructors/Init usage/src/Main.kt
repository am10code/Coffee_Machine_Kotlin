fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(_time: Int) {
    var time: Int = 0
    init {
        time = if(_time>127) 127 else if (_time<-128) -128 else _time
    }
}