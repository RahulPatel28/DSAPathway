package DynamicProgramming;

import java.util.Arrays;

public class AssignCookies {
        private int solve(int i, int j, int[] g, int[] s, int[][] dp) {
            if (i < 0 || j < 0) return 0; // koi bacha ya cookie nahi bacha

            if (dp[i][j] != -1) return dp[i][j]; // already solved

            int take = 0;
            if (s[j] >= g[i]) {
                // agar cookie sufficient hai to bache ko assign kar do
                take = 1 + solve(i - 1, j - 1, g, s, dp);
            }

            // ya to skip kar do cookie ko
            int notTake = solve(i, j - 1, g, s, dp);

            // dono me se best option choose karo
            return dp[i][j] = Math.max(take, notTake);
        }

        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g); // greed sort
            Arrays.sort(s); // cookie sort

            int m = g.length, n = s.length;
            int[][] dp = new int[m][n];

            for (int[] row : dp) Arrays.fill(row, -1); // dp init

            return solve(m - 1, n - 1, g, s, dp);
        }
    }


