package org.sydlabz.alg;

public class MaxProfit {
    public static void run() {
        int[][] prices = {
                {7,1,5,3,6,4},
                {7,6,4,3,1}
        };
        for (int[] price : prices) {
            int profit = maxProfit(price);
            System.out.println("profit=" + profit);
        }
    }

    private static int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int minimumPrice = prices[0];

        for (int price : prices) {
            minimumPrice = Math.min(price, minimumPrice);
            maximumProfit = Math.max(maximumProfit, price - minimumPrice);
        }

        return maximumProfit;
    }
}
