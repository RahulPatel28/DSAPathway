package Array;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr){
        int i = 0;
        int j = 0;
        while( j < arr.length){
            if(arr[i] != arr[j]){
               arr[++i] = arr[j];
               j++;
            }
            j++;
        }
        return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,1};
        System.out.println(removeDuplicates(arr));
    }
}
