package day20;

public class IfElseIfElseStatement {
    static void main() {

        int marks = 45;

        if(marks>=90)
        {
            System.out.println("Outstanding....");
        }
        else if (marks>80 && marks<90)
        {
            System.out.println("Very Good....");
        }
        else if (marks>70 && marks<80)
        {
            System.out.println("Good....");
        }
        else if (marks>60 && marks<70)
        {
            System.out.println("Average....");
        }
        else if (marks>50 && marks<60)
        {
            System.out.println("Doing good, can do better....");
        }
        else
        {
            System.out.println("You really need to work Hard....");
        }
    }
}
