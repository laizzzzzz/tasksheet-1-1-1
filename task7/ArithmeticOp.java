package ArithmeticOp;
import java.util.Scanner;
//arithmetic operations 4hehe... on two numbers
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number: "); double a = sc.nextDouble();
        System.out.print("Second Number: "); double b = sc.nextDouble();
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println(b == 0 ? "Error: /0" : "Quotient: " + (a / b));
        sc.close();
    }
}