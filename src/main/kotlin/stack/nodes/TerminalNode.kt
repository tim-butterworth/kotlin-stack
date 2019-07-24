package stack.nodes

import java.util.*

class TerminalNode<T> : StackNode<T> {
    override fun getValue(): Optional<T> = Optional.empty()
    override fun next(): StackNode<T> = this
}