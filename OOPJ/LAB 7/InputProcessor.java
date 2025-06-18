/*import java.util.*;
class  NegativeNumberException extends Exception
{
    int detail;
    Myexception(int a)
    {
        detail=a;
    }
    public String toString()
    {
        return "NegativeNumberException["detail"];
    }
}
class ExceptionDemo
{
    static void compute(int a) throws Myexception
    {
        System.out.pintln("Called compute("+a+"));
    }
public class NegativeException
{
    int a;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the Number");
    try()
    {
        a=sc.nextInt();
    }
    catch(NegativeNumberException e)
    {
        
    }
}
}
*/
import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class InputProcessor 
{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        
        try 
        {
            ProcessInput(input);
        } 
        catch (NegativeNumberException e) 
        {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e);
        }
    }
    
    public static void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) 
        {
            throw new NegativeNumberException("number should be positive");
        } 
        else 
        {
            System.out.println("Double value: " + (number * 2));
        }
    }
}
