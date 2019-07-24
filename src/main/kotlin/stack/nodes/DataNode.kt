package stack.nodes

import java.util.*

class DataNode<T>(val data: T, val next: StackNode<T>) : StackNode<T> {
    override fun getValue(): Optional<T> = Optional.of(data)
    override fun next(): StackNode<T> = next
}