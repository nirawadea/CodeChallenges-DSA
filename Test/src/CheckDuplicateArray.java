public class CheckDuplicateArray {

    public boolean checkDuplicate(int[] nums){
        int n = nums.length;

        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1]){
                System.out.println("Duplicate Found");
                return false;
            }
        }

        return true;

    }
}
