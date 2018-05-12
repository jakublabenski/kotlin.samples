package basics

class Person1(val name: String)

val p = Person1("test")
val n = p.name

class Person2(
        // read-only property with backing field and trivial getter
        val name: String,
        // writabl property with backing field, a getter and setter
        var isMarried: Boolean
)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        // Property getter declaration
        get() {
            return height == width
        }
}


// accessing backing field from its accessors
class NameAddress(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("Address changed for $name: \"$field\" -> \"$value\"")
            // 'field' is backing field
            field = value
        }

    var street: String = "unknown"
    // limiting accessor visibility, cannot be used outsize of class
        private set
}

fun main(args: Array<String>) {
    var v = NameAddress("abd")
    v.address = "new"

    // getter is compiler generated and accessible:
    println(v.street)
    // inaccessible:
    //v.street = "Kiełkowskiego"
}