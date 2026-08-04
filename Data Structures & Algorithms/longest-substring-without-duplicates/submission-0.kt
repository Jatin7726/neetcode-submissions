class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var left = 0
        var maxlen = 0
        //sliding  window
        var set = mutableSetOf<Char>()
        for(right  in s.indices){

            //condition
            while(set.contains(s[right])){
                set.remove(s[left])
                left++
            }
            set.add(s[right])
            maxlen = maxOf(maxlen,right - left +1)
        }
        return maxlen

    }
}
