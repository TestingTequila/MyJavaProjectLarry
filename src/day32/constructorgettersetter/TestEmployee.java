package day32.constructorgettersetter;

public class TestEmployee {
    static void main() {
        Employee emp = new Employee("Kerrie", 8000);
        System.out.println("Credit the employee, " + emp.getEmpName() + " a Salary of $" + emp.getEmpSalary());

        System.out.println("===============Update the name & Salary========");

        emp.setEmpName("Kerrie");
        emp.setEmpSalary(9500);
        System.out.println("Credit the employee, " + emp.getEmpName() + " a Salary of $" + emp.getEmpSalary());



    }
}
