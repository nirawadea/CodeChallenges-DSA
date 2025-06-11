import java.util.HashSet;

public class CheckSortedArray {

//    public boolean checkSorted(int[] arr){
//        int n = arr.length;
//
//        if(n == 0 || n == 1){
//            return true;
//        }
//        for(int i=1; i<n; i++){
//            if(arr[i-1] > arr[i]){
//                return false;
//            }
//        }
//        return true;

//    }

    public void checkSortedArray(int[] nums){

        HashSet<Integer> hashSet = new HashSet<>();

        for(int n : nums){
            hashSet.add(n);
        }
        System.out.println("Unique Elements using HashSet" + hashSet);
        System.out.println("Does Array Contains:" + hashSet.contains(10));
    }
}
