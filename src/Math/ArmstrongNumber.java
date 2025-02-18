package Math;

public class ArmstrongNumber {
    public static boolean armstrongnumber(int num){
        int original = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += (digit * digit * digit);
            System.out.println(sum);
            num = num/ 10;
        }
        System.out.println(sum);
        if(sum == original)return true;
        else return false;
    }
    public static void main(String[] args) {
        int num = 1634;
        System.out.println(armstrongnumber(num));

    }
}
