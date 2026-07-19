class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val map =mutableMapOf<Int,Int>()
        for(i in numbers.indices){
            val compliment = target- numbers[i]
            if(map.containsKey(compliment)){
                return intArrayOf(compliment,numbers[i])
            }
            map[i]= i
        }
        return intArrayOf()

    }
}
class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        val map = mutableMapOf<Int, Int>()

        for (i in numbers.indices) {

            val complement = target - numbers[i]

            if (map.containsKey(complement)) {
                return intArrayOf(complement, numbers[i])
            }

            map[numbers[i]] = i
        }

        return intArrayOf()
    }
}