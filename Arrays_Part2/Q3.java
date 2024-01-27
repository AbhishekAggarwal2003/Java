package Arrays_Part2;

/*You are given an array prices where prices[i] is the price of a given stock on the ith day.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

public class Q3 {
    public static int buy_sell(int prices[]){
        int buyPrice= Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,6,4,3,1};
        System.out.println(buy_sell(prices));
    }
}
