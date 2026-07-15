class Solution {
    fun moveZeroes(nums: IntArray) {
        var  i =0
        var j =0
        while(i<nums.size){
           
            if(nums[i]!=0){
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                j++
            }
            i++
        }
        while(i<nums.size){
            nums[i]=0
            i++
        }
    }
}
