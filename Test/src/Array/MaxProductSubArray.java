package Array;

public class MaxProductSubArray {

    public int maxProduct(int[] arr){
        int max = -1;
        int n = arr.length;
        int p=1;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[j] < 0){
                    break;
                }
                if(arr[j] > 0){
                    p *= arr[j];
                    max = Math.max(max, p);
                }
            }
        }
        return max;
    }
}
