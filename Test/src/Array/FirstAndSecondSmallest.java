package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndSecondSmallest {

    public ArrayList<Integer> findFirstAndSecond(int[] arr) {
        if (arr == null || arr.length < 2) {
            ArrayList<Integer> res = new ArrayList<>();
            res.add(-1);
            return res;
        }

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num != firstMin && num < secondMin) {
                secondMin = num;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        if (secondMin == Integer.MAX_VALUE) {
            result.add(-1); // no second unique min
        } else {
            result.add(firstMin);
            result.add(secondMin);
        }
        return result;
    }
    public static void main(String[] args) {
        FirstAndSecondSmallest finder = new FirstAndSecondSmallest();
        int[] array = {4, 2, 2, 7, 1, 5, 1};

        ArrayList<Integer> result = finder.findFirstAndSecond(array);
        for (int num : result) {
            System.out.println(num);
        }
    }
}
