package BinarySearch;

public class SearchInsertPosition {
    //Use lower bound
    //     int[] numsArray = {1,3,5,6};
    //     int tval = 2;
    public int searchInsert(int[] nums, int target){

        int n = nums.length;
        int left=0;
        int right=n-1;
        int ans = n;

        while(left<right){

            int mid = (left+right)/2;
            // maybe answer
            if(nums[mid] >= target){
                ans = mid;
                //check for more smaller element
                right = mid-1;
            }else{
                //look for right side
                left = mid+1;
            }
        }
        return ans;
    }
}
