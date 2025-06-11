public class MaxConsecutiveNum {

    public int findMaxConsecutive(int[] arr) {

        if(arr.length == 0){
            return 0;
        }
        int maxCount = 0; int count = 1;

        for(int i =1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else {
                maxCount = Math.max(maxCount, count);
                count =1;
            }
        }
        return Math.max(maxCount, count);
    }
}
