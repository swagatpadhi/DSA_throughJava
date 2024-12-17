package arrays;
import java.util.*;
public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        findMaxProfitOfStock(prices);
    }

    private static void findMaxProfitOfStock(int[] prices) {
        int maxProfit = 0;
        int bestBuy = prices[0];
        for(int i=1; i<prices.length; i++) {
            int profit = prices[i] - bestBuy;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
            bestBuy = Math.min(bestBuy, prices[i]);
        }

        System.out.println("max profit = "+maxProfit);
    }


}
