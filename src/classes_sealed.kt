
// abstract by default, constructors are private by default
// non-private constructors are not allowed
sealed class Expr {
    class Val: Expr()
    class Sum: Expr()
}

// Since Kotlin 1.1 sub classes may be declared in same file,
// not only in sealed class itself
class Sub: Expr()

//class Mult: Expr()

// when must use all Expr subclasses, or 'else' clause
fun exal(e : Expr) = when (e) {
    is Expr.Val -> 1
    is Expr.Sum -> 2
    is Sub -> 3
    // else -> 4
}

// only classes can be sealed:
// sealed interface I
