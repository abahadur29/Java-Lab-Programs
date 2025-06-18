class Subtraction {
    // Method to subtract two integers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Method to subtract two doubles
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to subtract three integers
    public int subtract(int num1, int num2, int num3) {
        return num1 - num2 - num3;
    }

    // Method to subtract an array of integers
    public int subtract(int[] numbers) {
        int result = 0;
        for (int num : numbers) {
            result -= num;
        }
        return result;
    }
}

public class SubtractionDemo {
    public static void main(String[] args) {
        Subtraction subtractionCalculator = new Subtraction();

        // Example 1: Subtract two integers
        int result1 = subtractionCalculator.subtract(10, 5);
        System.out.println("Result 1: " + result1);

        // Example 2: Subtract two doubles
        double result2 = subtractionCalculator.subtract(15.5, 7.3);
        System.out.println("Result 2: " + result2);

        // Example 3: Subtract three integers
        int result3 = subtractionCalculator.subtract(20, 5, 3);
        System.out.println("Result 3: " + result3);

        // Example 4: Subtract an array of integers
        int[] numbers = {10, 2, 3, 5};
        int result4 = subtractionCalculator.subtract(numbers);
        System.out.println("Result 4: " + result4);
    }
}
