package day20;

public class IfElseIfElseStatement3 {
    static void main() {

        String browser = "Larry";

        if(browser.equals("IE"))
        {
            System.out.println("Launch IE Browser....");
        }
        else if (browser.equals("Safari"))
        {
            System.out.println("Launch Safari Browser...");
        }
        else if (browser.equals("Chrome"))
        {
            System.out.println("Launch Chrome Browser...");
        }
        else if (browser.equals("Firefox"))
        {
            System.out.println("Launch Firefox Browser...");
        }
        else
        {
            System.out.println("Not a valid browser name...");
        }
    }
}
