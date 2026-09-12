package day20;

public class SwitchStatement2
{
    static void main() {
        String day = "Sunday";

        switch (day)
        {
            case "Monday":
                System.out.println("Complete Chapter 1");
                break;
            case "Tuesday":
                System.out.println("Complete Chapter 2");
                break;
            case "Wednesday":
                System.out.println("Complete Chapter 3");
                break;
            case "Thursday":
                System.out.println("Complete Chapter 4");
                break;
            case "Friday":
                System.out.println("Complete Chapter 5");
                break;
            default:
                System.out.println("You can play today...");
                break;
        }
    }

}
