class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if(nums.isEmpty()){
            return listOf()
        }
        val list = mutableListOf<List<Int>>()
        val nums1 = nums.sorted()
        val n = nums.size
        for(i in 0 until n-2){
            var j = i+1
            var k = n-1
            if(i>0 && nums1[i]==nums1[i-1]) continue
            while(j<k){
                var sum = nums1[i] + nums1[j] + nums1[k]
                if(sum == 0){
                    list.add(listOf(nums1[i],nums1[j],nums1[k]))
                    while(j<k && nums1[j] == nums1[j+1])j++
                    while(j<k && nums[k] == nums[k-1])k--
                    j++
                    k--

                }
                else if(sum > 0){
                    k--    
                }
                else{
                    j++
                }
            }
        }
        return list

    }
}
