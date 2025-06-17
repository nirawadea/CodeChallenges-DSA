package BinarySearch;

import java.util.ArrayList;

public class FirstAndLastPosition {

    public static ArrayList<Integer> findPosition(int[] arr, int x){
        int first = -1;
        int last = -1;

        for(int i=0; i<arr.length; i++){
            if(x!=arr[i]){
                continue;
            }
            if(first == -1){
                first = i;
            }
            last = i;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(last);
        return  result;
    }
}
