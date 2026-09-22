package day25;

public class CalculateSalary {
    double basicSalary;
    double travelAllowance;
    private double TDS;

    public void empSalary() {
        double salary = basicSalary + travelAllowance;
        System.out.println("The salary of the emp is: $" + salary);
    }

    private void deduction() {
        System.out.println("Tax Deducted is " + TDS);
    }
}
