package DynamicProgramming;

class CanBuyAndSellStockIVTab {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;

        // dp[day][canBuy][transactionsLeft]
        int[][][] dp = new int[n + 1][2][k + 1];

        // Loop from last day to first
        for (int day = n - 1; day >= 0; day--) {
            for (int canBuy = 0; canBuy <= 1; canBuy++) {
                for (int t = 1; t <= k; t++) {
                    if (canBuy == 1) {
                        int buy = -prices[day] + dp[day + 1][0][t];
                        int skip = dp[day + 1][1][t];
                        dp[day][1][t] = Math.max(buy, skip);
                    } else {
                        int sell = prices[day] + dp[day + 1][1][t - 1];
                        int skip = dp[day + 1][0][t];
                        dp[day][0][t] = Math.max(sell, skip);
                    }
                }
            }
        }

        // Start at day 0, canBuy = 1, transactions = k
        return dp[0][1][k];
    }
}