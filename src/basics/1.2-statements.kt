package basics

fun f(a : Int, b : Int) {
    var m2: Int
    if (a > b) {
        m2 = a
    } else {
        m2 = b
    }

    // As expression
    val m3 = if (a > b) a else b

    // As expression with blocks
    val m4 = if (a > b) {
        print("Choose a")
        a
    } else {
        print("Choose b")
        b
    }
}

fun w(x : Int, y : Any) {
    when (x) {
        1 -> print("x == 1")
        2, 3 -> print("x == 2")
        in 4..10 -> print("x == 4..10")
        !in 11..20 -> print("x != 11..20")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }

    // Checks if 'y' is of a particular type:
     when(y) {
        is String -> y.startsWith("prefix")
        else -> false
    }

    // As replacement for an if-else-if chain:
    when {
        x > 10 -> print("x is odd")
        x < 10 -> print("x is even")
        else -> print("x is funny")
    }
}

fun check_throw(arg: Int) : Int { return 0}

fun check_try(arg: Int) {
    // try as expression
    var i = try {
        // returns:
        check_throw(arg)
    } catch (ex: IllegalArgumentException) {
        return
    }
}

fun for_loops(ints : Array<Int>, collection : Collection<String>)
{
    // Iterate over collections:
    for (item in collection) print(item)

    // Iterate over collections:
    for (item: Int in ints) {}

    // Iterate over range:
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}

fun while_loops(a : Int)
{
    var x : Int = a
    while (x > 0) {
        x--
    }

    do {
        val y = 0
    } while (y != null) // y is visible here!
}
