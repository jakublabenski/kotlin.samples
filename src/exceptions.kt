fun check_throw(arg: Int) {
    if (arg == 0) {
        throw IllegalArgumentException("arg is zero")
    }

    // throw as expression:
    var l = if (arg == 1) 1
    else throw IllegalArgumentException("arg is not one")
}

fun check_try(arg: Int) {
    // try as expression
    var i = try {
        // returns:
        check_throw(arg)
    } catch (ex: IllegalArgumentException) {
        return
    }
}