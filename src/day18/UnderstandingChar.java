package day18;

public class UnderstandingChar {
    static void main() {

        char c1 = 'a';
        char c11 = 'b';

        System.out.println(c1); //a
        System.out.println(c11); //b

        System.out.println(c1 + c11); // 97+98  =195

        System.out.println((int)c1); //97
        System.out.println((int)c11);//98

        System.out.println((char)97); //a

        char r1 = '0'; //47
        char r2 = '9';
        System.out.println(r1); //0
        System.out.println(r2); //9
        System.out.println(r1 + r2);
        System.out.println(r1 - r2);
        System.out.println(r1 * r2);
        System.out.println(r1 / r2);

        System.out.println((int)r1); //48
        System.out.println(r1+ 9); //47
        System.out.println(r1+0); // 48+0 = 48

        System.out.println((int)r1);
        System.out.println((int)'0');
        System.out.println(r1+'0'); // 48+48


        //size = ~1 bit
        //range = true/false
        boolean b1 = true;
        boolean b2= false;


    }
}
