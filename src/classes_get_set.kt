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