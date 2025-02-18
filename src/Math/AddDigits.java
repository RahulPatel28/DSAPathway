package Math;

public class AddDigits {
    public static int Adddigits(int num){
        int sum = 0;
        while(sum > 9 || num > 0){
            if(num == 0){
                num = sum;
                sum = 0;
            }
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 38;
        System.out.println(Adddigits(num));
    }
}
