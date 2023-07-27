package dp;

/**
 * @Author 程序员小张
 * @Date 2023-07-27 21:15
 * @Desc
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }
}
