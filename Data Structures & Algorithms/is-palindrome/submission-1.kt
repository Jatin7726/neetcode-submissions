class Solution {
    fun isPalindrome(s: String): Boolean {
        val str = s.lowercase().filter { it.isLetterOrDigit() }
        var i = 0 
        var j = str.length -1
        while(i<=j){
           if(str[i] != str[j]){
                return false
           }
           i++
           j--
        }
        return true
    }
}
