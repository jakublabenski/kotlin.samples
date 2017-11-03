package functions

class ToExtend(var f: Int = 0)

// Extension function:
fun ToExtend.inc() = ++this.f

// Property extension:
val ToExtend.halfField: Int
    get() = this.f / 2

// Property extension:
var ToExtend.halfField2: Int
    get() = this.f / 2
    set(a: Int) {
        this.f = a * 2
    }

fun checkToExtend() {
    var a = ToExtend()
    a.inc()
    var b = a.halfField
}
