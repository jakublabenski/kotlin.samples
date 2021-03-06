package classes

class Simple

fun checkSimple() {
    var s = Simple()

    println("classes.checkSimple")
    println(s.toString())
    println(s.hashCode())
    println(s.equals(s))
}

class SimpleAB(var a: Int, var b: Int)

fun checkAB() {
    var a = SimpleAB(1, 2)
    var b = SimpleAB(1, 2)

    println("\nclasses.checkAB")
    println("a == b " + (a == b))
    println("a.equals(b) " + a.equals(b))
    println("a === b " + (a === b))
    println("a === a " + (a === a))
}

// data class has auto generated toString, hashCode, copy and equal methods
// only properties declared in primary constructors are used in them
// it is recommended to use val(used) and class to be immutable
data class DataAB(val a: Int, val b: Int)

val c: Int = 3

fun checkDataAB() {
    var a = DataAB(1, 2)
    var b = DataAB(1, 2)

    println("\ncheckSimpleAB")
    println("a == b " + (a == b))
    println("a.equals(b) " + a.equals(b))
    println("a === b " + (a === b))
    println("a === a " + (a === a))
    println("toString " + a)
    println("hashCode " + a.hashCode() + " " + b.hashCode())

    b = b.copy(b = 7)
}

fun main(args: Array<String>) {
    checkSimple()
    checkAB()
    checkDataAB()
}
