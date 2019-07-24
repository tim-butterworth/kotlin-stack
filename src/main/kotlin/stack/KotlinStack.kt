package stack

import stack.nodes.DataNode
import stack.nodes.StackNode
import stack.nodes.TerminalNode
import java.util.*

class KotlinStack<T> {

    private var stackNode: StackNode<T>

    init {
        stackNode = TerminalNode()
    }

    fun push(value: T) {
        stackNode = DataNode(value, stackNode)
    }

    fun pop(): Optional<T> {
        val result = stackNode.getValue()

        stackNode = stackNode.next()

        return result
    }

    fun empty(): Boolean = stackNode == stackNode.next()
}