package day33;

public class TestECommerceApplication
{
    static void main() {
        EcommerceApplication e1= new EcommerceApplication();
        e1.doLogin().doSearch("Ipad").doAddToCart("Ipad").doPayment("ashish3214", "test@1234").doGenerateOrderId().doLogout();
    }
}
