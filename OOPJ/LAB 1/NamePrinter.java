import java.util.*;
class NamePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input the first name
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        // Input the last name
        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        // Print last name followed by first name
        System.out.println("Output: " + lastName + " " + firstName);
    }
}
