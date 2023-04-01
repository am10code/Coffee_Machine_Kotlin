fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = x1, y4: Double = y1): Double {
    val side1: Double = Math.hypot(x2-x1, y2-y1)
    val side2: Double = Math.hypot(x3-x2, y3-y2)
    val side3: Double = Math.hypot(x4-x3, y4-y3)
    val side4: Double = Math.hypot(x4-x1, y4-y1)

    return side1+side2+side3+side4
}