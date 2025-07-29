package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndSecondSmallest {

    public ArrayList<Integer> findFirstAndSecond(int[] arr){
        Arrays.sort(arr);
        int min = arr[0];
        int secondMin = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != min){
                secondMin = arr[i];
                break;
            }
        }

        // if 2nd min not present then
        if(secondMin == Integer.MIN_VALUE){
            ArrayList<Integer> res = new ArrayList<>();
            res.add(-1);
            return res;
        }

        // if found 2nd min then..
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(secondMin);
        return  result;
    }
    public static void main(String[] args) {
        int[] array = {2,4,3,7,7,5};
        int[] array1 = {1};
        FirstAndSecondSmallest firstSecond = new FirstAndSecondSmallest();
        ArrayList<Integer> result = firstSecond.findFirstAndSecond(array1);

        for(int nums : result){
            System.out.println(nums);
        }
    }
}
