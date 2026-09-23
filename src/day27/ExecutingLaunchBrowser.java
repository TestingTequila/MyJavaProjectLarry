package day27;

public class ExecutingLaunchBrowser
{
    static void main() {
        LaunchBrowser lb= new LaunchBrowser();
        String browser =lb.browserType("Larry");
        System.out.println("Launching " + browser + "........");
    }
}
