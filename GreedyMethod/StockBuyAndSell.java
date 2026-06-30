public class StockBuyAndSell {
    static int maxProfit(int [] prices){
        int profit =0;
        int j = 0;
        for(int i = 0; i<prices.length-1; i++){
            j=i+1;
            if(prices[i]<prices[j]){
                profit+=(prices[j]-prices[i]);
                j++;
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int[] testcase1 = {7,1,5,3,6,4};
      int result =  maxProfit(testcase1);
      System.out.println(result);

    }
}
