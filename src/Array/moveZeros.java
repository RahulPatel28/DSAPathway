package Array;

import java.util.Arrays;

public class moveZeros {
    public static void MoveZeros(int[] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4};
        MoveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
