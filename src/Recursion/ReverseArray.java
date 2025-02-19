package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr,int left, int right){
        if(arr.length == 0 || arr.length == 1)return;
        if(left >= right)return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverseArray(arr, left+1, right-1);

    }
    public static void main(String[] args) {
        int arr[] = {11,12,13,14,15,16};
        int left = 0;
        int right = arr.length-1;
        reverseArray(arr,left,right);
        System.out.println(Arrays.toString(arr));
    }
}
