package day17;

public class ExecutingDataTypes {
    static void main() {

//[byte, short, int, long], [float, double], char, boolean---> [size, range]

        //===================Non-Decimal Numbers[byte, short, int, long]=============================
        //===================Size of Data Type================================

        byte x = 10;     // 1 byte = 8 bits
        short x1 = 10;  //2 byte = 16 bits
        int x3 = 10;   //4 byte = 32 bits
        long x4 = 10;   //8 byte = 64 bits

        System.out.println(x);
        System.out.println(x1);
        System.out.println(x3);
        System.out.println(x4);
        //===================Range of Data Type================================

        byte b1 = -128; // -128 to 127
        byte b2 = 127;

        System.out.println(b1);
        System.out.println(b2);

        short s1 = -32768;  // -32768 to 32767
        short s2 = 32767;

        System.out.println(s1);
        System.out.println(s2);

        int i1 = -2147483648;  // -2147483648 to 2147483647
        int i2 = 2147483647;

        System.out.println(i1);
        System.out.println(i2);

        long l2 = -9223372036854775808L; //-9223372036854775808L to 9223372036854775807L
        long l1 = 9223372036854775807L;

        System.out.println(l1);
        System.out.println(l2);

        //====================Example==========================================

        long b3 = 2147483650L;
        System.out.println(b3);
        //=============Decimal Numbers[float, double]=======================================

        float f1 = 12.9876543210F; // 4 byte = 32 bits
        double d1 = 12.9876543210; // 8 byte = 64 bits
        System.out.println(f1); //12.987655 [output up to 5/6 decimal places we use float]
        System.out.println(d1); //12.987654321 [output up to 8/9 decimal places, we use double]

        float f2 = 2147483648.2147483648F;
        double d2 = 2147483648.2147483648;

        System.out.println(f2);
        System.out.println(d2);

        //=================================single character data type[char]===================

        //char ---> 2 byte
        //range --> [a-z][A-Z][0-9][!@#$%^&*()_+-)]

        char c1 = 'a';
        System.out.println(c1); //a

        char c2 = 'y';
        System.out.println(c2); //y

        char c3 = '9';
        char c4 = '1';

        char c7 = '$';

        System.out.println(c3 + c4);

        char c5 = 'a'; //97
        char c6 = 'b'; //98

        System.out.println(c5); //a
        System.out.println(c6); //b

        System.out.println(c5 + c6); //97+98

        System.out.println("==================================================");




    }
}
