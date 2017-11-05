var range = 1..100
var range2 = 1..100 step 3
var range3 = 100 downTo 1 step 5

// from 1 to 99:
var rangeUntil = 1 until 100

fun loop() {
    for (i in range3) {
        println(i)
    }
}

fun check_in(arg: Int) {
    // in:
    if (arg in range3) {
    }
    // not in:
    if (arg !in range3) {
    }
}
