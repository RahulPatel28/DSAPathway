package String;

public class largestOddNumber {
    public String largestOddNumbers(String num) {
        int index = -1;
        for(int i = num.length()-1; i >= 0; i--) {
            if((num.charAt(i) - '0') % 2 != 0) {
                index = i;
                break;
            }
        }
        return (index != -1) ? num.substring(0, index+1) : "";
    }
}

