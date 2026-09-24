package day28;

public class OverloadingMain
{
    static void main() {
        System.out.println("Default main method...");
    }

    static void main(int i) {
        System.out.println(" main method..." + i);
    }

    static void main(String s) {
        System.out.println(" main method..." + s);
    }


}
