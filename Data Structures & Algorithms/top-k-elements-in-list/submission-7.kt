class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val list = mutableListOf<Int>()
        val map = mutableMapOf<Int, Int>()
        for(num in nums){
            map[num]= map.getOrDefault(num,0)+1
        }
       val sorted = map.entries.sortedByDescending { it.value }

        // Step 3: Take first k keys
        val result = IntArray(k)

        for (i in 0 until k) {
            result[i] = sorted[i].key
        }

        return result
    }
}
