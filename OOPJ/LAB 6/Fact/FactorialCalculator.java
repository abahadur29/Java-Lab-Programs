package Fact;
public class FactorialCalculator {
    public static int calculateFactorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}
