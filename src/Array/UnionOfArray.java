package Array;

import java.util.ArrayList;
import java.util.List;

public class UnionOfArray {
    public static ArrayList<Integer> unionOfArray(int[] arr1,int[] arr2){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i = 0;
        int j  = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                if(list.isEmpty() ||list.get(list.size()-1) !=  arr1[i] ){
                    list.add(arr1[i]);
                }
                i++;
            }
           else if(arr1[i] > arr2[j]){
                if(list.isEmpty() ||list.get(list.size()-1) !=  arr1[j] ) {
                    list.add(arr2[j]);
                }
                j++;
            }
            else{
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;
        }
        return list;

    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1,2,3,6,7};
        unionOfArray(arr1,arr2);
        List<Integer>  union = unionOfArray(arr1,arr2);
        System.out.println(union);
    }
}
