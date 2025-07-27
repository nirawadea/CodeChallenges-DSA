package Array;

public class LargestElement {
    public int largetElement(int[] arr){
        int n = arr[0];
        int max = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>n){
                max = Math.max(arr[i], max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LargestElement l = new LargestElement();
        int[] arr = {2,5,1,8,0};
        int result = l.largetElement(arr);
        System.out.println(result);
    }
}

// TC- O(n)
// SC- O(1)
