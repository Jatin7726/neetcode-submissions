class Solution {
    fun sortColors(nums: IntArray) {
        var i = 0
        var j = 0
        var k = nums.size - 1
        while(j<=k){
            if(nums[j]==0){
                val temp= nums[i]
                nums[i]= nums[j]
                nums[j]=temp
                i++
                j++
                // nums.swap(i,j)
                // i++
                // j++
            }
            else if(nums[j]==1){
                j++   
            }
            else{
                val temp1 = nums[j]
                nums[j]= nums[k]
                nums[k]=temp1
                k--
            }
        }

    }
}
