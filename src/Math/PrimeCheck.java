package Math;

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 12;
        int count = 0;
        System.out.println("Factors:");
        for(int i = 1; i * i <=num; i++){
            if(num % i == 0) count++;
            if((num % i) == 0) count++;
        }
        if(count == 2) System.out.println("true");
        else System.out.println("false");
    }
}
