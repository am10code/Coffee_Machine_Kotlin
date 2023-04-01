import java.util.*

enum class Rainbow(val color: String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}

fun main() {
    val color = readln()
    for (rainbowColor in Rainbow.values()) {
        if (color == rainbowColor.color.lowercase(Locale.getDefault())) {
            println(rainbowColor.ordinal + 1)
        }
    }
}