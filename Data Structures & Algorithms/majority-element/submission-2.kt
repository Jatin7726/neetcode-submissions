class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int,Int>()
        for(i in nums){
            map[i]=map.getOrDefault(i,0)+1

            if(map[i]!!>nums.size/2){
                return i
            }
        }
        return -1

    }
}
