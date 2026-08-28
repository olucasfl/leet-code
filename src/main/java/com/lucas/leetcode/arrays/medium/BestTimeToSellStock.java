package com.lucas.leetcode.arrays.medium;

public class BestTimeToSellStock {

    //Tenho uma lista de preços, preciso comprar no dia mais barato
    //E vender no mais caro para ter lucro
    //olho o array e encontro o menor número
    //depois com o indice do menor valor eu encontro o maior valor depois dele
    public int bestTimetoSell(int[] prices) {
        int minorPrice = prices[0];
        int minorPriceIndice = 0;
        int maxPriceAfterMinor = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minorPrice) {
                minorPrice = prices[i];
                minorPriceIndice = i;
            }
        }

        for(minorPriceIndice = minorPriceIndice + 1; minorPriceIndice < prices.length; minorPriceIndice++) {
            if(prices[minorPriceIndice] > maxPriceAfterMinor) {
                maxPriceAfterMinor = prices[minorPriceIndice];
            }
        }

        return maxPriceAfterMinor - minorPrice;
    }

    public static void main(String[] args) {
        BestTimeToSellStock solved = new BestTimeToSellStock();

        System.out.println(solved.bestTimetoSell(new int[] {7, 1, 5, 3, 6, 4}));
    }
}
