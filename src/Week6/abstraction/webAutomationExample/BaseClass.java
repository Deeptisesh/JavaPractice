package Week6.abstraction.webAutomationExample;

abstract class BaseClass extends GrandBaseClass {
    // Web Automation,Single inheritance, Hide functionalities of open and close browser

    abstract void openBrowser(String browser);
    abstract void closeBrowser(String browser);

    @Override
    void takeScreenShot() {
        System.out.println("Taking ScreenShot");
    }
}
