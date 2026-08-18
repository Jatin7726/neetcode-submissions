class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack  = ArrayDeque<Int>()
        var sum = 0
        for(op in operations){
            
            if(op == "+"){
                val last = stack.removeLast()
                val secondLast = stack.last()

                stack.addLast(last)
                stack.addLast(last + secondLast)
            }
            
            if(op == "D"){
                stack.addLast(2 * stack.last())
            }
            if(op == "C"){
                stack.removeLast()
            }
            if(op.toIntOrNull() != null){
              stack.addLast(op.toInt())
            }
            
        }
        return stack.sum()
    }
}
