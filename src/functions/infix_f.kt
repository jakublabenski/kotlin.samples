package functions

class A(var f: Int = 0) {
    infix fun dodaj(a: Int): A {
        f += a
        return this
    }

    override fun toString(): String {
        return f.toString()
    }
}

infix fun A.odejmij(a: Int): A {
    this.f -= a
    return this
}

fun main(args: Array<String>) {
    var a = A(10)
    println(a dodaj 1 odejmij 2)
}