package DynamicProgramming;

public class LongestBitonicSubSeqStriver {

        public static int LongestBitonicSequence(int n, int[] nums) {
            // code here
            int[] dp = new int[n];
            int[] dp2 = new int[n];

            for(int i = 0; i < n; i++){
                dp[i] = dp2[i] = 1;
            }
            for(int i = 0; i < n ; i++){
                for(int j = 0 ; j < i; j++){
                    if(nums[i] > nums[j]){
                        dp[i] = Math.max(dp[i] , dp[j]+1);
                    }
                }
            }

            for(int i = n-1; i >= 0 ; i--){
                for(int j = n-1 ; j >i; j--){
                    if(nums[i] > nums[j]){
                        dp2[i] = Math.max(dp2[i] , dp2[j]+1);
                    }
                }
            }
            int maxLen = 1;
            for(int i = 0; i < n; i++){
                int sum = (dp[i] + dp2[i])-1;
                maxLen = Math.max(maxLen , sum);
            }
            return maxLen;
        }
    }


