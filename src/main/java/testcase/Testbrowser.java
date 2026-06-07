package testcase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Testbrowser {
	// Entry point - run Playwright from a main method so Java compiles correctly
	public static void main(String[] args) {
		// Use try-with-resources to ensure Playwright is closed automatically
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			Page page = browser.newPage();
			page.navigate("https://www.google.com/");
			// enter the keyword 'hello world' into the Google search box and press Enter
			page.fill("textarea", "hello world");
			// press Enter in keyboard to submit the search form
			page.press("textarea", "Enter");
			// wait for results to load / to see the browser
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
			// close the browser (Playwright will be closed by try-with-resources)
			browser.close();
		}
	}
}
