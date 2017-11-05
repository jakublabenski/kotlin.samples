package functions

// function with variable number of parameters:
fun withVarArgs(vararg a: String) {
    for (s in a) {
        println(s)
    }
}

fun checkWithVarArgs(a: Array<String>) {
    // specify each parameter:
    withVarArgs("a", "b", "c")
    // unpack an array with spread operator (*):
    withVarArgs(*a)
}
