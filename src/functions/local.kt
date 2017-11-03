package functions

class C

fun outer(arg: Int) {
    fun inner(): Int {
        // 'outer' function argument 'arg' is visible in 'inner'
        return 2 * arg;
    }

    // extension can be local too:
    fun C.ext() = 2 * arg
}

var c = C()
// not visible;
// var b = classes.getC.ext()