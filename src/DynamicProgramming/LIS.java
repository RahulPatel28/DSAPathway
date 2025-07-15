package DynamicProgramming;

import java.util.Arrays;

public class LIS {
        private int solve(int i , int prev , int[] nums , int[][] dp){
            if(i == nums.length)return 0;
            if(dp[i][prev +1] != -1)return dp[i][prev+1];

            int notPick = solve(i+1 , prev ,nums , dp);

            int pick = 0;
            if(prev == -1 || nums[i] > nums[prev]){
                pick = 1+ solve(i+1 , i , nums ,dp);
            }
            return dp[i][prev+1] = Math.max(pick , notPick);
        }
        public int lengthOfLIS(int[] nums) {
            int n = nums.length;

            int[][] dp = new int[n][n+1];
            for(int[] row : dp){
                Arrays.fill(row , -1);
            }
            return solve(0,-1,nums , dp);
        }
    }

