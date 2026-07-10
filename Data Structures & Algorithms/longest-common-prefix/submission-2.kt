class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {

        if(strs.isEmpty()){
            return ""
        }
        for(i in strs[0].indices){
            val ch = strs[0][i]  //b
            for(j in 1 until strs.size){

                //kb fail ho hogi
                if(i>=strs[j].length || strs[j][i]!=ch) {
                    return strs[0].substring(0,i)
                }

            }
        }
        return strs[0]
        
    }
}