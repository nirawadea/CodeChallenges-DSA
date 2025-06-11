public class SelectionSort {

    public static void sort(int[] arr){
        int n = arr.length;
        int min = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }
}
