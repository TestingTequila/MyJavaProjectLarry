package day33;

public class TestUser {
    static void main() {
        User u1 = new User("Jason", 32, "NJ");

        System.out.println("Name: " + u1.getName());
        System.out.println("Age: " + u1.getAge());
        System.out.println("City: " + u1.getCity());

        System.out.println("====================================");

        User u2 = new User(40);

        System.out.println("Name: " + u2.getName());
        System.out.println("Age: " + u2.getAge());
        System.out.println("City: " + u2.getCity());

    }
}
