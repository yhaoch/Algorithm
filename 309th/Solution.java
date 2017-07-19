public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0;
        int [] start = new int [prices.length];
        int [] buy = new int [prices.length];
        int [] cool = new int [prices.length];
        start[0] = 0;
        buy[0] = -prices[0];
        cool[0] = Integer.MIN_VALUE;
        for(int i = 1;i<prices.length;i++){
            start[i] = Math.max(start[i-1],cool[i-1]);
            buy[i] = Math.max(buy[i-1],start[i-1] - prices[i]);
            cool[i] = buy[i-1] + prices[i];
        }
        return Math.max(start[prices.length - 1],cool[prices.length - 1]);
    }
}