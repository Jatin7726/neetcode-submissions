class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
       val list = mutableListOf<Int>()
       for(i in nums.indices){
          list.add(nums[i])
       }
       for(j in nums.indices){
         list.add(nums[j])
       }
       return list.toIntArray()
    }
}
