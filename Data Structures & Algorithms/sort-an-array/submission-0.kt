class Solution {
    fun merge(nums:IntArray,left:Int,mid:Int,right:Int){
        val temp = IntArray(right - left +1)
        var k=0
        var i= left
        var j= mid +1 
        while(i<= mid && j<= right){
            if(nums[i]<= nums[j]){
                temp[k]= nums[i]
                i++
            }
            else{
                temp[k]= nums[j]
                j++
            }
            k++
        }
        while(i<=mid){
            temp[k]=nums[i]
            i++
            k++
        }
        while(j<=right){
            temp[k]=nums[j]
            j++
            k++
        }
        //
        for(i in temp.indices){
            nums[left + i]= temp[i]
        }
    }
    fun mergeSort(nums:IntArray,left:Int, right:Int){
        //base condition
        if(left>=right) return
        var mid = (left + right)/2
        
        //first array
        mergeSort(nums,left,mid)
        //second array  
        mergeSort(nums,mid+1,right)
        //now merge both
        merge(nums,left,mid,right)
    }
    fun sortArray(nums: IntArray): IntArray {
        mergeSort(nums,0,nums.size -1)
        return nums
    }
}
