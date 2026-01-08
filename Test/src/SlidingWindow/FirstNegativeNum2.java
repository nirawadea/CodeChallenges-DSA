package SlidingWindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNum2 {

  ;

    public static int[] firstNegativeNumber(int[] nums, int k){
        int i = 0, j = 0, idx = 0;

        int n = nums.length;
        int[] result = new int[n-k+1];
        Queue<Integer> queue = new LinkedList<>();

        while(j<n){

            if(nums[j] < 0){
                queue.add(nums[j]);
            }

            if(j-i+1 < k){
                j++;
            }

            else if(j-i+1 == k){
                if(queue.isEmpty()){
                    result[idx++] = 0;
                }else{
                    result[idx++] = queue.peek();
                }

                if(!queue.isEmpty() && nums[i] == queue.peek()){
                    queue.poll();
                }
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        int[] output = firstNegativeNumber(nums, k);

        System.out.println("First Negative Nums using Queue and Array");
        System.out.println(Arrays.toString(output));

    }
}
