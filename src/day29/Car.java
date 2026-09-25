package day29;

public class Car {
    String name;
    int price;
    String color;
    final static int wheels=4;

    public void start()
    {
        System.out.println("Car Start....");
        //static int x =9; local variables can never be static

    }

    public static void stop()
    {
        System.out.println("Car Stop.....");
        //static int x =9;
    }
}
