package day33;

public class EcommerceApplication {
    public EcommerceApplication doLogin() {
        System.out.println("login to app...");
        return this;
    }

    public EcommerceApplication doLogin(String un, String password) {
        System.out.println("login to app..." + un + " & " + password);
        return this;
    }

    public EcommerceApplication doSearch(String productName) {
        System.out.println("Search..." + productName);
        return this;
    }

    public EcommerceApplication doSearch(String productName, double price) {
        System.out.println("Search..." + productName + " & " + price);
        return this;
    }

    public EcommerceApplication doSearch(String productName, double price, String brand) {
        System.out.println("Search..." + productName + " & " + price + " & " + brand);
        return this;
    }

    public EcommerceApplication doAddToCart(String productName) {
        System.out.println("Adding to Cart: " + productName);
        return this;
    }

    public EcommerceApplication doPayment(String cardNumber, int Cvv) {
        System.out.println("Making payment using Credit Card: " + cardNumber + "& " + Cvv);
        return this;
    }

    public EcommerceApplication doPayment(String payPal, String password) {
        System.out.println("Making payment using Credit Card: " + payPal + "& " + password);
        return this;

    }

    public EcommerceApplication doGenerateOrderId() {
        double orderId = Math.random();
        System.out.println("Order Id is: " + orderId);
        return this;
    }

    public EcommerceApplication doLogout() {
        System.out.println("Logout....");
        return this;
    }
}
