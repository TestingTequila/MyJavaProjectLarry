package day34.abstraction;

public class D extends Base {


    @Override
    public void addition(int a, int b) {
        int sum = 4*a+b;
        System.out.println("Addition by D: " + sum);
    }
}
