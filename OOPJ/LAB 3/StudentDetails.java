import java.util.*;

class Student {
    int rollNo;
    String name;
    double cgpa;

    public Student(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Create an array to store student objects
        Student[] students = new Student[n];

        // Input details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();

            // Create a new student object and store it in the array
            students[i] = new Student(rollNo, name, cgpa);
        }

        // Display details of all students
        System.out.println("\nDetails of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Roll No: " + students[i].rollNo);
            System.out.println("Name: " + students[i].name);
            System.out.println("CGPA: " + students[i].cgpa);
            System.out.println("------------------------");
        }

        // Find and display the student with the lowest CGPA
        double lowestCGPA = students[0].cgpa;
        String lowestCGPAStudentName = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCGPA) {
                lowestCGPA = students[i].cgpa;
                lowestCGPAStudentName = students[i].name;
            }
        }

        System.out.println("Student with the lowest CGPA: " + lowestCGPAStudentName);
    }
}
