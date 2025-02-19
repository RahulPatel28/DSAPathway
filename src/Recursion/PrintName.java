package Recursion;

public class PrintName {
    public static void printNumbers(int n) {
        if(n > 0){
            printNumbers(n-1);
            System.out.print("Rahul" + " ");
        }
    }
    public static void main(String[] args) {
        int n = 10;
        printNumbers(n);
    }
}
