import java.util.Scanner;

public class SortedArray {

    int j = 0;
    // Sorted Arrays
    public int removeDuplicates(int[] nums){
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}
