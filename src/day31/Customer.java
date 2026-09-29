package day31;

public class Customer {

    //constructor

    public Customer() {

        System.out.println("This is default Constructor...");
    }

    public Customer(String fName) {
        System.out.println("This is constructor with one parameter");
        this.fName = fName;
    }

    public Customer(String fName, String lName) {
        System.out.println("This is constructor with two parameter");

        this.fName = fName;
        this.lName = lName;
    }

    public Customer(String fName, String lName, int age) {
        System.out.println("This is constructor with three parameter");

        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public Customer(String fName, String lName, int age, char gender) {
        System.out.println("This is constructor with four parameter");
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    String fName;
    String lName;
    int age;
    char gender;

}
