/*7.    Java Program for Sorting first half in Ascending order and second half in Descending order
Example
Input: arr [6] = [1, 90, 34, 89, 7, 9]
Output: 1 7 9 90 89 34
*/


import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {1, 90, 34, 89, 7, 9};
        int mid = arr.length / 2;

        // Sort first half in ascending order
        Arrays.sort(arr, 0, mid);

        // Sort second half in descending order
        Arrays.sort(arr, mid, arr.length);
        for (int i = mid; i < arr.length - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
