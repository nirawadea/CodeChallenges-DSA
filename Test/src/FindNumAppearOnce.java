import java.util.HashMap;

public class FindNumAppearOnce {

    HashMap<Integer, Integer> map = new HashMap<>();

    public int findNumAppearOnce(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for(Integer key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
