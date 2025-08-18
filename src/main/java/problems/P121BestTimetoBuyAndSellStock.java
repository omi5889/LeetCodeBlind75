package problems;

public class P121BestTimetoBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<=1) return 0;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int price: prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
