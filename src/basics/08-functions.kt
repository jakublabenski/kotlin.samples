package basics

fun f(a : String) : String { return a + "_suffix"}

fun f1(a : String) = a + "_suffix"

fun d1(a : String = "prefix_") = a + "_suffix"

fun named_arguments(a : Int, b : Int, c : Int, d : Int)
{
    named_arguments(b = 1, a = 0, d = 0, c = c)
}

// varargs:
fun <T> make_list(vararg values: T) {}

fun use() {
    make_list(1, 2, 3, 4)
}

// local functions:
fun with_local(a : Int) : Int
{
    fun local(a : Int): Int {
        return a * 2
    }

    return local(a + 1) * local(a + 2)
}

fun never_returns() : Nothing
{
    throw IllegalAccessError()
}