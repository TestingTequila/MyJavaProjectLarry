package day32.constructorgetter;

public class TestEmployee {
    static void main() {
        Employee emp = new Employee("Larry", 89000);

        System.out.println("Credit the employee, " + emp.getEmpName() + " a Salary of $" + emp.getEmpSalary());
    }
}
