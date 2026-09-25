package day29;

public class Application
{
    Application ap;
    public  void m1()
    {
        System.out.println("m1 method...");
        ap= new Application();
        ap.m2();
    }

    public  void m2()
    {
        System.out.println("m2 method...");
        ap.t1();
    }
    public  void m3()
    {
        System.out.println("m3 method...");
    }

    public  void t1()
    {
        System.out.println("t1 method...");
        Application.t3();
    }

    public static void t2()
    {
        System.out.println("t2 method...");
        Application app= new Application();
        app.m2();
    }

    public static void t3()
    {
        Application.t2();
        System.out.println("t3 method...");
    }


}
