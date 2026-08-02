class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        
       var count =0
      
        for(i in nums.indices){
              var currsum = 0
            for(j in nums.indices){
                currsum += currsum + nums[j]
               if(currsum == k){
                    count++
                }

            }
             
        }
        return count
    }
}
