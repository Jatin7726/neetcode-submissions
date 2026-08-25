class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false

        val count1 = IntArray(26)
        val count2 = IntArray(26)

        // s1 ka frequency count
        for (ch in s1) {
            count1[ch - 'a']++
        }

        // Sliding window
        for (right in s2.indices) {
            count2[s2[right] - 'a']++

            // Window ko s1 ki length ka rakho
            if (right >= s1.length) {
                count2[s2[right - s1.length] - 'a']--
            }

            // Frequencies same?
            if (count1.contentEquals(count2)) {
                return true
            }
        }

        return false
    }
}