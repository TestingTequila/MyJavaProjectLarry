package day32.Miscellaneous;

public class TestEmployeeDetails
{
    static void main() {
       EmployeeDetails empDetails= new EmployeeDetails("larry1234", "43545345897786", 4321);
       empDetails.setCity("London");

        System.out.println("Employee UserName: " + empDetails.getUserName());
        System.out.println("Employee AccountNumber: " + empDetails.getAccountNumber());
        System.out.println("Employee ATM PIN: " + empDetails.getAtmPIN());
        System.out.println("Employee City: " + empDetails.getCity());

        System.out.println("========Update City & ATM PIN========");
        empDetails.setCity("San Diego");
        empDetails.setAtmPIN(9080);

        System.out.println("Employee UserName: " + empDetails.getUserName());
        System.out.println("Employee AccountNumber: " + empDetails.getAccountNumber());
        System.out.println("Employee ATM PIN: " + empDetails.getAtmPIN());
        System.out.println("Employee City: " + empDetails.getCity());


    }
}
