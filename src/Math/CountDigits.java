package Math;

public class CountDigits {
    public static int countDigits(int num){
        int count = 0;
        int N = num;
        while(num > 0){
            int Digit = num % 10;
            if(Digit != 0 && N % Digit == 0){
                count++;
            }
            num = num / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 12;
        System.out.println(countDigits(num));

    }
}
