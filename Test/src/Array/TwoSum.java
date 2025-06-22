package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] arr, int target){
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        Map<Integer, Integer>map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int moreNeeded = target-num;

            if(map.containsKey(moreNeeded)){
                 ans[0] = map.get(moreNeeded);
                 ans[1] = i;
                 return ans;
            }
            map.put(num, i);
        }
        return ans;
    }

}
//Searching  hashmap takes O(N) time complexity and Space complexity is O(N) bcoz we took map data structure
