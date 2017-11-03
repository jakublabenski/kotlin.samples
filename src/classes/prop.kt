package classes

// interface with property declaration
interface WithName {
    var name: String
}

// override in primary constructor
class Named(override var name: String) : WithName

// override in property declaration
open class NoName : WithName {
    open override var name = "Annonymous"
}

// override with setter:
class Getter(var id: String) : WithName {
    override var name: String = "z"
        get() = id.capitalize()
}

// override property from base class
class SubNoName : NoName() {
    override var name = "SubName"
}

interface WithEmail {
    val name: String
    val email: String
        get() = name + "@example.com"
}
