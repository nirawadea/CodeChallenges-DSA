import java.util.ArrayList;

public class AlternateArrayElement {


    public static ArrayList<Integer> getAlternate(int[] arr1){
        ArrayList<Integer> list = new ArrayList<>();
//        int n = list.size();

        for(int i = 0; i<=arr1.length; i += 2){
            list.add(arr1[i]);
        }
        return list;
    }
}
