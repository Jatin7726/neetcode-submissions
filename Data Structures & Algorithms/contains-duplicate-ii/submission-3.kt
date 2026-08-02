class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val map = mutableMapOf<Int,Int>()
        for(i in nums.indices){

            if(map.containsKey(nums[i])){
                val prevIndex = map[nums[i]]!!
                if(i - prevIndex <= k){
                    return true
                }
            }
            map[nums[i]]=i

        }
        return false
    }
}
