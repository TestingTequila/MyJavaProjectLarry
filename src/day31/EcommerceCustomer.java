package day31;

public class EcommerceCustomer {
    static String fName;
    static String lName;
    static int age;
    static char gender;

    private EcommerceCustomer()
    {
        System.out.println("This is default Constructor...");
    }

    private EcommerceCustomer(String fName) {
        this.fName = fName;
    }

    private EcommerceCustomer(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    private EcommerceCustomer(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    private EcommerceCustomer(String fName, String lName, int age, char gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }
}
