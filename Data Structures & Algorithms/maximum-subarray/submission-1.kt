class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxi  = Int.MIN_VALUE
        var sum = 0
        for(i in nums.indices){
            sum += nums[i]
            maxi = maxOf(maxi,sum)
            if(sum < 0){
                sum = 0
            }
        }
        return maxi
    }
}
