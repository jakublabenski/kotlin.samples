package lambdas

// lambda with implicit type
var add = { a: Int, b: Int -> a + b }
// lambda with explicit type
var add2 : (Int, Int) -> Int = add

fun callback(str: String, id: Int,
             arg: (str: String, id: Int) -> Char): Char
{
    return arg(str, id)
}

fun main(args: Array<String>) {
    // direct call:
    { println("test1") }()
    // use library function 'run':
    run { println("basics.getTest2") }

    println(callback("abc", 1, { str, id ->
        str[id]
    }))
}