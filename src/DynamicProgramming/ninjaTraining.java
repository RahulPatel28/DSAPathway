package DynamicProgramming;

import java.util.Arrays;

class ninjaTraining{
    private int solve(int day, int last, int[][] points, int[][] dp) {
        if (day == 0) {
            int max = 0;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    max = Math.max(max, points[0][i]);
                }
            }
            return dp[0][last] = max;
        }

        if (dp[day][last] != -1) return dp[day][last];

        int maxPoints = 0;
        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int point = points[day][task] + solve(day - 1, task, points, dp);
                maxPoints = Math.max(maxPoints, point);
            }
        }

        return dp[day][last] = maxPoints;
    }

    public int ninjaTraining(int n, int[][] points) {
        int[][] dp = new int[n][4];
        for (int[] row : dp) Arrays.fill(row, -1);
        return solve(n - 1, 3, points, dp);  // 3 means no activity done on previous day
    }
}

