class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        //using fixed sliding window
        // val set  = mutableSetOf<Int>()
        // for(i in nums.indices){
        //     if(set.contains(nums[i])){
        //         return true
        //     }
        //     set.add(nums[i])
        //     if(set.size > k){
        //         set.remove(nums[i-k])
        //     }
        // }
        // return false

        //using map
        val map = mutableMapOf<Int,Int>()
        for(i  in nums.indices){
            if(map.containsKey(nums[i])){
                var prevIndex =  map[nums[i]]!!
                if(i- prevIndex <=k ){
                    return true
                }
            }
            map[nums[i]]= i

        }
        return false
    }
}
