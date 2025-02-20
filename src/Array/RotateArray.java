package Array;

import java.util.Arrays;

public class RotateArray {
    public static void reverse(int[] arr,int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        int n = arr.length;
        int k = 2;
        int start = 0;
        int end = arr.length-1;
        k = k % n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
