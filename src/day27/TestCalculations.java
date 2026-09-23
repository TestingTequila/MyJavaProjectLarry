package day27;

import day26.Calculation;

public class TestCalculations {
    static void main() {
        Calculations calc = new Calculations();
        calc.a = 12;
        calc.b = 8;

        calc.addition1();//void

        int value1 = calc.addition2();//int a
        System.out.println("Value1: " + value1);
        System.out.println("Value1: " + value1*5);

        int value2 = calc.addition3(); //int b
        System.out.println("Value2: " + value2);
        System.out.println("Value2: " + value2*5);

        int value3 = calc.addition4(); //int sum
        System.out.println("Value3: " + value3);
        System.out.println("Value3: " + value3*5);


    }
}
