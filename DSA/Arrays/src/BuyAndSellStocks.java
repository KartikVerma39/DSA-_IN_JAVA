public class BuyAndSellStocks {
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        int profit = 0;
        int buy = arr[0];
        for(int i  = 1 ; i < arr.length ; i++){
            int sell = arr[i];
            if(sell > buy){
                profit = Math.max(profit , sell - buy);
            }
            else{
                buy = arr[i];
            }
        }

        System.out.println(profit);
    }
}
