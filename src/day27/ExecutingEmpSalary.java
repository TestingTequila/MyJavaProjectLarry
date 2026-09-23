package day27;

public class ExecutingEmpSalary
{
    static void main() {
        EmpBonus emp1= new EmpBonus();
        double empSalary =emp1.calculateSalary(3000, 2000);
        double salaryWithBonus =empSalary+1000;
        System.out.println("The final Salary to be credited along with bonus is: $" + salaryWithBonus);

        System.out.println("================================");

        EmpBonus emp2= new EmpBonus();
        double empSalary2 =emp2.calculateSalary(5000, 4000);
        double SalaryWithBonus2 =empSalary2 + 1000;
        System.out.println("The final Salary to be credited along with bonus is: $" + SalaryWithBonus2);


    }
}
