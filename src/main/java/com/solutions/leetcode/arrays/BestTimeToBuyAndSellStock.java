package com.solutions.leetcode.arrays;

class BestTimeToBuyAndSellStock {

    //Best Time to Buy and Sell Stock II
    //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int profit = 0;
        for(int index = 1; index<prices.length; index++){
            if(prices[index]>prices[index-1])
                profit +=prices[index] - prices[index-1];
        }
        return profit;
        
    }

    public static void main(String args[]) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int[] prices = new int[] {7,1,5,3,6,4};
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(prices));
    }
}