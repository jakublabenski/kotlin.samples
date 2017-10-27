
// Collection delegation
class MyString(private val inner : Collection<String> = ArrayList<String>())
    : Collection<String> by inner {

    override fun contains(element: String): Boolean {
        println("Checking element: " + element)
        return false
    }
}

fun f(coll : Collection<String>) {
    val m = MyString(coll)

    m.isEmpty()
}

