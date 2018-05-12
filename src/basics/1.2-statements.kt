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

fun w(x : Int) {
    when (x) {
        1 -> print("x == 1")
        2, 3 -> print("x == 2")
        in 4..10 -> print("x == 4..10")
        !in 11..20 -> print("x != 11..20")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
}

