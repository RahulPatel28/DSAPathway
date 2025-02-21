package Array;

public class maxProfit {
    public static int maxProfit(int[] prices) {
        int currprice = 0;
        int minprice = Integer.MAX_VALUE;
        int profit = 0;
        int maxprofit = 0;

        for(int i = 0 ;i < prices.length; i++){
            currprice = prices[i];
            minprice = Math.min(minprice , currprice);
            profit = prices[i] - minprice;
            maxprofit = Math.max(maxprofit,profit);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[]prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}
