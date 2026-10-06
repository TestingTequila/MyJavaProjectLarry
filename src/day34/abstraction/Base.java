package day34.abstraction;

public abstract  class Base
{
    public abstract void addition(int a, int b);

    public void subtraction(int a, int b)
    {
        int diff =a-b;
        System.out.println("Subtraction of " + a + " and " + b + " is: " + diff);
    }
    public void multiplication(int a, int b)
    {
        int product =a*b;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + product);
    }
    public void division(int a, int b) {
        int divide = a / b;
        System.out.println("Division of " + a + " and " + b + " is: " + divide);
    }
}
