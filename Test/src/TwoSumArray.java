import java.util.HashMap;

public class TwoSumArray {

    public static String twoSum(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//                if(arr[i]+arr[j] == target){
//                    return new int[] {i,j};
//                }
            int num = arr[i];
            int moreNeeded = target-num;
            if(map.containsKey(moreNeeded)){
                return "YES";
            }
            map.put(arr[i],i);

            }
        return "NO";
        }
//        return new int[] {-1,-1};
    }

