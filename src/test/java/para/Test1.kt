package para

import org.junit.jupiter.api.Test

class Test1 {
    fun printMessage(message: String): Unit {                               // 1
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2
        println("[$prefix] $message")
    }

    fun sum(x: Int, y: Int): Int {                                          // 3
        return x + y
    }

    fun multiply(x: Int, y: Int) = x * y                                    // 4

    @Test
    internal fun mainTest() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        printMessage("Hello")                                               // 5
        printMessageWithPrefix("Hello", "Log")                              // 6
        printMessageWithPrefix("Hello")                                     // 7
        printMessageWithPrefix(prefix = "Log", message = "Hello")           // 8
        println(sum(1, 2))
    }
}