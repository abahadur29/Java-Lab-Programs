import java.util.Scanner;

class Rectangle {

   int length, breadth;

   // Default constructor to initialize values to zero
   Rectangle() {
       length = 0;
       breadth = 0;
   }

   // Parameterized constructor to take user input
   Rectangle(int l, int b) {
       length = l;
       breadth = b;
   }

   int calculateArea() {
       return length * breadth;
   }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter length of rectangle: ");
       int length = scanner.nextInt();

       System.out.print("Enter breadth of rectangle: ");
       int breadth = scanner.nextInt();

       // Create a rectangle object using parameterized constructor
       Rectangle rectangle1 = new Rectangle(length, breadth);
       System.out.println("Area of rectangle 1: " + rectangle1.calculateArea());

       // Create a rectangle object using default constructor
       Rectangle rectangle2 = new Rectangle();
       System.out.println("Area of rectangle 2 (with default values): " + rectangle2.calculateArea());
   }
}