package day26;

public class Calculation
{
    int a;  //Global or class level variables
    int b;

    public void addition()
    {
        int sum =a+b;
        System.out.println("Addition of " + a + " and " + b +" is: "+ sum);
    }

    public void subtraction()
    {
        int difference =a-b;
        System.out.println("Subtraction of " + a + " and " + b +" is: "+ difference);
    }

    public void multiplication()
    {
        int product =a*b;
        System.out.println("Multiplication of " + a + " and " + b +" is: "+ product);
    }


}
