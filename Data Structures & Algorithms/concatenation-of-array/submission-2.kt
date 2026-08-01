class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val list = nums.toMutableList()
        for(num in nums){
            list.add(num)
        }
        return list.toIntArray()

    }
}
