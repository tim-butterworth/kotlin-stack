package stack.nodes

import java.util.*

interface StackNode<T> {
    fun getValue(): Optional<T>
    fun next(): StackNode<T>
}