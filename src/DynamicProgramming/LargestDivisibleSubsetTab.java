package DynamicProgramming;

import java.util.*;


class LargestDivisibleSubsetTab {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.fill(dp, 1);
        for (int i = 0; i < n; i++) prev[i] = i;

        int maxLen = 1;
        int lastIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        while (prev[lastIndex] != lastIndex) {
            result.add(nums[lastIndex]);
            lastIndex = prev[lastIndex];
        }
        result.add(nums[lastIndex]);

        Collections.reverse(result);
        return result;
    }
}