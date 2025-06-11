public class ReverseArray {

    public void reverseArray(int[] arr) { // Changed return type to void
        int n = arr.length;
        int[] temp = new int[n];

        // Copy elements in reverse order
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - 1 - i];
        }

        // Copy back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
