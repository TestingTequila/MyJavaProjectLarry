package day20;

public class IfElseIfElseStatement2 {
    static void main() {

        String browser = "Chrome";

        if(browser=="IE")
        {
            System.out.println("Launch IE Browser....");
        }
        else if (browser=="Safari")
        {
            System.out.println("Launch Safari Browser...");
        }
        else if (browser=="Chrome")
        {
            System.out.println("Launch Chrome Browser...");
        }
        else if (browser=="Firefox")
        {
            System.out.println("Launch Firefox Browser...");
        }
        else
        {
            System.out.println("Not a valid browser name...");
        }
    }
}
