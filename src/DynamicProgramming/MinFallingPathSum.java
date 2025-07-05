package DynamicProgramming;

public class MinFallingPathSum {
        public int minFallingPathSum(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] dp = new int[m][n];

            for (int j = 0; j < n; j++) {
                dp[0][j] = matrix[0][j];
            }

            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int up = dp[i - 1][j];
                    int left = (j > 0) ? dp[i - 1][j - 1] : (int) 1e9;
                    int right = (j < n - 1) ? dp[i - 1][j + 1] : (int) 1e9;

                    dp[i][j] = matrix[i][j] + Math.min(up, Math.min(left, right));
                }
            }

            int mini = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                mini = Math.min(mini, dp[m - 1][j]);
            }

            return mini;
        }
    }

