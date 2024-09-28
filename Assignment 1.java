//1.    Find the Maximum Element and Average of Elements in an Array.:

public class MaxAndAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }

        double average = (double) sum / arr.length;
        System.out.println("Maximum Element: " + max);
        System.out.println("Average: " + average);
    }
}
