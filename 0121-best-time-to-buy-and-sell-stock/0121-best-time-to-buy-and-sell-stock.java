import java.util.*;

class Solution {
    public static int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if(buyPrice < prices[i]){
                profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

        int prices2[] = {7,6,4,3,1};
        System.out.println(maxProfit(prices2));
    }
}