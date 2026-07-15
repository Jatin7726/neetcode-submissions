class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val map = mutableMapOf<String , MutableList<String>>()
        for(word in strs){
            val key = word.toCharArray().sorted().joinToString("")

            if(!map.containsKey(key)){
                val list = mutableListOf<String>()
                list.add(word)
                map[key] = list
            }
            else{
                map[key]!!.add(word)
            }

        }
        return map.values.toList()
    }
}