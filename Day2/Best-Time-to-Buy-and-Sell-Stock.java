// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy_price= prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]<buy_price){
                buy_price=prices[i];
            }
            else{
                int curr_profit=prices[i]-buy_price;
                profit=Math.max(curr_profit , profit);
            }
        }
        return profit;
    }
}