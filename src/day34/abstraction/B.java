package day34.abstraction;

public class B extends Base
{
    @Override
    public void addition(int a, int b) {
        int sum = 2*a+b;
        System.out.println("Addition by B: " + sum);
    }
}
