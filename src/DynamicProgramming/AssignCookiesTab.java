package DynamicProgramming;

import java.util.Arrays;

public class AssignCookiesTab {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);

            int m = g.length;
            int n = s.length;

            int[][] dp = new int[m + 1][n + 1]; // extra row-col for base cases

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (s[j - 1] >= g[i - 1]) {
                        // agar cookie sufficient hai
                        dp[i][j] = Math.max(1 + dp[i - 1][j - 1], dp[i][j - 1]);
                    } else {
                        // cookie chhoti hai, skip kar do
                        dp[i][j] = dp[i][j - 1];
                    }
                }
            }

            return dp[m][n];
        }
    }


