class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {

        val map = mutableMapOf<Int, Int>()
        val stack = ArrayDeque<Int>()

        // Build map from nums2
        for (i in nums2.size - 1 downTo 0) {

            while (stack.isNotEmpty() && stack.last() <= nums2[i]) {
                stack.removeLast()
            }

            if (stack.isEmpty()) {
                map[nums2[i]] = -1
            } else {
                map[nums2[i]] = stack.last()
            }

            stack.addLast(nums2[i])
        }

        // Build answer
        val ans = IntArray(nums1.size)

        for (i in nums1.indices) {
            ans[i] = map[nums1[i]]!!
        }

        return ans
    }
}