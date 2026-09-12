package day20;

public class SwitchStatement {
    static void main() {

        String browser = "Chrome";

        switch (browser) {
            case "IE":
                System.out.println("Launch Chrome Browser...");
                break;

            case "Edge":
                System.out.println("Launch Edge Browser....");
                break;

            case "Safari":
                System.out.println("Launch Safari Browser....");
                break;

            case "Chrome":
                System.out.println("Launch Chrome Browser");

                break;
            case "Firefox":
                System.out.println("Launch Firefox Browser");
                break;

            default:
                System.out.println("Not a valid browser name...");
                break;
        }
    }
}
