package Math;

public class AllDivisor {
    public static void main(String[] args) {
        int num = 36;
        int count = 0;
        System.out.println("Factors:");
        for(int i = 1; i * i <=num; i++){
            if(num % i == 0) System.out.println(i);
            if(i != num/i) System.out.println(num/i);
        }
    }
}
