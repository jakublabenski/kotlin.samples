val multiLine = """line 1
line 2
line 3
"""

val test = "extra: $multiLine"
val test2 = "extra: ${test}"

val test3 = arrayOf(1, 2, 3, 4, 5)
val test4 = "${test3[1] + 4}"
val test5 = "${if (test3[1] > 5) {
    "abc"
} else "def"}"

val withDollar = """line 1
line 2
$test5${'$'}
line 4
"""

fun main(args: Array<String>) {
    println(withDollar)
}
