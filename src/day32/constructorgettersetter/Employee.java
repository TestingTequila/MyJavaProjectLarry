package day32.constructorgettersetter;

public class Employee {

    private String empName;
    private double empSalary;

    //To set the value of private variables through constructors
    public Employee(String empName, double empSalary) {
        this.empName = empName;
        this.empSalary = empSalary;
    }

    // To get the value of private variables
    public String getEmpName() {
        String[] employeeName = {"Jason", "Kerrie", "Lee", "Nathan", "Mary"};
        String emplName = "N/A";
        for (String e : employeeName) {
            if (e.contains(empName)) {
                emplName = empName;
            }

        }

        return emplName;
    }

    // To get the value of private variables
    public double getEmpSalary() {

        double employeeSalary = 0.0;
        if (empSalary > 1000 && empSalary <= 10000) {
            employeeSalary = empSalary;
        }
        return employeeSalary;
    }


    //Updating the  value through setter method
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    //Updating the  value through setter method
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}
