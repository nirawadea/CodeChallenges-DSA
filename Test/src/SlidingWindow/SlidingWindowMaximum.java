package SlidingWindow;

import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int i = 0;
        int j = 0;
        int max = 0;
        int count = 0;
        int n = nums.length;
        int[] result = new int[n-k+1];
        Queue<Integer> q = new LinkedList<>();

        while(j<n){

            if(nums[j] > max){
                max = Math.max(nums[j], max);
                q.add(nums[j]);
            }

            if(j-i+1 < k){
                j++;
            }

            else if(j-i+1 == k){
                result[count++] = max;

                if(!q.isEmpty() && nums[i] == q.peek()){
                    q.poll();
                }
                j++;
                i++;
            }
        }

        return result;

    }
}
