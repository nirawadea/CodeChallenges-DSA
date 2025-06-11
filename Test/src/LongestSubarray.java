import java.util.HashMap;
import java.util.Map;

public class LongestSubarray {

    public static int longestSubarray(int[] arr, long k){
        int n = arr.length;
        long sum = 0;
        int maxLen = 0;
        Map<Long, Integer> preSumMap = new HashMap<>();

        for (int i=0; i<n; i++){
            sum += arr[i];

            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }

            long rem = sum - k;

            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
        return maxLen;
    }
}
