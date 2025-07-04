package DynamicProgramming;

import java.util.Arrays;

class FrogJumpWithKSteps {
    private int solve(int i, int[] height, int k, int[] dp) {
        if (i == 0) return 0;

        if (dp[i] != -1) return dp[i];

        int minCost = Integer.MAX_VALUE;

        for (int j = 1; j <= k; j++) {
            if (i - j >= 0) {
                int cost = solve(i - j, height, k, dp) + Math.abs(height[i] - height[i - j]);
                minCost = Math.min(minCost, cost);
            }
        }

        dp[i] = minCost;
        return dp[i];
    }

    public int frogJump(int[] height, int k) {
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(n - 1, height, k, dp);
    }
}
