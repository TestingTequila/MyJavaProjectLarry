package day19;

public class MiscIncrementOperator
{
    static void main() {

        char c = 'a';
        char d = c++;
        System.out.println(c); //b
        System.out.println(d); //a


        char e ='a';
        char f = ++e;
        System.out.println(e);//b
        System.out.println(f);//b

        int num =10;
        System.out.println(num++); //10
        System.out.println(num);   //11

        int k = 10;
        System.out.println(++k);//11
        System.out.println(k);//11
    }
}
