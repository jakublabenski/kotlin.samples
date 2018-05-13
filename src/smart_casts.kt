import java.util.*

open class Base {
    fun in_base() = 0
}

class Sub : Base() {
    fun in_sub() = 0
}

fun work(base: Base) {
    println("Base called")
}

fun work(sub: Sub) {
    println("Sub called")
}

fun check_casts(base: Base, s: Sub) {
    // explicit cast (throws if base is not Sub)
    val m = base as Sub
    //
    if (base is Sub) {
        // base has now Sub type
        base.in_sub()
        // work(Sub) called
        work(base)
    }
}

fun check_when(base: Base) {
    when (base) {
        is Base -> println("is base")
        is Sub -> println("is sub")
        else -> println("something other")
    }
}

fun main(args: Array<String>) {
    check_casts(Sub(), Sub())
}



