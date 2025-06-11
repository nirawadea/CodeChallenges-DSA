public class ProductOfArray {
    // Product of Array Except Itself
    

    public static int[] productExceptItsel(int[] arr){

        int n = arr.length;
        int[] ansArray = new int[n];

//        for(int i=0; i<n; i++){
//            int product = 1;
//            for (int j=0; j<n; j++){
//                if(arr[i] != arr[j]){
//                    product *= arr[j];
//                }
//            }
//            ansArray[i] = product;
//        }
//        return ansArray;
        int product = 1;
        for(int i=0; i<n; i++){
            product *= arr[i];
            if(product > 1){
                ansArray[i] = product;
            }
        }

        return ansArray;
    }
}
