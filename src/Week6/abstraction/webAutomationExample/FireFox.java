package Week6.abstraction.webAutomationExample;

public class FireFox extends BaseClass{
    @Override
    void openBrowser(String browser) {
        System.out.println("opening Firefox");

    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Closing Firefox");

    }
}
