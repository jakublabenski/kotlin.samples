package classes

// no primary constructor, two secondary constructors
open class Player {
    constructor(name: String) {
    }

    constructor(id: Int, name: String) {
    }
}

class SuperPlayer : Player {
    constructor(extra : Int, id: Int, name: String)
            : super(id, name) {
    }

    constructor(name: String)
            : this(-1, -1, name) {
    }
}

