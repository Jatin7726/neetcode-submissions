class Solution {

    fun rotate(nums: IntArray, k: Int) {
        val n = nums.size
        val rotate = k % n

        reverse(nums,0, n-1)
        reverse(nums,0,rotate -1)
        reverse(nums,rotate , n -1)

       
    }

    fun reverse(nums:IntArray, left:Int , right: Int ){
        var  i = left
        var j= right
        while(i < j){
            val temp = nums[i]
            nums[i]= nums[j]
            nums[j]= temp
            i++
            j--
        }
    }
}