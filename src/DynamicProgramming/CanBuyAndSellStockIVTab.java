package DynamicProgramming;

class CanBuyAndSellStockIVTab {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][][] dp = new int[n + 1][2][3];

        // No need to fill base cases because Java arrays are initialized to 0
        // dp[n][...][...] = 0 → already 0
        // dp[...][...][0] = 0 → already 0

        for (int i = n - 1; i >= 0; i--) {
            for (int canBuy = 0; canBuy <= 1; canBuy++) {
                for (int cap = 1; cap <= 2; cap++) {

                    if (canBuy == 1) {
                        int buy = -prices[i] + dp[i + 1][0][cap];
                        int skip = dp[i + 1][1][cap];
                        dp[i][1][cap] = Math.max(buy, skip);
                    } else {
                        int sell = prices[i] + dp[i + 1][1][cap - 1];
                        int skip = dp[i + 1][0][cap];
                        dp[i][0][cap] = Math.max(sell, skip);
                    }
                }
            }
        }

        return dp[0][1][2]; // Start from day 0, canBuy = 1, and 2 transactions allowed
    }
}