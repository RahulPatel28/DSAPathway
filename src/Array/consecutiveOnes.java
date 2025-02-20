package Array;

public class consecutiveOnes {
    public static int longestConsecutiveOnes(int[] nums) {
        int maxsum = 0;
        int currSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)currSum += nums[i];
            else {
                maxsum = Math.max(maxsum,currSum);
                currSum = 0;
            }
            if(i == nums.length-1)maxsum = Math.max(maxsum,currSum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
      int[] nums = {1,0,1,1,0,1,1,1,1};
        System.out.println(longestConsecutiveOnes(nums));
    }
}
