class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxisum = nums[0]
        var sum = 0
        for(i in nums.indices){
            sum = sum + nums[i]
            maxisum = maxOf(maxisum,sum)
            if(sum<0){
                sum=0
            }
        }
        return maxisum;

    }
}
