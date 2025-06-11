import java.util.HashMap;
import java.util.Map;

public class KadaneAlgorithm {

    public static int MaxSubarraySum(int[] arr){

        int n =arr.length;
        int sum = 0;
        int maxSum = 0;

        for(int i=0; i<n; i++) {
            if(sum + arr[i] >= 0){
                if(sum >= 0){
                    sum += arr[i];
                    maxSum = Math.max(maxSum, sum);
                }
            }else {
                sum = 0;
            }
        }
        return maxSum;
    }
}
