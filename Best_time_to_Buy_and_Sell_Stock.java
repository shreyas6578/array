//Best Time to Buy and Sell Stock
public class Best_time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] arr ={7,1,5,3,6,4};
        int profit = stock(arr);
        System.out.println(profit);
    }
    public static int stock(int[] arr) {
        int min = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            else{
                int profit = arr[i] - min;
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
    return maxprofit;
    }


}
