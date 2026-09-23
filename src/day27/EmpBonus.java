package day27;

public class EmpBonus
{
    //Apart from the salary of the employee, we will pay every employee a bonus of $1000

    //1. Calculate Salary [basicSalary, TravelAllowance;

    public  double calculateSalary(double basicSalary, double travelAllowance )
    {
        double salary =basicSalary + travelAllowance;
        System.out.println("Salary before Bonus is: $" + salary);
        return salary;
    }
}
