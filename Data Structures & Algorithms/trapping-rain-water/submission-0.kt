class Solution {
    fun trap(height: IntArray): Int {
        var left =0
        var right = height.size -1
        var maxLeft = 0
        var maxRight = 0
        var area = 0
        while(left <= right){
            if(maxLeft <= maxRight){
                maxLeft = maxOf(maxLeft,height[left]) //maxleft nikalo 
                area += maxLeft - height[left] //area nikalo jo kum height space le rha use remove kro
                left++ //index badhado
            }
            else{
                maxRight = maxOf(maxRight,height[right])
                area += maxRight - height[right]
                right--
            }
        }
        return area

    }
}
