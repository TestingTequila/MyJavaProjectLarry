package day26;

public class TaxDeduction {

    String empDept; //global variable

    public void calculateTax(String employeeName, int empSalary) {
        double taxPercentage = 0.3; //Local Variable
        System.out.println("Tax levied on " + employeeName + " from the department, " + empDept + " is: $" + taxPercentage * empSalary);
    }

    public  void showDepartment()
    {
        System.out.println("This tax calculation os for the Department : " + empDept);
    }

    public  void empDetails(String employeeName, int empSalary)
    {
        System.out.println("EmployeeName: " + employeeName + " & Employee Salary is: $" + empSalary);
    }
}
