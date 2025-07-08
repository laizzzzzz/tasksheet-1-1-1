// CumulativeSum.java
package task7;
import java.util.*;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 1; i < n; i++) arr[i] += arr[i - 1];

        System.out.println("Cumulative sum: " + Arrays.toString(arr));
        sc.close();
    }
}
