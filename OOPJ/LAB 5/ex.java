interface Earnings
{
void earning(double basic);
void deductions(double basic);
void bonous(double basic);
}


class Manager implements Earnings
{

public void earning()
{
double earnings = basic + (0.8 * basic) + (0.15 * basic);
System.out.println("Earnings - " + earnings);
}

 public void deductions(double basic) 
{
 double deduction = 0.12 * basic;
 System.out.println("Deduction - " + deduction);
}

}

class Substaff extends Manager
{
    public void bonus(double basic) 
{
        double bonus = 0.5 * basic;
        System.out.println("Bonus - " + bonus);
}
}

public class ex
{
    public static void main(String[] args)
{
        double basicSalary = 50000;

        Substaff substaff = new Substaff();

        substaff.earnings(basicSalary);
        substaff.deductions(basicSalary);
        substaff.bonus(basicSalary);
    }
}
