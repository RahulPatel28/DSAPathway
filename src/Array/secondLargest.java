package Array;

public class secondLargest {
    public static int SecondLargest(int[] arr){
        int first = 0;
        int second = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first ){
                second = first;
                first = arr[i];
            }
            if(arr[i] > second && arr[i] != first)second = arr[i];
        }
        return (second == 0)?-1:second;
    }
    public static void main(String[] args) {
        int arr[] = {12,90,78,34,23};
        System.out.println( SecondLargest(arr));;
    }
}
