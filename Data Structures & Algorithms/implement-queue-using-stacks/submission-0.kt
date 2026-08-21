class MyQueue() {
    val input = ArrayDeque<Int>()
    val output = ArrayDeque<Int>()

    fun push(x: Int) {
        input.addLast(x)
    }

    fun pop(): Int {
        removeIfNeeded()
        return output.removeLast()

    }

    fun peek(): Int {
       removeIfNeeded()
    return output.last()

    }

    fun empty(): Boolean {
        return input.isEmpty()  && output.isEmpty()

    }
    fun removeIfNeeded(){
        if(output.isEmpty()){
            while(input.isNotEmpty()){
                output.addLast(input.removeLast())
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * val obj = MyQueue()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.peek()
 * val param_4 = obj.empty()
 */
