package Array;

import java.util.Arrays;

public class AlternativeSigns {
    public static int[] alternativeSigns(int[] nums){
        int[] result = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                result[posIndex] = nums[i];
                posIndex += 2;
            }
            else {
                result[negIndex] = nums[i];
                negIndex += 2;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
       int[] arr = alternativeSigns(nums);
        System.out.println(Arrays.toString(arr));

    }
}
