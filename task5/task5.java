package task5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Check if all numbers are equal
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else {
            // Find and print the largest number
            int largest = num1;

            if (num2 > largest) {
                largest = num2;
            }

            if (num3 > largest) {
                largest = num3;
            }

            System.out.println("The largest number is: " + largest);
        }

        scanner.close();
    }
}
