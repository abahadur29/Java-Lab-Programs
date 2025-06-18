import java.util.*;

class AreaCalculator {
    public void calculateArea(String shape, double... dimensions) {
        if (shape.equalsIgnoreCase("circle")) {
            if (dimensions.length != 1) {
                System.out.println("Error: Circle requires only one argument (radius).");
                return;
            }
            double radius = dimensions[0];
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("Area of circle with radius " + radius + ": " + area);
        } else if (shape.equalsIgnoreCase("triangle")) {
            if (dimensions.length != 2) {
                System.out.println("Error: Triangle requires two arguments (base and height).");
                return;
            }
            double base = dimensions[0];
            double height = dimensions[1];
            double area = 0.5 * base * height;
            System.out.println("Area of triangle with base " + base + " and height " + height + ": " + area);
        } else if (shape.equalsIgnoreCase("square")) {
            if (dimensions.length != 1) {
                System.out.println("Error: Square requires only one argument (side).");
                return;
            }
            double side = dimensions[0];
            double area = Math.pow(side, 2);
            System.out.println("Area of square with side " + side + ": " + area);
        } else {
            System.out.println("Error: Invalid shape specified. Supported shapes are circle, triangle, and square.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        System.out.print("Enter shape (circle/triangle/square): ");
        String shape = sc.nextLine();

        if (shape.equalsIgnoreCase("circle") || shape.equalsIgnoreCase("triangle") || shape.equalsIgnoreCase("square")) {
            double[] dimensions = new double[2];
            for (int i = 0; i < 2; i++) {
                System.out.print("Enter dimension " + (i + 1) + ": ");
                dimensions[i] = sc.nextDouble();
            }
            calculator.calculateArea(shape, dimensions);
        } else {
            System.out.println("Invalid shape entered. Exiting program.");
        }
    }
}
