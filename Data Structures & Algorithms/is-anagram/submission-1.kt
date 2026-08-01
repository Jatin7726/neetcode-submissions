class Solution {
    fun isAnagram(s: String, t: String): Boolean {
       val map1 = mutableMapOf<Char,Int>()
       val map2 = mutableMapOf<Char,Int>()
       for(i in s ){
          map1[i]=  map1.getOrDefault(i,0)+1
       }
       for(j in t){
         map2[j]= map2.getOrDefault(j,0)+1
       }
       if(map1 == map2){
        return true
       }
       return false
    }
    
}
