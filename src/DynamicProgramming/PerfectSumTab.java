package DynamicProgramming;

public class PerfectSumTab {
        private static final int mod = 1_000_000_007;

        public int perfectSum(int[] nums, int target) {
            int n = nums.length;
            int[][] dp = new int[n][target + 1];

            // Base Case 1: target == 0 → one way (empty subset)
            for (int i = 0; i < n; i++) {
                dp[i][0] = 1;
            }

            // Base Case 2: first element
            if (nums[0] <= target) dp[0][nums[0]] = 1;
            if (nums[0] == 0) dp[0][0] = 2;  // pick or not pick zero

            for (int i = 1; i < n; i++) {
                for (int t = 0; t <= target; t++) {
                    int notPick = dp[i - 1][t];
                    int pick = 0;
                    if (nums[i] <= t) {
                        pick = dp[i - 1][t - nums[i]];
                    }
                    dp[i][t] = (pick + notPick) % mod;
                }
            }

            return dp[n - 1][target];
        }
    }


