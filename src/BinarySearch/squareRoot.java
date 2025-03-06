package BinarySearch;

public class squareRoot {
    int floorSqrt(int n) {
        if(n== 1)return 1;
        int low = 1;
        int high = n;
        int ans = 0;
        while( low <= high){
            int mid = low + (high-low)/2;

            if(mid * mid == n){
                ans = mid;
                break;

            }

            else if ( mid * mid < n){
                ans = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return ans;
    }
}
