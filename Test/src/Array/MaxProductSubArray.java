package Array;

//int arr[] = {1,2,-3,0,-4,-5};
//Output: The maximum product subarray: 20

public class MaxProductSubArray {

    public int maxProduct(int[] arr){
        int max = -1;
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int p=1;
                for(int k=i; k<=j; k++){
                    p *= arr[k];
                    max = Math.max(max, p);
                }
            }
        }
        return max;
    }
}

// TC-  O(N^3) We are using 3 nested loops for finding all possible subarrays and their product.
// SC-  O(1) No extra data structure was used

