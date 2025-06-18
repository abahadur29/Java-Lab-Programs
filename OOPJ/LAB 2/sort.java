import java.util.*;
class sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter five numbers:\n");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The inserted numbers are as given below:\n");

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        // Bubble Sort in ascending order
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Ascending order:");

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

    }
}
