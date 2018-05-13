package basics

fun test(arg: Int): Int {
    // constant initialized instantly:
    val str1: String = "abc"
    // with skipped type:
    val str2 = "abc"

    // constant with delayed initialization
    val str3: String
    if (arg > 0) {
        str3 = "x1"
    } else {
        str3 = "x2"
    }
    if (str3.length > 5) {

    }

    return 0
}
