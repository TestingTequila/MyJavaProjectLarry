package day32.settergetter;

public class Employee {
    private String empName;
    private double salary;


    public void setEmpName(String empName) {
        String[] employeeName = {"Jason", "Kerrie", "Lee", "Nathan", "Mary"};

        for (String e : employeeName) {
            if (e.contains(empName)) {
                this.empName = empName;
                break;
            } else {
                this.empName = "N/A";
            }
        }

    }

    public void setSalary(double salary) {
        if (salary > 1000 && salary <= 10000) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

}
