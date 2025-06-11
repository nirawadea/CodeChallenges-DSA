public class StockBuySell {

    public int maxProfit(int [] arr){

//        int profit = 0;
//        int n = arr.length;
//
//        for(int i = 1; i<n; i++){
//            if(arr[i] > arr[i-1]){
//                profit += arr[i] - arr[i-1];
//            }
//        }
//        return profit;

        int profit = 0;
//        int i = 0;
//        int minPrice = arr[0];
//        int maxPrice = arr[0];
//        int n = arr.length;
//
//        while (i<n-1 && arr[i] < arr[i+1] ) {
//            minPrice = arr[i];
//            i++;
//        }
//
//        while (i<n-1 && arr[i] > arr[i+1]){
//            maxPrice = arr[i];
//            i++;
//        }
//        profit += maxPrice - maxPrice;
//        {100,180,260,310,40,535,695}
        int buy = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[i-1] && i != arr.length-1 ){
                continue;
            }
            if (i == arr.length-1 && arr[i] > buy ){
                profit += arr[i] - buy;
            }
            else {
                profit += arr[i-1] - buy;
                buy = arr[i];
            }
        }
        return profit;

    }
}
