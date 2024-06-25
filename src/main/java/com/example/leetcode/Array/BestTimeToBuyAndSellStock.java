package com.example.leetcode.Array;

import java.util.ArrayList;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int price = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (price > prices[i]) {
                price = prices[i];
            } else {
                int current_profit = prices[i] - price;
                profit = Math.max(current_profit, profit);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 8, 4};

        System.out.println(maxProfit(prices));
    }

}
