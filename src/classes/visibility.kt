package classes

// public by default, visible everywhere
class PublicByDefault {}

// visible in a file:
private class Private {}

// visible in a module:
internal class Internal {}

open class C {
    // public bu default, visible everywhere
    fun publicF() {}

    // visible in a class
    private fun privateF() {}

    // visible in subclasses (in java visible in the same package)
    internal fun protectedF() {}

    // visible in a module
    protected fun internalF() {}
}
