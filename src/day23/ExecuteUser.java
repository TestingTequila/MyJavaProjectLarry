package day23;

public class ExecuteUser {
    static void main() {

        User u1 = new User();
        u1.name = "Ravi";
        u1.age = 32;
        u1.city = "Delhi";

        User u2 = new User();
        u2.name = "Kerrie";
        u2.age = 25;
        u2.city = "NJ";

        User u3 = new User();
        u3.name = "Larry";
        u3.age = 45;
        u3.city = "Texas";

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);

        System.out.println("***********************u1=u2*********************************");

        u1 = u2; // u1 has broken its current connection and pointing where u2 is pointing
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);//Kerrie
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);//Kerrie
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);//Larry

        System.out.println("***********************u2=u3*********************************");
        u2 = u3;// u2 has broken its current connection and pointing where u3 is pointing
        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);//Kerrie
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);//Larry
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);//Larry

        System.out.println("***********************u3=u1*********************************");
        u3 = u1;// u3 has broken its current connection and pointing where u1 is pointing

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);//Kerrie
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);//Larry
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);//Kerrie

        System.out.println("***********************u1=u2=u3*********************************");
        u1 = u2 = u3;

        System.out.println(u1.name + ", " + u1.age + ", " + u1.city);//Kerrie
        System.out.println(u2.name + ", " + u2.age + ", " + u2.city);//Kerrie
        System.out.println(u3.name + ", " + u3.age + ", " + u3.city);//Kerrie

    }
}
