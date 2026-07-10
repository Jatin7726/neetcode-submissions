class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        val map = mutableMapOf<Int,Int>()
        val list = mutableListOf<Int>()
        for(num in nums){
            map[num]= map.getOrDefault(num,0)+1
        }
        for((key,value) in map){
            if(value > nums.size/3){
                list.add(key)
            }
        }
        return list
    }
}
