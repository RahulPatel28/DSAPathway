package DynamicProgramming;

import java.util.Arrays;

public class FrogJump {
        private int solve(int i , int[] height , int[] dp){
            if(i == 0)return 0;
            if(dp[i] != -1)return dp[i];
            int stepOne = solve(i-1,height , dp) + Math.abs(height[i-1] - height[i]);
            int stepTwo = Integer.MAX_VALUE;
            if(i > 1){
                stepTwo = solve(i-2,height , dp) + Math.abs(height[i-2] - height[i]);
            }
            dp[i] = Math.min(stepOne , stepTwo);
            return dp[i];
        }
        int minCost(int[] height) {
            // code here
            int[] dp = new int[height.length];
            int n = height.length;
            Arrays.fill(dp,-1);
            return  solve(n-1 , height , dp);
        }
    }

