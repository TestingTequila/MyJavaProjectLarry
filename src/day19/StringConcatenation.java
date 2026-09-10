package day19;

public class StringConcatenation {
    static void main() {

        String x = "Hello";
        String y = "World";

        int a = 100;
        int b = 200;

        double d = 12.34;

        System.out.println(x);//Hello
        System.out.println(y);//World
        System.out.println(a);//100
        System.out.println(b);//200

        System.out.println(a + b);//100+200 ==> 300
        System.out.println(x + y);// Hello+World==>HelloWorld
        System.out.println(a + b + x);//300Hello
        System.out.println(a + b + x + y);//300HelloWorld
        System.out.println(x + y + a);//HelloWorld100
        System.out.println(x + y + a + b);//HelloWorld100200
        System.out.println(a + b + x + y + a + b);//300HelloWorld100200
        System.out.println(b + a + a + y + x + b + b + a); //400WorldHello200200100
        System.out.println(a + b + x + y + d + d);//300HelloWorld12.3412.34

        String l = "Java";
        System.out.println(l); //Java
        System.out.println("We are learning " + l);
        System.out.println("The sum of a & b is: " + a + b); //The sum of a & b is: 100200
        System.out.println("The sum of a & b is: " + (a + b)); //The sum of a & b is: 300
        System.out.println(b + a + a + y + x + (b + b) + a); //400WorldHello400100


    }
}
