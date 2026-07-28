class Solution {
    fun maxProfit(prices: IntArray): Int {
        // var maxi = 0
        // var min = Int.MAX_VALUE
        // for(price in prices){
        //     min = minOf(min,price)
        //     val maxProfit = price - min
        //     maxi = maxOf(maxi,maxProfit)
        // }
        // return maxi

        var maxi = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        var maxiProfit = 0
        for(price in prices){
             min = minOf(price,min)
             maxiProfit = price - min
             maxi = maxOf(maxi,maxiProfit)
        }
        return maxi
    }
}