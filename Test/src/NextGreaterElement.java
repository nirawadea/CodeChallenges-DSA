import java.util.ArrayList;

public class NextGreaterElement {

    static ArrayList<Integer> NextGreaterElementInArray(int[] arr){

        int n = arr.length;

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i<n; i++){
            result.add(-1);
        }

        for(int i =0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[j] >= arr[i]){
                    result.set(i, arr[j]);
                    break;
                }
            }
        }
        return result;
    }
}
