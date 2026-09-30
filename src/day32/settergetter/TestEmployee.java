package day32.settergetter;

public class TestEmployee {
    static void main() {
        Employee emp = new Employee();

        emp.setEmpName("Kerrie");
        emp.setSalary(8000);

        System.out.println("Credit the Employee, "+ emp.getEmpName()+" a salary of $"+ emp.getSalary());
    }
}
