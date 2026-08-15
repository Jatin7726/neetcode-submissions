class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        // val count = IntArray(26)
        // var left = 0
        // var maxFreq = 0
        // var answer = 0

        // for (right in s.indices) {

        //     // Right character ko window mein add karo
        //     val index = s[right] - 'A'
        //     count[index]++

        //     // Window ka maximum frequency
        //     maxFreq = maxOf(maxFreq, count[index])

        //     // Agar replacements k se zyada hain
        //     while ((right - left + 1) - maxFreq > k) {

        //         // Left character remove karo
        //         count[s[left] - 'A']--
        //         left++
        //     }
        //      // Valid window ka maximum length
        //     answer = maxOf(answer, right - left + 1)
        // }

        // return answer
        var hmap = mutableMapOf<Char, Int>()
        var ans = 0
        var left = 0
        var maxFreq = 0

        for ( right in s.indices )
        {
            hmap[s[right]] = hmap.getOrDefault(s[right], 0) + 1 // frequency counts
            maxFreq = maxOf(maxFreq, hmap[s[right]]!!) // maxFreq seen so far

            // window size - maxFreq count <= K replacement of characters //true
            // if its greater then we have to make left shift to right
            while ( right- left + 1 - maxFreq > k)
            {
                hmap[s[left]] = hmap[s[left]]!! - 1
                left++
            }

            ans = maxOf(right - left + 1, ans)
        }
        return ans
    
    }
    
}
