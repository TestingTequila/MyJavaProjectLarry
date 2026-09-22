package day26;

public class ExecutingMobilePhones {
    static void main() {
        MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Samsung";
        phone1.model = "Galaxy S5";
        phone1.batteryPercentage = 67;

        phone1.makeCall();
        phone1.charge();
        phone1.displayMobileDetails();
    }
}
