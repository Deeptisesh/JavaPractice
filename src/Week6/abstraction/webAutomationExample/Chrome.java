package Week6.abstraction.webAutomationExample;

public class Chrome extends BaseClass{
    @Override
    void openBrowser(String browser) {
        System.out.println("opening Chrome");
    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("closing Chrome");

    }
}
