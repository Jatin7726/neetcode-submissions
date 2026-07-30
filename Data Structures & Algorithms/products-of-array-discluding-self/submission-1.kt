class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        //this solution still taking O(n) space 
        // //prefix 
        // val prefix = IntArray(nums.size)
        // prefix[0]=1
        // for(i in 1 until nums.size){
        //     prefix[i] = prefix[i-1] * nums[i-1]
        // }

        // //suffix
        // val suffix = IntArray(nums.size)
        // suffix[nums.size-1]=1
        // for(i in nums.size - 2 downTo 0){
        //     suffix[i] = suffix[i+1] * nums[i+1]
        // }
        // val result = IntArray(nums.size)
        // for(i in nums.indices){
        //     result[i] = prefix[i] * suffix[i]
        // }
        // return result


        //now spaces reduction
     
        val result = IntArray(nums.size)
        result[0]=1
       
        for(i in 1 until nums.size){
            result[i] =  result[i-1] * nums[i-1]
        }


        var rightProduct=1
        for(i in nums.size - 2 downTo 0){
           rightProduct *= nums[i+1]
           result[i] *= rightProduct  
        }
       
       
        return result



    }
}
