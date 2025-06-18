import java.util.*;
class evenodd
{
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        System.out.println("Enter 10 numbers in the array :\n");

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The inserted numbers are as given below:\n");
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
int c1=0,c2=0;
for(int i=0;i<10;i++)
{
if(a[i]%2==0)
c1++;
else
c2++;
}
System.out.println("The number of Evens are = "+c1);
System.out.println("The number of odds are = "+c2);
}
}