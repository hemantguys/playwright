import com.microsoft.playwright.*;

public class abc {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            // Launch a Chromium browser instance
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            // Create a new browser context
            Browser.NewContextOptions contextOptions = new Browser.NewContextOptions();
            BrowserContext context = browser.newContext(contextOptions);
            // Open a new page
            Page page = context.newPage();
            System.out.println("Hemant");
            // Navigate to a website
            page.navigate("https://www.google.com");
            // Take a screenshot
            //   page.screenshot(new Page.ScreenshotOptions().setPath("example.png"));
            Thread.sleep(3000);
            // Close the browser
             browser.close();
        }
    }
}
