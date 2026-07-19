class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        val ch1 = word1.toCharArray()
        val ch2 = word2.toCharArray()
        var i=0
        var j=0
        val temp= CharArray(word1.length + word2.length)
        var k=0
        while(i< ch1.size && j <ch2.size){
             temp[k]= ch1[i]
             i++
             k++
             temp[k]= ch2[j]
             j++
             k++
        }
        while(i< ch1.size){
            temp[k]= ch1[i]
            i++
            k++
        }
         while(j< ch2.size){
            temp[k]= ch2[j]
            j++
            k++
        }
        return temp.joinToString("")


    }
}
