class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
       val set  = mutableSetOf<Int>()
       for(i in nums.indices){
          if(set.contains(nums[i])){
             return true
          }
          set.add(nums[i])
       }
       return false
    }
}
