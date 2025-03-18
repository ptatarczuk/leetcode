package org.example.ArrayString;

/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150 */

public class BestTimeToBuyAndSellStock {
    public static int maxProfitPractice(int[] prices) {
        return 0;






    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,8,4};

        //System.out.println(maxProfit(prices));
        System.out.println(maxProfitPractice(prices));
    }
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int minPrice = prices[0];
        int profit = 0;

        for (int i = 0;  i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
    }


}
