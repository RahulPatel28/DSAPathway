package Recursion;

public class sumOfSeries {
    public static int calculateSum(int n){
        if( n == 0)return 0;
        else return n + calculateSum(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calculateSum(n));
    }
}
