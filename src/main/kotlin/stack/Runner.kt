package stack

fun main() {
    val kotlinStack = KotlinStack<String>()

    IntRange(0, 10).forEach {
        kotlinStack.push("String number $it")
    }

    while(!kotlinStack.empty()) {
        println(kotlinStack.pop())
    }
    println(kotlinStack.pop())

    IntRange(0, 10).forEach {
        kotlinStack.push("String number ${it}0")
    }

    println()
    while(!kotlinStack.empty()) {
        println(kotlinStack.pop())
    }
}