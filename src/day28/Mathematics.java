package day28;

public class Mathematics {
    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of " + a + " & " + b + " is : " + sum);
    }

    //1. Changing the data type of parameters
    public void addition(double a, int b) {
        double sum = a + b;
        System.out.println("Sum of " + a + " & " + b + " is : " + sum);
    }

    public void addition(double a, double b) {
        double sum = a + b;
        System.out.println("Sum of " + a + " & " + b + " is : " + sum);
    }

    //2. By changing the order of parameters
    public void addition(int b, double a) {
        double sum = a + b;
        System.out.println("Sum of " + a + " & " + b + " is : " + sum);
    }

    //3. By changing the count of parameters
    public void addition(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of " + a + " & " + b + "& " +c + " is : " + sum);
    }

}
