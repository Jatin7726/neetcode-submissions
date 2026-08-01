class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
       val map = mutableMapOf<Int,Int>()
       for(i in nums){
        map[i]=map.getOrDefault(i,0)+1
       }
       for((key,value) in map){
         if(value > 1){
            return true
         }
       }
       return false

    }
}
