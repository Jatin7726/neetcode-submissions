class Solution {
    fun isValid(s: String): Boolean {
        val st = Stack<Char>()
        for(ch in s){
            if(ch == '(' || ch == '[' || ch == '{' ){
                st.push(ch)
            }
            else{
                if(st.isEmpty()){
                    return false
                }
                val top = st.pop()

                if((ch == '}' && top == '{') ||
                (ch == ')' && top == '(') ||
                (ch == ']' && top == '[')    ){
                    st.pop()
                }
                else{
                    return false
                }
                
            }
        }
        return st.size == 0

    }
}
