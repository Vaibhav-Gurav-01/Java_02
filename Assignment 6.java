/*6.    Program to check Harshad number or not using Java
Hint: - Harshad number is a number or an integer in base 10 which is completely divisible by sum of its digits.
Example: Suppose a number 24. Calculate the sum of digits of the number   (2 + 4) = 6 .Check whether the number entered by user is completely divisible by    sum of its digits or not.
*/


import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0, temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (num % sum == 0) {
            System.out.println(num + " is a Harshad Number.");
        } else {
            System.out.println(num + " is not a Harshad Number.");
        }
    }
}
