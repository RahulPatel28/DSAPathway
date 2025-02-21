package Array;

import java.util.Arrays;

public class Sortcolors {
    public static void sortColors(int[] nums) {
        int[] count = new int[3];
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 0)count[0]++;
            else if(nums[i] == 1)count[1]++;
            else count[2]++;
        }
        System.out.println(Arrays.toString(count));
        int k = 0;
        for(int i = 0; i < count.length;i++){
            while(count[i] >0){

                nums[k++]=i;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int []nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
