package day19;

public class MathOperations {
    static void main() {
        //Case 1: I/I = Integer Part
        System.out.println(10 / 2); // 5
        System.out.println(9 / 3);  // 3
        System.out.println(10 / 3); // 3

        //Case 2: I/D or D/I or D/D = Integer + Decimal part
        System.out.println(10 / 3.0); //3.3333333333333335
        System.out.println(10.0 / 3); //3.3333333333333335
        System.out.println(10 / 3); //3
        System.out.println(9 / 2); //4
        System.out.println(9.0 / 2);//4.5
        System.out.println(9 / 2.0); //4.5
        System.out.println(9.0 / 2.0); //4.5

        int a = 10;
        int b = 2;
        int c = 3;
        System.out.println(a / c); //3

        double divide = a / c;
        System.out.println(divide); //3.0

        //Case 3: Modulo Operator[%] ==> Remainder

        System.out.println(10 % 2);//0
        System.out.println(10 % 3); //1
        System.out.println(15 % 4); //3
        System.out.println(15 / 4); //3

    }
}
