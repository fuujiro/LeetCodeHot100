public class T121 {
    class Solution {
        public int maxProfit(int[] prices) {
            int max = 0, l = 0;
            for (int i = 1; i < prices.length; i++) {
                if(prices[i] > prices[l]) {
                    max = Math.max(max, prices[i]-prices[l]);
                } else {
                    l=i;
                }
            }
            return max;
        }
    }
}
