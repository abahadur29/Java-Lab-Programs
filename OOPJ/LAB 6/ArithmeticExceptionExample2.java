import java.util.Scanner;

public class ArithmeticExceptionExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the dividend: ");
            int dividend = sc.nextInt();
            System.out.print("Enter the divisor: ");
            int divisor = sc.nextInt();
            int result = dividend / divisor; // Division operation
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch block");
        } finally {
            System.out.println("This block is always executed");
        }
    }
}
