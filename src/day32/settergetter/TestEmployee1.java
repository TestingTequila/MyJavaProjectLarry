package day32.settergetter;

public class TestEmployee1
{
    static void main() {
        Employee1 emp = new Employee1();
        emp.empName = "Larry";
        emp.salary = 20000;

        System.out.println("Credit the Employee, "+ emp.empName+" a salary of $"+ emp.salary);

    }
}
