fun findMaxProfit(prices: IntArray): Int {
    if (prices.size < 2) {
        return -1 // Not enough data to make a profit
    }

    var maxProfit = 0
    var minPrice = prices[0]
    var buyDay = 0
    var sellDay = 0

    for (i in 1 until prices.size) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]
            buyDay = i
        } else if (prices[i] - minPrice > maxProfit) {
            maxProfit = prices[i] - minPrice
            sellDay = i
        }
    }

    return if (maxProfit == 0) {
        -1 // No profit can be made
    } else {
        println("Buy on day ${buyDay + 1} at price ${prices[buyDay]}")
        println("Sell on day ${sellDay + 1} at price ${prices[sellDay]}")
        println("Max profit: $maxProfit")
        maxProfit
    }
}

fun main() {
    val prices = intArrayOf(100, 180, 260, 310, 40, 535, 695)
    val maxProfit = findMaxProfit(prices)
    if (maxProfit == -1) {
        println("No profit can be made.")
    }
}

