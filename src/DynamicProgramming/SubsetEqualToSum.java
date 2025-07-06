package DynamicProgramming;

import java.util.Arrays;

public class SubsetEqualToSum {

        static boolean solve(int i , int sum , int[] arr , Boolean[][] dp){
            if(sum == 0)return true;
            if(i == 0) return arr[0] == sum;

            if(dp[i][sum] != null)return dp[i][sum];

            boolean notPick = solve(i-1 , sum , arr , dp);
            boolean pick = false;
            if(arr[i] <= sum){
                pick = solve(i-1 , sum - arr[i] , arr , dp);
            }
            dp[i][sum] = pick || notPick;
            return dp[i][sum];
        }
        static boolean isSubsetSum(int arr[], int sum) {
            int n = arr.length;
            // code here
            Boolean[][] dp = new Boolean[n][sum+1];
            for(Boolean[] row : dp){
                Arrays.fill(row , null);
            }
            return solve(n-1 , sum , arr , dp);

        }
    }

