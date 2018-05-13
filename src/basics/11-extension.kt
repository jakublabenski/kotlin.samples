package basics

class C(var prop : Int)


fun C.twice() {
    this.prop = this.prop * 2
}

var C.prop2 : Int
    get() = this.prop - 1
    set(a : Int) { this.prop = a + 1 }

fun m()
{
    var c : C = C(1)

    c.twice()

    var i : Int = c.prop2
}

// Extension needs to be imported to be visible

