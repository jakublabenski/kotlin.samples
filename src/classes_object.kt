
object Singleton {
    val name : String = "Name"
}

fun singletonCheck() {
    var s = Singleton.name
}

// Internal object can act like static members in Java
data class Parent(val name: String) {
    object StaticPretender {
        val likeStaticField : String = "Name"

        fun likeStatic(): Int = 42
    }
}

fun parentCheck() {
    var s = Parent.StaticPretender.likeStaticField
    var i = Parent.StaticPretender.likeStatic()
}


// Internal object can act like friends
data class ClassWithFriend(val name: String) {
    companion object FriendPretender {
        val likeStaticField : String = "Name"

        // I'm a friend, I can access private parts
        fun likeStatic(parent: ClassWithFriend) = parent.doSomething()
    }
    private fun doSomething() = -1
}

fun classWithFriendCheck() {
    var s = ClassWithFriend.FriendPretender.likeStaticField
    var i = ClassWithFriend.FriendPretender.likeStatic(ClassWithFriend("abc"))
}

// Internal object has no name
data class ClassWithAnonymousFriend(val name: String) {
    // anonymous object (has to be member of a class)
    companion object {
        val likeStaticField : String = "Name"
    }
}

fun classWithAnonymousFriendCheck() {
    var s = ClassWithAnonymousFriend.likeStaticField
}

// use factory methods instead of constructors
class IHaveFactory private constructor(val what: String) {
    companion object {
        fun create(what : String) = IHaveFactory(what)
        fun createDefault() = IHaveFactory("what")
    }
}

fun iHaveFactoryCheck() {
    val v = IHaveFactory.createDefault()
}

