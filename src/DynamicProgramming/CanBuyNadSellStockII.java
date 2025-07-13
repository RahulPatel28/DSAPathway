package DynamicProgramming;

import java.util.Arrays;

public class CanBuyNadSellStockII {
        private int solve(int i, int canBuy, int[] prices, int[][] dp) {
            if (i == prices.length) return 0;

            if (dp[i][canBuy] != -1) return dp[i][canBuy];

            int profit = 0;

            if (canBuy == 1) {
                int buy = -prices[i] + solve(i + 1, 0, prices, dp);
                int skip = solve(i + 1, 1, prices, dp);
                profit = Math.max(buy, skip);
            } else {
                int sell = prices[i] + solve(i + 1, 1, prices, dp);
                int skip = solve(i + 1, 0, prices, dp);
                profit = Math.max(sell, skip);
            }

            return dp[i][canBuy] = profit;
        }

        public int maxProfit(int[] prices) {
            int n = prices.length;
            int[][] dp = new int[n][2];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }

            return solve(0, 1, prices, dp);
        }
    }

