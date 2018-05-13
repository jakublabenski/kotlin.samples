package classes

class A(var f: Int = 0) {
    infix fun dodaj(a: Int): A {
        f += a
        return this
    }
}

inline infix fun A.odejmij(a: Int): A {
    this.f -= a
    return this
}

fun f(a : A) {
    val b : A = a dodaj 1 odejmij 2
}