class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
           var i = 0
        var j = nums.size - 1

        while (i <= j) {

            // Skip all occurrences of val from the end
            while (i <= j && nums[j] == `val`) {
                j--
            }

            // If current element is val, swap it with the last valid element
            if (i <= j && nums[i] == `val`) {
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                j--
            } else {
                // Current element is valid
                i++
            }
        }

        // Number of valid elements
        return j + 1
    }
}
