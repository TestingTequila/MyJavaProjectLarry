package day32.privatepublicmethods;

public class Browser {
    public void launchBrowser() {
        checkOS();
        checkBrowserDependencies();
        checkRAM();
        checkBrowserVersion();
        System.out.println("Launching Browser......");
    }

    private void checkRAM() {
        System.out.println("Checking RAM....");
    }

    private void checkBrowserVersion() {
        System.out.println("Checking Browser Version....");
    }

    private void checkOS() {
        System.out.println("Checking OS....");
    }

    private void checkBrowserDependencies() {
        System.out.println("Checking Browser Dependencies....");
    }


}
