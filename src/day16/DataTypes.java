package day16;

public class DataTypes {
    static void main() {
        //[byte, short, int, long], [float, double], char, boolean---> [size, range]

        //===================Non-Decimal Numbers[byte, short, int, long]=============================
        //===================Size of Data Type================================

        byte x = 10;     // 1 byte = 8 bits
        System.out.println(x);
        short x1 = 10;  //2 byte = 16 bits
        System.out.println(x1);
        int x3 = 10;   //4 byte = 32 bits
        System.out.println(x3);
        long x4 = 10;   //8 byte = 64 bits
        System.out.println(x4);

        //===================Range of Data Type================================

        byte b1 = -128; // -128 to 127
        byte b2 = 127;

        short s1 = -32768;  // -32768 to 32767
        short s2 = 32767;

        int i1 = -2147483648;  // -2147483648 to 2147483647
        int i2 = 2147483647;

        long l2 = -9223372036854775808L; //-9223372036854775808L to 9223372036854775807L
        long l1 = 9223372036854775807L;

        //====================Example==========================================

        long b3 = 2147483650L;

        //=============Decimal Numbers[float, double]=======================================

        float f1 = 12.9876543210F; // 4 byte = 32 bits
        double d1 = 12.9876543210; // 8 byte = 64 bits

        // Save the age of a person [55] -No

        byte age = 55;

        // WAP to multiply 2 numbers [12,8]
        int n1 = 12;
        int n2 = 8;

        int product = n1 * n2;


    }


}
