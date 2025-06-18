import Fact.FactorialCalculator;
public class Main {
    public static void main(String[] args) {
        int number = 5;
        int factorial = FactorialCalculator.calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
