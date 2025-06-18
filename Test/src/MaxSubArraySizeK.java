public class MaxSubArraySizeK {

    // [100,200,300,400]
    public int maxSubArray(int k, int[] nums){

        int i=0;
        int j = 0;
        int n = nums.length;
        int sum = 0;
        int max = 0;

        while(j<n) {
            sum += nums[j];
            if(j-i+1 < k){
                j++;
            }else if (j-i+1 == k){
                max = Math.max(max, sum);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return max;
    }
    // Time Complexity- O(n), each element is added and removed from the sum exactly once.
    // Space Complexity- O(1) no additional data structure is used
}
