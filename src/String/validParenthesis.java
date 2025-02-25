package String;

public class validParenthesis {
    public static String validParenthesis(String s){
        int count = 0;
        StringBuilder part = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()){
            part.append((ch));

            if(ch == '(')count++;
            else count--;

            if(count == 0){
                result.append(part.substring(1,part.length()-1));
                part.setLength(0);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(validParenthesis(s));

    }
}
