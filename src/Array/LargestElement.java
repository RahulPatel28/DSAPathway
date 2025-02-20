package Array;

public class LargestElement {
    public static int largestElement(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int max = 0;
        while(i <= j){
            int temp = Math.max(arr[i],arr[j]);
            max = Math.max(max,temp);
            i++;
            j--;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {12,34,87,90,56};
        System.out.println(largestElement(arr));
    }
}
