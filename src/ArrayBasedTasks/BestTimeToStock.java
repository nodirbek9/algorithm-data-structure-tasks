package ArrayBasedTasks;

public class BestTimeToStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
                if (prices[i]-min > max){
                    max = prices[i]-min;
                }
                if (min > prices[i]){
                    min = prices[i];
                }
            }
        return max;
    }
}
