package classes

class PointR(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

fun f(p : PointR)
{
   val (x, y) = p
}
