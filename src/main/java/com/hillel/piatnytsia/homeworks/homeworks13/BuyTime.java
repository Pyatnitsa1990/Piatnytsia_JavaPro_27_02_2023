package com.hillel.piatnytsia.homeworks.homeworks13;

import java.util.Arrays;
import java.util.OptionalInt;

public class BuyTime {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int interimResult = 0;
        int currentPriceToBuy = 0;
        int minPrice = 0;
        int currentPriceForSale = 0;
        int maxPrice = 0;
        int indexPriceForSale = 0;
        int indexPriceToBuy = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            currentPriceToBuy = prices[i];
            currentPriceForSale = prices[i + 1];
            if (i == 0 || currentPriceToBuy < minPrice) {
                minPrice = currentPriceToBuy;
                indexPriceToBuy = i;
                indexPriceForSale = i + 1;
            }
            if (i == 0 || indexPriceToBuy < indexPriceForSale) {
                maxPrice = currentPriceForSale;
                interimResult = maxPrice - minPrice;
            }
            if (interimResult > profit) {
                profit = interimResult;
            }
        }

        return profit;
    }

}
