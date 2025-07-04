package DynamicProgramming;

import java.util.Arrays;

class MaxSumOfNonAdjElement {
    private int solve(int i, int[] arr, int[] dp) {
        if (i == 0) return arr[0];
        if (i < 0) return 0;

        if (dp[i] != -1) return dp[i];

        int pick = arr[i] + solve(i - 2, arr, dp); // pick current
        int notPick = solve(i - 1, arr, dp);       // skip current

        dp[i] = Math.max(pick, notPick);           // store & return max
        return dp[i];
    }

    public int maximumNonAdjacentSum(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(n - 1, arr, dp); // start from last index
    }
}
