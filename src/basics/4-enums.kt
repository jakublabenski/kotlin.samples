package basics

enum class Colors(val red: Int, val green: Int, val blue: Int) {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    WHITE(255, 255, 255), BLACK(0, 0, 0);

    fun toInt() = (red * 256 + green) * 256 + blue
}

fun Colors.str(): String {
    when (this) {
        Colors.RED -> "red"
        Colors.GREEN -> "green"
        Colors.BLUE, Colors.WHITE -> "blue"
    }
    return "other"
}

fun Colors.str2(): Int {
    when (setOf(this)) {
        setOf(Colors.RED, Colors.BLUE, Colors.GREEN) -> 0
        setOf(Colors.BLACK, Colors.WHITE) -> 1
    }
    return 3
}

fun Colors.int(): Int {
    when {
        (red > blue) && (red > green) -> 1
        (red < blue) && (red > green) -> 2
        (red == blue) && (red == green) -> 3
        // default in C++, 'else' in Kotlin:
        else -> 0
    }
    return 3
}