package Recursion;

public class pelindromicString {
    public static boolean ispelindromic(int i,String s){
        int n = s.length();
       if(i >= s.length()/2)return true;
       if(s.charAt(i) != s.charAt(n-i-1))return false;
       return ispelindromic(i+1,s);
    }
    public static void main(String[] args) {
            String s = "1221";
            System.out.println(ispelindromic(0,s));
    }
}
