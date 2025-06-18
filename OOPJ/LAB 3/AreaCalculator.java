import java.util.*;

class AreaCalculator {
    static final double PI = 3.14159;

    // Overloaded area() methods for different shapes
    double area(double radius) {
        return PI * radius * radius;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }

    float area(float side) {
        return side * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        int choice;
        do {
            System.out.println("\nChoose a shape to calculate its area:");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = sc.nextDouble();
                    double circleArea = calculator.area(radius);
                    System.out.println("Area of the circle: " + circleArea);
                    break;

                case 2:
                    System.out.print("Enter the base of the triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = sc.nextDouble();
                    double triangleArea = calculator.area(base, height);
                    System.out.println("Area of the triangle: " + triangleArea);
                    break;

                case 3:
                    System.out.print("Enter the side of the square: ");
                    float side = sc.nextFloat();
                    float squareArea = calculator.area(side);
                    System.out.println("Area of the square: " + squareArea);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}