public class LargestElement {


    public int findLargest(int[] arr) {

        int max = arr[0];
        int max2 = arr[1];
        int n = arr.length;
        for (int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println("first Largest Element in Array is:" + max);
        for (int j=2; j<n; j++){
            if(arr[j] != max && arr[j] > max2 ){
                max2 = arr[j];
            }
        }
        return max2;
    }
}
