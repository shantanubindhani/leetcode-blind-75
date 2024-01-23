class Solution {
    public int maxProfit(int[] prices) {
        int
            b = 0,
            s = 1,
            max = 0,
            m
        ;
        while(s<prices.length){
            if(prices[b] < prices[s]){
                m = prices[s]-prices[b];
                max = m>max?m:max; 
            }
            else b = s;
            s += 1;
        }
        return max;
    }
}