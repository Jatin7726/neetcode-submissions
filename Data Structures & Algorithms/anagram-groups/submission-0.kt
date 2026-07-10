class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = mutableMapOf<String, MutableList<String>>()

        for (word in strs) {

            val count = IntArray(26)

            for (ch in word) {
                count[ch - 'a']++
            }

            // Create unique key manually
            val key = StringBuilder()

            for (num in count) {
                key.append("#")
                key.append(num)
            }

            map.getOrPut(key.toString()) {
                mutableListOf()
            }.add(word)
        }

        return map.values.toList()
    }
}