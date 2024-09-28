//3.Find the second maximum and second minimum Elements of an array.

import java.util.Arrays;

public class SecondMaxMin {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 9, 8};
        Arrays.sort(arr);
        
        int secondMin = arr[1];
        int secondMax = arr[arr.length - 2];
        
        System.out.println("Second Minimum: " + secondMin);
        System.out.println("Second Maximum: " + secondMax);
    }
}
