import java.util.*;

class WeekdayCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the day of the month
        System.out.print("Enter the day of the month: ");
        int day = sc.nextInt();

        // Assuming the current month has 31 days
        if (day < 1 || day > 31) {
            System.out.println("Invalid day input. Please enter a day between 1 and 31.");
            return; // Exit the program
        }

        // Calculate the day of the week using a switch case
        int weekday = (day % 7) + 1;

        // Print the corresponding weekday
        switch (weekday) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Error: Invalid calculation.");
                   }
    }
}
