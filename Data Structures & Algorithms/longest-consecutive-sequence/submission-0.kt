class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val nums1 = nums.toSet().sorted().toIntArray()
        var maxicount = 1
        var count = 1
        for(i in 1 until nums1.size){
            if(nums1[i] == nums1[i - 1] + 1){
                count++
                maxicount = maxOf(maxicount,count)
            }
            else{
                count = 1
            }
            
        }
        return maxicount
    }
}
