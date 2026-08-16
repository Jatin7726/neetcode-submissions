class Solution {
    fun characterReplacement(s: String, k: Int): Int {
       val map= mutableMapOf<Char,Int>()
       var left =0
       var right =0
       var ans = 0
       var maxFreq = 0
       for(right in s.indices){
          map[s[right]] = map.getOrDefault(s[right],0)+1
          maxFreq = maxOf(map[s[right]]!!,maxFreq)

          while(right - left +1 - maxFreq > k){
            map[s[left]] = map[s[left]]!! - 1
            left ++
          }  

          ans = maxOf(ans,right - left +1)
       }
       return ans
    
    }
    
}
