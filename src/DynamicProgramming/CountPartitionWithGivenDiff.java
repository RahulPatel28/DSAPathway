package DynamicProgramming;

import java.util.Arrays;

public class CountPartitionWithGivenDiff {
        private static int solve(int i , int d , int[] arr , int[][] dp ){
            if(i == 0){
                if(d == 0 && arr[0] == 0)return 2;
                if(d == 0 || arr[0] == d)return 1;
                return 0;
            }

            if(dp[i][d] !=  -1)return dp[i][d];

            int notPick = solve(i-1 , d , arr ,dp);
            int pick = 0;
            if(d  >= arr[i]){
                pick = solve(i-1 , d-arr[i] , arr , dp);
            }
            return dp[i][d] = (pick + notPick) % 1_000_000_007;
        }
        int countPartitions(int[] arr, int d) {

            // code here
            int n = arr.length;
            int totalSum = 0;
            for(int i = 0; i < n; i++){
                totalSum += arr[i];
            }
            if(totalSum - d < 0)return 0;
            if((totalSum - d) % 2 == 1)return 0;
            int s2 = (totalSum - d)/2;

            int[][] dp = new int[n][s2+1];
            for(int[] row : dp){
                Arrays.fill(row , -1);
            }
            return solve(n-1 , s2 , arr , dp);
        }
    }


