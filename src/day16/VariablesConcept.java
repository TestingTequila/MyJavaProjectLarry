package day16;

public class VariablesConcept {

    static void main() {
        // What are Variables?

        // I want to store the number 10 --> Create variable
        // 1. dataType variableName = value;

        // 2. dataType variableName;
        //    variableName = value;

        // Data Type ---> Byte/short/int/long/float/double/char/boolean
        int x = 10;

        //I want to store the number 14.56

        double y = 14.56;

        // I want to store the number 100;
        int z = 100;

        // I want to store the letter 'y'

        char c = 'y';

        // I want to store the value true;
        boolean b = true;

        // I want to store the letter X
        char f = 'X';

        //Data Type ---> Byte/short/long/float/ -- we need to know when to use these data types
        //nonDecimalNumber ---> [Byte/short/int/long]

        long g = 45;

        //decimalNumber -->[float/double]
        float h = 123.45F;

        // How to pick the best data type out of all the nonDecimal and Decimal Numbers

        //WAP to print addition of two integer numbers [100, 30]

        // -128 to 127
        // -32768 to 32767

        short b1 = 100;
        short b2 = 50;

        int sum = b1 + b2;

        // storing decimal numbers --> float, double

        //float  --> 4 byte or 32 bits [range->6/7 decimal places]
        //double --> 8 byte or 64 bits [range -> more than 7 decimal places]

        // store the number --> 12.34


        float f1 = 1.1234567898F;
        double d1 = 1.1234567898;

        double add =f1+d1;

        System.out.println(f1);
        System.out.println(d1);

    }

}




