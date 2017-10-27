// primary constructor, creates one variable property
// var - variable, val - constant
class User1(var name: String)

// primary constructor with explicit constructor keyword
class User2 constructor(val name: String, var id: Int = -1)

// primary constructor with explicit constructor keyword
class User3(_name: String) {
    var name = _name
}

// primary constructor with initializer block
class User5(_name: String) {
    var name: String
    val name2: String

    init {
        name = _name
    }

    init {
        this.name2 = _name
    }
}

open class BaseUser

// primary constructor with call to base class constructor
open class User(var name: String) : BaseUser()

// primary constructor with call to base class constructor
class SuperUser(name: String) : User(name)

// private primary constructor
class PrivatePrimary private constructor()
