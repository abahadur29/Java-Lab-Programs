import java.util.*;

class Rectangle {
    // Data members
    double length;
    double breadth;

    // Method to read values
    public void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Method to display results
    public void display() {
        System.out.println("Area of the rectangle: " + calculateArea());
        System.out.println("Perimeter of the rectangle: " + calculatePerimeter());
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();

        // Calling read method to input values
        myRectangle.read();

        // Calling display method to show results
        myRectangle.display();
    }
}
