/*9.    Java program for rotation of elements of array- left and right. An array is said to be right rotated if all the selected elements were moved towards right by one position.*/

public class ArrayRotation {
    public static void rotateLeft(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void rotateRight(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotateLeft(arr);
        System.out.println("Left Rotated Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        rotateRight(arr);
        System.out.println("\nRight Rotated Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
