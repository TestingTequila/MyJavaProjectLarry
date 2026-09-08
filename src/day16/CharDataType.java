package day16;

public class CharDataType {
    static void main() {

        // char --> to store single character [a] [2 byte]
        //range [a-z][A-Z][!@#$%^&*()_-+=][0-9]


        char c1 = 'a';
        char c11 = 'b';
        char ch1 = 'A';
        char ch2 = 'B';
        char c2 = '1';
        char c3 = '5';

        System.out.println(c1); //a
        System.out.println(c11); //b
        System.out.println(c1 + c11); //a(97)+b(98) ==> 195
        System.out.println(ch1); //A
        System.out.println(ch2); //B
        System.out.println(ch1 + ch2); //A(65)+B(66) ==> 131
        System.out.println(c2); //1
        System.out.println(c3); //5
        System.out.println(c2 + c3); //1(49)+5(53) ==> 102

        System.out.println((int) c1);
        System.out.println((int) 'A');

        System.out.println((char) 65);

        System.out.println(c1 + 0); // 97+0;
        System.out.println(c1 + '0'); // 97+48 = 145
    }
}
