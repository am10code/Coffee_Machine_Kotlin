class Box(var height: Double, var width: Double, var length: Double) {
    fun getVolume(): Double{
        return height * width * length
    }
}