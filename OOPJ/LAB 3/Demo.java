import java.util.*;

class Box {
    // Data members
     double length;
     double width;
     double height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate volume
    public double volume() {
        return length * width * height;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for dimensions
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        // Creating an object of the Box class
        Box myBox = new Box(length, width, height);

        // Printing the volume
        System.out.println("Volume of the box: " + myBox.volume());
    }
}
