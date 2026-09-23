package day27;

public class ExecutingIdCard
{
    static void main() {
        IdCard emp1= new IdCard();
        String name =emp1.name("Larry ", "Means");
        System.out.println(name + "MEDMA");

        System.out.println("==================================");

        IdCard emp2 = new IdCard();
        String name2 =emp2.name("Ashish ", "Mishra");
        System.out.println(name2+ "MEDMA");
    }
}
