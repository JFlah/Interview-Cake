/**
 * Created by Jack on 11/19/2015.
 */

/*
 *  Write an efficient function that takes stockPricesYesterday and
 *  returns the best profit I could have made from 1 purchase and 1
 *  sale of 1 Apple stock yesterday.
 */

public class _1MaxProfit {
    static int[] stockPricesYesterday = new int[]{10, 9, 8, 11};
    static int potentialProfit;

    public static void main(String[] args) {
        System.out.println("Max profit: $" + getMaxProfit(stockPricesYesterday));
    }

    public static int getMaxProfit(int[] stockPricesYesterday){
        if (stockPricesYesterday.length < 2)
            throw new IllegalArgumentException("ERROR: Need 2+ prices");

        // Max profit must start here, if we start calculating at [0]
        // we will buy and sell at same time, giving profit 0
        // which discounts the possibility of a negative profit
        int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];
        int lowPrice = stockPricesYesterday[0];

        for (int i = 1; i < stockPricesYesterday.length; i++) {
            int currentPrice = stockPricesYesterday[i];

            potentialProfit = currentPrice - lowPrice;

            maxProfit = Math.max(maxProfit, potentialProfit);

            lowPrice = Math.min(lowPrice, currentPrice);
        }
        return maxProfit;
    }
}