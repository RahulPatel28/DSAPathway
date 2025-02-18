package Math;

public class kthfactor {
    public int kthFactor(int n, int k) {
        int factorcount = 1;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                if(factorcount == k)return i;
                else factorcount++;
            }
        }
        return -1;
    }
}
