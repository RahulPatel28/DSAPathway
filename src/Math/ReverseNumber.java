package Math;

public class ReverseNumber {
    public static int reverseNumber(int num) {
        int reverse = 0;
        int N = num;
        while(num != 0){
            int remainder = num % 10;
            if(reverse > Integer.MAX_VALUE /10 || reverse < Integer.MIN_VALUE /10){
                return 0;
            }
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int num = 234;
        System.out.println(reverseNumber(num));

    }
}
