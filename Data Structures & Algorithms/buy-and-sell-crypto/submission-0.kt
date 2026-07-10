class Solution {
    fun maxProfit(prices: IntArray): Int {

        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {

            // Buy at the lowest price seen so far
            if (price < minPrice) {
                minPrice = price
            }

            // Profit if sold today
            val profit = price - minPrice

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit
            }
        }

        return maxProfit
    }
}