interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println("I'm focusable!")
}

abstract class AbstractButton : Clickable, Focusable {
    abstract fun reset()

    // Must provide showOff implementation, multiple instances
    // inherited from bases
    override fun showOff() {
        // using super to access base classes:
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}

// open to allow RadioButton inheritance
open class Button : AbstractButton() {
    override fun click() = println("Button was clicked")

    override fun reset() {}

    // open to allow overriding:
    open fun toggle() {
    }
}

// open to allow SubButton inheritance
open class RadioButton : Button() {
    final override fun click() = println("RadioButton was clicked")

    override fun toggle() {
    }
}

class SubButton : RadioButton() {
    // disallowed, final in RadioButton:
    // override fun click() = println("Button was clicked")

    override fun showOff() = println("SubButton is clickable!")
}