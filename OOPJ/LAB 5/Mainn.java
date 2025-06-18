import java.util.Scanner;

// Define the Employee interface
interface Employee {
    void getDetails();
}

// Define the Manager interface derived from Employee
interface Manager extends Employee {
    void getDeptDetails();
}

// Implement the Head class that implements Manager interface
class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    @Override
    public void getDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        empId = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        empName = input.nextLine();
    }

    @Override
    public void getDeptDetails() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter department id: ");
        deptId = input.nextInt();
        input.nextLine(); // Consume newline
        System.out.print("Enter department name: ");
        deptName = input.nextLine();
    }

    public void displayDetails() {
        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + empName);
        System.out.println("Department id: " + deptId);
        System.out.println("Department name: " + deptName);
    }
}

public class Mainn {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.displayDetails();
    }
}
