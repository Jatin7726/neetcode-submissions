class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val list = mutableListOf<Int>()
        for(num in nums){
            list.add(num)
        }
        for(nums2 in nums){
            list.add(nums2)
        }
        return list.toIntArray()

    }
}
