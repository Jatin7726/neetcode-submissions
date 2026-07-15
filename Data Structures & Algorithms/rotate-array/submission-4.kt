class Solution {
    fun rotate(nums: IntArray, k: Int) {

        val n = nums.size
        val rotate = k % n

        val temp = IntArray(n)

        for (i in nums.indices) {
            temp[(i + rotate) % n] = nums[i]
        }

        for (i in nums.indices) {
            nums[i] = temp[i]
        }
    }
}