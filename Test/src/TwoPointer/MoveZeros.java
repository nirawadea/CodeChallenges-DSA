package TwoPointer;

// Tow Pointer approach
//iterate i through the array and next
// pointer p where the non-zero element should go
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int insertPosition = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }

        while(insertPosition <nums.length){
            nums[insertPosition] = 0;
            insertPosition++;
        }

    }
    // Time complexity is O(n) and Space Complexity O(1)- In place solution no extra memory.
}
