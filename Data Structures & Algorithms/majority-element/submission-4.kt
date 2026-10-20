class Solution {
    fun majorityElement(nums: IntArray): Int {
       val map = mutableMapOf<Int,Int>()
       for(i in nums){
         map[i]= map.getOrDefault(i,0)+1
       }
       for((key,value) in map){
           if(value > nums.size/2){
            return key
           }
       }
       return -1

    }
}
