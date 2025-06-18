import java.util.*;
class grade
{
public static void main(String args[])
{
int g;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number Scored Out of 100");
g=sc.nextInt();
if(g>=90 && g<=100)
System.out.println("O");
else if(g>=80 && g<=89)
System.out.println("E");
else if(g>=70 && g<=79)
System.out.println("A");
else if(g>=60 && g<=69)
System.out.println("B");
else if(g>=50 && g<=59)
System.out.println("C"); 
else 
System.out.println("Fail");
}
}