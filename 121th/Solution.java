public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
            return 0; 
        int min_price = prices[0];
        int [] profit = new int [prices.length];
        //using a array to store all profits
        for(int i = 0;i<prices.length;i++){
            profit[i] = prices[i] -  min_price;
            if(profit[i] < 0)
                min_price = Math.min(prices[i],min_price);
        }
        int max_pro = 0;
        //return the max profit
        for(int i = 0;i<prices.length;i++)
            max_pro = Math.max(profit[i],max_pro);
        return max_pro;
    }
}
