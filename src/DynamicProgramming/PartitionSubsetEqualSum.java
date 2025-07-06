package DynamicProgramming;

import java.util.Arrays;

public class PartitionSubsetEqualSum {
        static boolean solve(int i , int k , int[] nums , Boolean[][] dp){
            if(k == 0)return true;
            if(i == 0)return nums[i] == k;

            if(dp[i][k] != null)return dp[i][k];

            boolean notPick = solve(i-1 , k , nums , dp);
            boolean pick = false;
            if(nums[i] <= k){
                pick = solve(i-1 , k-nums[i] , nums , dp);
            }
            dp[i][k] = pick || notPick;
            return dp[i][k];
        }
        public boolean canPartition(int[] nums) {
            int n = nums.length;
            int totalSum = 0;
            for(int num : nums)totalSum += num;
            int k = totalSum/2;
            if(totalSum % 2 != 0)return false;
            Boolean[][] dp = new Boolean[n][k+1];
            for(Boolean[] row : dp){
                Arrays.fill(row,null);
            }
            return solve(n-1 , k , nums , dp);

        }
    }

