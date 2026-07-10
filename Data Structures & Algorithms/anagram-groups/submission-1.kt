class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val map = HashMap<String, MutableList<String>>()

    for (word in strs) {

        val count = IntArray(26)

        // Count each character
        for (ch in word) {
            count[ch - 'a']++
        }

        // Create key
        var key = ""
        for (i in count.indices) {
            key = key + "#" + count[i]
        }

        // Add word to map
        if (map.containsKey(key)) {
            map[key]!!.add(word)
        } else {
            map[key] = mutableListOf(word)
        }
    }

    return map.values.toList()
}
}