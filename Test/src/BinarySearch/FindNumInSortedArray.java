package BinarySearch;


//  int[] sortedArray = {1,3,5,9,10,11,12,15,20,25,30};
//  int targetValue = 15;
//  output- true
public class FindNumInSortedArray {

    public static boolean binarySearch(int[] arr, int target){

        int left = 0;
        int right = arr.length-1;
        int r = -1;

        while(left<=right){
            int mid = (left+right)/2;
            System.out.println(arr[mid]);

            if(arr[mid] == target){
                return true;
            }

            if(arr[mid] < target)
            {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return false;
    }
}
