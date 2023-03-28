package Array;

public class profitBuyandSell {
    public static void buySell(int price []){
        int buyStock = Integer.MAX_VALUE;
        int maxProfit =0;
        for (int i= 0; i<price.length; i++){
            if(buyStock<price[i]){
                int profit = price[i]-buyStock;
                maxProfit = Math.max(maxProfit,profit);
                //System.out.println(profit);
            }else{
                buyStock= price[i];
            }
        } 
        System.out.println("maximum profit of array[prices] is :"+maxProfit);
    }
    public static void main (String [] args){
        int price[] = {1,4,3,8,5,4};
        buySell(price);

    } 
}
