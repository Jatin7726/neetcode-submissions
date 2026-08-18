class Solution {
    fun isValid(s: String): Boolean {
       val stack = ArrayDeque<Char>()
       for(ch in s){
         if(ch == '[' || ch == '(' || ch == '{'){
            stack.addLast(ch)
         }
         else{
            if(stack.isEmpty()){
                return false
            }
            val top = stack.removeLast()
            if(ch == ')' && top != '('){
                return false
            }
             if(ch == ']' && top != '['){
                return false
            }
            if(ch == '}' &&   top!= '{'){
                return false
            }
         }
       }
       return stack.isEmpty()
    }
}
