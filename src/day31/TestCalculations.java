package day31;

public class TestCalculations {
    static void main() {
        Calculations calc = new Calculations();
        calc.addition(12, 5);
        System.out.println(calc.a); //12
        System.out.println(calc.b); //5

        System.out.println("===========================================");

        calc.fullName("Jason", "K", "Wilson");
        System.out.println(calc.fName);//Jason
        System.out.println(calc.mName);//K
        System.out.println(calc.lName);//null

        System.out.println("===========================================");
        calc.empDetails("Justin", 26, 'M', 5678.89);
        System.out.println(calc.name);
        System.out.println(calc.age);
        System.out.println(calc.gender);
        System.out.println(calc.salary);

    }
}
