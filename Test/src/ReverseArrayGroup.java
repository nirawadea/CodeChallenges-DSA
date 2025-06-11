import java.util.Arrays;

public class ReverseArrayGroup {

    public void reverseArrayGroup(int[] arr, int k){
        int n = arr.length;

        for(int i=0; i<n; i = i+k){

            int start = i;
            int end = Math.min(i+k-1, n-1);

            while(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println("Reversed array group:" + "k=" + k + ""  + Arrays.toString(arr));
    }
}
