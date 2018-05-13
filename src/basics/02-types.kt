package basics

fun f() {
    val s1: String? = null
    //val y : String = null
    //val y: String = x
    if (s1 != null) {
        val y: String = s1
    }

    // safe call operator: (length or null)
    val i1: Int? = s1?.length

    // Elvis operator:
    val s2: String = s1 ?: "zero"

    val i2: Int = s1?.length ?: 0

}

fun f2(a : Any)
{
    // safe casts:
    val s1 : String? = a as? String

    val s2 : String = a as? String ?: "empty"

    // not-null assertions:
    val a2 : Any = a!!
}

