package day16;

public class DataTypes {
    //[byte, short, int, long], [float, double], char, boolean---> [size, range]

    //===================Non-Decimal Numbers[byte, short, int, long]=============================
    //===================Size of Data Type================================

    byte x = 10;     // 1 byte = 8 bits
    short x1 = 10;  //2 byte = 16 bits
    int x3 = 10;   //4 byte = 32 bits
    long x4 = 10;   //8 byte = 64 bits

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


}
