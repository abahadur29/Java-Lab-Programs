/*import java.util.*;
import Marketing.General.Employee;
import Marketing.sales;
public class Mainn{
    public static void main(String[] args) {
        
        Employee salesPerson = new Employee();
        Sales s=new Sales();
        salesPerson.setName(123, "Amit");
        salesPerson.setBasic(1000);
        System.out.println("The emp id of the employee is " + salesPerson.empid);
        double totalEarning = salesPerson.earnings() + s.totalAllowance();
        System.out.println("The total earning is " + totalEarning);
    }
} */
import java.util.Scanner;
import Marketing.Sales;

public class Lab62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the employee id: ");
        int empId = scanner.nextInt();
        System.out.print("Enter the employee name: ");
        String empName = scanner.next();
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        Sales salesPerson = new Sales(empId, empName, basicSalary);

        System.out.println("The emp id of the employee is " + empId);
        System.out.println("The total earning is " + salesPerson.earnings());
        System.out.println("The allowance of the employee is "+salesPerson.allowance());
        scanner.close();
    }
}