class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        var left =0
        var right  = nums.size -1
        while(left<right){
            if(nums[left] == nums[right] && abs(left-right) == k){
                return true
            }
            left++
            right--
        }
        return false

    }
}
