package DynamicProgramming;

import java.util.Arrays;

class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); // Initialize with -1 to mark unvisited
        return solve(n, dp);
    }

    private int solve(int n, int[] dp) {
        // Base cases
        if (n == 0 || n == 1) return 1;

        // If already computed
        if (dp[n] != -1) return dp[n];

        // Recursively compute and store in dp array
        dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
        return dp[n];
    }
}
