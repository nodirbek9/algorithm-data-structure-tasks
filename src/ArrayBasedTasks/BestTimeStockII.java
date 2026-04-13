package ArrayBasedTasks;

public class BestTimeStockII {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,6,4,3,1}));

    }
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int i = 1;
        while (i < prices.length) {
            if (prices[i] - prices[i - 1] > 0) {
                profit += prices[i] - prices[i - 1];
            }
            i++;
        }
        return profit;
    }
}
