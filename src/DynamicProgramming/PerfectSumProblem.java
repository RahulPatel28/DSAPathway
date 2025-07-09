package DynamicProgramming;

import java.util.Arrays;

public class PerfectSumProblem {
        private static int solve(int i , int target , int[] arr , int[][] dp){
            if(i == 0){
                if(target == 0 && arr[0] == 0) return 2;
                if(target == 0 || target == arr[0]) return 1;
                return 0;
            }

            if(dp[i][target] != -1)return dp[i][target];

            int notPick = solve(i-1 , target , arr ,dp);
            int pick = 0;
            if(target >= arr[i]){
                pick = solve(i-1 , target - arr[i] , arr , dp);
            }
            dp[i][target] = (pick + notPick) %  1_000_000_007;
            return dp[i][target];
        }
        // Function to calculate the number of subsets with a given sum
        public int perfectSum(int[] nums, int target) {
            int n = nums.length;
            int[][] dp = new int[n][target+1];
            for(int[] row : dp){
                Arrays.fill(row , -1);
            }
            return solve(n-1 , target , nums , dp);

        }
    }

