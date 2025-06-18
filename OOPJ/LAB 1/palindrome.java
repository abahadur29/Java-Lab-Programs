import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        int p, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check");
        p = sc.nextInt();
        int c = p;
        while (p != 0) {
            int r = p % 10;
            rev = (rev * 10) + r;
            p = p / 10;
        }
        if (rev == c)
            System.out.println("The Number is Palindrome");
        else
            System.out.println("The Number is not Palindrome");
    }
}
