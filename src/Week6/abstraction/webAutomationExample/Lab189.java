package Week6.abstraction.webAutomationExample;

public class Lab189 {
    public static void main(String[] args) {
        Chrome c=new Chrome();
        c.openBrowser("chrome");
        c.closeBrowser("chrome");
        c.takeScreenShot();
    }
}
