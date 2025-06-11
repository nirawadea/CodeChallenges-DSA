public class MaxSubArraySizeK {

    public int maxSubArray(int k, int[] nums){

        int i=0;
        int j = 0;
        int n = nums.length;
        int sum = 0;
        int max = 0;
                               // [100,200,300,400]
                        //[2,3,-1,4,-2,5,7-,6]
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
}
