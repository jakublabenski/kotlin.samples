package classes

class Point(val x : Int, val y : Int)
{
    operator fun plus(other: Point): Point
    {
        return Point(x + other.x, y + other.y)
    }
}

fun t(p1 : Point, p2 : Point)
{
    var p3 = p1 + p2

    // compound assignment operator:
    p3 += p2

    // plus, minus, times, div, mod
    // unaryPlus, unaryMinus, nit, inc, dec
    // in
}

