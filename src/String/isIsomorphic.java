package String;

public class isIsomorphic {
    public boolean isIsomorphicOrNot(String s, String t) {
        int []arr1 = new int[200];
        int []arr2 = new int [200];
        int n = s.length();
        if(n != t.length())return false;
        for(int i = 0; i < n; i++){
            if(arr1[s.charAt(i)] != arr2[t.charAt(i)]){
                return false;
            }
            arr1[s.charAt(i)]= i+1;
            arr2[t.charAt(i)]= i+1;
        }
        return true;
    }
}
