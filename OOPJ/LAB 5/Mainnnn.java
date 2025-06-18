interface Employee {
    double earnings(double basicSalary);
    double deductions(double basicSalary);
    double bonus(double basicSalary);
}

class Manager implements Employee {
    public double earnings(double basicSalary) {
        double DA = 0.8 * basicSalary;
        double HRA = 0.15 * basicSalary;
        return basicSalary + DA + HRA; 
    }

    public double deductions(double basicSalary) {
        return 0.12 * basicSalary; 
    }

    public double bonus(double basicSalary) {
        return 0; 
    }
}

class Substaff extends Manager {
    public double bonus(double basicSalary) {
        return 0.5 * basicSalary;  
    }
}

public class Mainnnn {
    public static void main(String[] args) {
        double basicSalary = 50000;

        Substaff substaff = new Substaff();
        double substaffEarnings = substaff.earnings(basicSalary);
        double substaffDeductions = substaff.deductions(basicSalary);
        double substaffBonus = substaff.bonus(basicSalary);

        System.out.println("Earnings: " + substaffEarnings);
        System.out.println("Deductions: " + substaffDeductions);
        System.out.println("Bonus: " + substaffBonus);
    }
}
