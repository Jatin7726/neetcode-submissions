class Solution {
    fun removeDuplicates(s: String, k: Int): String {
        val stack = ArrayDeque<Pair<Char,Int>>()
        for(ch in s){
            if (stack.isNotEmpty() && stack.last().first == ch) {

                val count = stack.last().second + 1

                stack.removeLast()

                if (count < k) {
                    stack.addLast(Pair(ch, count))
                }

            }
            else{
                stack.addLast(Pair(ch,1))
            }
        }
        val result = StringBuilder()

        for ((ch, count) in stack) {
            repeat(count) {
                result.append(ch)
            }
        }

        return result.toString()
    }
}
