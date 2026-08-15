class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val count = IntArray(26)
        var left = 0
        var maxFreq = 0
        var answer = 0

        for (right in s.indices) {

            // Right character ko window mein add karo
            val index = s[right] - 'A'
            count[index]++

            // Window ka maximum frequency
            maxFreq = maxOf(maxFreq, count[index])

            // Agar replacements k se zyada hain
            while ((right - left + 1) - maxFreq > k) {

                // Left character remove karo
                count[s[left] - 'A']--
                left++
            }
             // Valid window ka maximum length
            answer = maxOf(answer, right - left + 1)
        }

        return answer
    }
    
}
