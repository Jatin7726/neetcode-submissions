class Solution {
    fun reverseString(s: CharArray) {
       var sb  = StringBuilder()
       for(i in s.size - 1 downTo 0){
         sb.append(s[i])
       }
       for(i in s.indices){
         s[i]= sb[i]
       }
    }
}
