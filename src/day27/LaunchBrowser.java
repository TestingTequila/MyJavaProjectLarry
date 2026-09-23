package day27;

public class LaunchBrowser {
    public String browserType(String browserName) {
        String browser = "Not a Valid Browser....";
        switch (browserName) {
            case "Edge":
                browser = "Edge";
                break;
            case "Firefox":
                browser = "Firefox";
                break;
            case "Safari":
                browser = "Safari";
                break;
            case "Chrome":
                browser = "Chrome";
                break;
            case "IE":
                browser = "Internet Explorer";
                break;
            case "Larry":
                browser = "Larry";
                break;
        }
        return browser;
    }
}
