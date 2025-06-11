import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInArraylist {

    public int[] removeDuplicates(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int nums : array){
            set.add(nums);
        }
        int[] result = new int[set.size()];
        int i =0;
        for (int nums : set){
            result[i++]  = nums;
        }
        return result;
    }

}
