class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxi = 0
        var min = Int.MAX_VALUE
        for(price in prices){
            min = minOf(min,price)
            val maxProfit = price - min
            maxi = maxOf(maxi,maxProfit)
        }
        return maxi
    }
}