class Solution {

    fun encode(strs: List<String>): String {
          val sb = StringBuilder()

    for (str in strs) {
        sb.append(str.length)
        sb.append('#')
        sb.append(str)
    }

    return sb.toString()
    }

    fun decode(s: String): List<String> {
            val result = mutableListOf<String>()
    var i = 0

    while (i < s.length) {

        var j = i

        // Find '#'
        while (s[j] != '#') {
            j++
        }

        // Length of string
        val len = s.substring(i, j).toInt()

        // Extract string
        val word = s.substring(j + 1, j + 1 + len)

        result.add(word)

        // Move pointer
        i = j + 1 + len
    }
    return result

    }
}
