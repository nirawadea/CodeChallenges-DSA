public class LargestAndSmallestElement {


    public static int[] findLargestAndSmallest(int[] arr) {

        int smallest = arr[0];
        int largest = arr[0];
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        for (int nums : arr) {
            if (nums < smallest) {
                smallest = nums;
            }
            if (nums > largest) {
                largest = nums;
            }
        }
        System.out.println("Smallest element:" + smallest);
        System.out.println("largest element:" + largest);

        return new int[]{smallest, largest};


    }
}
