package day32.rules;

public class Employee
{
    private String empID;
    private String name;
    private String phoneNumber;

    //Setting mandatory variables value through constructor
    public Employee(String empID, String name) {
        this.empID = empID;
        this.name = name;
    }

    //Setting non-mandatory variables value through setter method
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
