package Array;

public class ArrayIsSortedAndRotated {
    // 3,4,5,1,2

    public boolean isSorted(int[] arr){
        int n = arr.length;
        int inversionCount = 0;

        for(int i=0; i<n-1;i++){
            if(arr[i] > arr[i+1]){
                inversionCount++;
                if(inversionCount > 1){
                    return false;
                }
            }
        }

        if(arr[n-1] > arr[0]){
            inversionCount++;
        }

        return inversionCount <=1;

    }
    public static void main(String[] args) {
        ArrayIsSortedAndRotated a = new ArrayIsSortedAndRotated();
        int[] arr = {3,4,5,1,2};
        int[] arr1 = {2,1,3,4};
        boolean result = a.isSorted(arr1);
        System.out.println(result);
    }
}
