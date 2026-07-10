class Solution {

    fun rotate(nums: IntArray, k: Int) {

        val rotate = k % nums.size

        reverse(nums, 0, nums.size - 1)
        reverse(nums, 0, rotate - 1)
        reverse(nums, rotate, nums.size - 1)
    }

    fun reverse(nums: IntArray, start: Int, end: Int) {

        var left = start
        var right = end

        while (left < right) {
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp

            left++
            right--
        }
    }
}