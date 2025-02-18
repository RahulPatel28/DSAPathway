package Math;

public class PalindromicNumber {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int num = x;
        while(x > 0){
            int remainder = x % 10;
            if(reverse > Integer.MAX_VALUE /10 || reverse < Integer.MIN_VALUE /10)return false;
            reverse = reverse * 10 + remainder;
            x = x/10;
        }
        if(num == reverse)return true;
        else return false;

    }
}