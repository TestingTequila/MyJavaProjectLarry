package day26;

public class MobilePhone {
    String brand;
    String model;
    int batteryPercentage;


    public void makeCall() {
        System.out.println("Calling....");
    }

    public void charge() {
        System.out.println("The battery is " + batteryPercentage + "% charged");
    }

    public void displayMobileDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery: " + batteryPercentage + "%");
    }
}
