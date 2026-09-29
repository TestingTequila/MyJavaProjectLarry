package day31;

public class TestCustomer {
    static void main() {
        Customer cust1 = new Customer();
        System.out.println(cust1.fName);
        System.out.println(cust1.lName);
        System.out.println(cust1.age);
        System.out.println(cust1.gender);

        Customer cust2 = new Customer("Tony");
        System.out.println(cust2.fName);//Tony
        System.out.println(cust2.lName);//null
        System.out.println(cust2.age);//0
        System.out.println(cust2.gender);//[]

        Customer cust3 = new Customer("Rose", "Mary");
        System.out.println(cust3.fName);//Rose
        System.out.println(cust3.lName);//Mary
        System.out.println(cust3.age);//0
        System.out.println(cust3.gender);//[]

        Customer cust4 = new Customer("Ron", "Hill", 45);
        System.out.println(cust4.fName);//
        System.out.println(cust4.lName);//
        System.out.println(cust4.age);//
        System.out.println(cust4.gender);//

        Customer cust5 = new Customer("Veronica", "Popsecue", 27, 'F');
        System.out.println(cust5.fName);//
        System.out.println(cust5.lName);//
        System.out.println(cust5.age);//
        System.out.println(cust5.gender);//


    }
}
