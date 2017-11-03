package functions

fun getTen() = 10

// default parameter value:
fun add(a: Int, b: Int = 10, c: Int = getTen()) = a + b + c

fun check() {
    add(1, 2, 3)
    // uses default parameter value:
    add(2)
    // named arguments:
    add(b = 1, a = 2)
}
