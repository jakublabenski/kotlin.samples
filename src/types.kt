fun test(arg: Int): Int {
    // value initialized instantly:
    val str1: String = "abc"
    // value with delayed initialization
    val str2: String

    if (arg > 0) {
        str2 = "x1"
    } else {
        str2 = "x2"
    }
    if (str2.length > 5) {

    }

    return 0
}
