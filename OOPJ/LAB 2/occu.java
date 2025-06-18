import java.util.*;

class occu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];

        System.out.println("Enter four numbers:\n");

        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The inserted numbers are as given below:\n");

        for (int i = 0; i < 4; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < 4; i++) {
            int in = a[i];
            int c = 0;

            for (int j = 0; j < 4; j++) {
                if (in == a[j]) {
                    c++;
                }
            }

            System.out.println("Occurrence of " + in + " = " + c);
        }
    }
}
