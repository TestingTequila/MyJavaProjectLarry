package day19;

public class PostIncrementOperator {
    static void main() {

        int a = 1;
        int b = a;

        //Post Increment [Assign and then Increment]
        System.out.println(a);//1
        System.out.println(b);//1

        int x =1;
        int y = x++;
        System.out.println(x); //2
        System.out.println(y); //1

        int c =99;
        int d = c++;
        System.out.println(c);//100
        System.out.println(d);//99

        int e =-99;
        int f =e++;
        System.out.println(e); // -98
        System.out.println(f); // -99

        double g = 12.34;
        double h = g++;
        System.out.println(g);//13.34
        System.out.println(h);//12.34

    }
}
