package Array;

public class MaxProductSubArrayOptimized {

    public int maxProduct(int[] arr){

        int n = arr.length;
        long left = 1;
        long right = 1;
        long ans = arr[0];

        for(int i=0; i<n; i++){

            left = (left == 0 || left<Integer.MIN_VALUE) ? 1 : left;
            right = (right == 0 || right<Integer.MIN_VALUE) ? 1 :right;

            left *= arr[i];
            right *= arr[n-1-i];

            ans = Math.max(ans, Math.max(left, right));
        }
        return (int) ans;
    }
}
