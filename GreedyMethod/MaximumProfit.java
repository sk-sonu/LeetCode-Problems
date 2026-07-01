public class MaximumProfit{
    
   static int maximumProfit(int[] prices){
        int profit =0;
        int min = prices[0];
        int maxmProfit = 0;
        for(int i =1; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            else{
                maxmProfit = prices[i]-min;
                if(profit<maxmProfit){
                    profit = maxmProfit;
                }
            }
        }

        return profit;
    }
    public static void main(String[] args){
        int testcase1[] = {7,1,5,3,6,4};
        int testcase2[] = {7,6,4,3,1};
        int profit = maximumProfit(testcase2);
        System.out.println(profit);
    }
}