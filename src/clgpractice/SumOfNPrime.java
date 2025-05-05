package clgpractice;

import java.util.Scanner;

public class SumOfNPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum = 0;
        int i = 2;
        int primeCount =0;

        while(true){
            int count =0;
            for(int j = 1; j <= i; j++){
                if(i %j == 0)count++;
            }
            if(count == 2){
                sum += i;
                primeCount++;
            }
            i++;

            if(primeCount == n)break;
        }
        System.out.println(sum);
    }
}
