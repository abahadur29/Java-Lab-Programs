import java.util.*;
class highest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];

        System.out.println("Enter three numbers:\n");

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The inserted numbers are as given below:\n");

        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }

        int highest = a[0];

        for (int i = 1; i < 3; i++) {
            if (a[i] > highest) {
                highest = a[i];
            }
        }

        System.out.println("The highest number is: " + highest);
    }
}
