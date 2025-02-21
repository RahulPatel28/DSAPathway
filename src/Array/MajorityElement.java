package Array;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count = 1;
       int majority = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(count == 0){
                majority = nums[i];
                count = 1;
            }
           else if(nums[i] == majority)count++;
           else count--;
        }
        return majority;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,3,5};
        System.out.println(majorityElement(nums));
    }
}
