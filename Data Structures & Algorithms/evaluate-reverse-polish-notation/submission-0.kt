class Solution {
    fun evalRPN(tokens: Array<String>): Int {

        val stack = ArrayDeque<Int>()

        for (token in tokens) {

            if (token.toIntOrNull() != null) {
                stack.addLast(token.toInt())

            } else {

                val last = stack.removeLast()
                val secondLast = stack.removeLast()

                val result = when (token) {
                    "+" -> secondLast + last
                    "-" -> secondLast - last
                    "*" -> secondLast * last
                    "/" -> secondLast / last
                    else -> 0
                }

                stack.addLast(result)
            }
        }

        return stack.last()
    }
}