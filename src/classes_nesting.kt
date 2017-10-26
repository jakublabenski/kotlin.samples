
class Outer {
    // Do not contain reference to Outer, like static class in Java
    class Nested {
    }

    inner class Inner {
        fun getOuter(): Outer = this@Outer

        inner class InnerInner {
            fun getOuter(): Outer = this@Outer
            fun getInner(): Inner = this@Inner
        }
    }
}