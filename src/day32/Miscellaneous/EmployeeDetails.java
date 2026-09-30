package day32.Miscellaneous;

public class EmployeeDetails
{
    private final String userName;// mandatory + non-mutable
    private final String accountNumber; // mandatory + non-mutable
    private int atmPIN; // mandatory + mutable
    private String city;//non-mandatory + mutable

    public EmployeeDetails(String userName, String accountNumber, int atmPIN) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.atmPIN = atmPIN;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAtmPIN(int atmPIN) {
        this.atmPIN = atmPIN;
    }

//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }


    public String getUserName() {
        return userName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAtmPIN() {
        return atmPIN;
    }

    public String getCity() {
        return city;
    }
}
