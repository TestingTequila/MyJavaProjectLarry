package day32.rules;

public class BankAccount {
    private String accountNumber;
    private String atmPIN;

    //Non-mutable variables value should be set through Constructor
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    //Mutable variables value should be set through Constructor
    public void setAtmPIN(String atmPIN) {
        this.atmPIN = atmPIN;
    }
}
