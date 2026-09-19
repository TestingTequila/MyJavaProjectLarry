package day25;

public class CalculateSalary {
    double basicSalary;
    double travelAllowance;

    public void empSalary()
    {
        double salary = basicSalary + travelAllowance;
        System.out.println("The salary of the emp is: $" + salary);
    }
}
