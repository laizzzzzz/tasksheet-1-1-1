//task 8 varargs
import java.util.Scanner;

public class VarargsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            nums[i] = sc.nextInt();
        }
        int total = 0;
        for (int n : nums) {
            int sum = n * (n + 1) / 2;
            System.out.println("Cumulative sum up to " + n + " = " + sum);
            total += n;
        }
        System.out.println("Total sum = " + total);
        sc.close();
    }
}
