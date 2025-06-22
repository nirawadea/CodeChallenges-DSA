package Array;

public class MaxSubArraySum {
    //
    public int maxSubArray(int[] nums){

        int max = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0; i<nums.length; i++){
            if(currentSum < 0){
                currentSum = 0;
            }
                currentSum += nums[i];
               max =  Math.max(max, currentSum);
        }
        return max;
    }
}
