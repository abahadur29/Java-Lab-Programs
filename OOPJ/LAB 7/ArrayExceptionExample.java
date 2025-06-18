import java.util.Scanner;
public class ArrayExceptionExample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int[] array = new int[4];
        for (int i = 0; i < 5; i++) 
        {
            try 
            {
                array[i] = sc.nextInt();
            } 
            catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("Exception in thread 'main' " + e);
            }
        }
    }
}
