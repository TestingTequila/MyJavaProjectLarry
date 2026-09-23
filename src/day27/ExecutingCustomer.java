package day27;

import java.util.Arrays;

public class ExecutingCustomer
{
    static void main() {
        Customer cust= new Customer();
        String[] devices =cust.getDeviceDetails("Rose");
        System.out.println(Arrays.toString(devices));
    }
}
