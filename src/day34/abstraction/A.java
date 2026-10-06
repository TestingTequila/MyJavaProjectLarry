package day34.abstraction;

public class A extends Base
{

    @Override
    public void addition(int a, int b) {
        int sum = a+b;
        System.out.println("Addition by A: " + (a+b));
    }
}
