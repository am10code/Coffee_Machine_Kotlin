fun f(x: Double): Double {
    return if (x <= 0.0) {
        f1(x)
    } else if (x >= 1.0) {
        f3(x)
    } else {
        f2(x)
    }
}

// implement your functions here
fun f1(x: Double) = x*x+1.0

fun f2(x: Double) = 1.0/(x*x)

fun f3(x: Double) = x*x-1.0