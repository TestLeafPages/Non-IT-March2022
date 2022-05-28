package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasics {
	public static void main(String[] args) throws InterruptedException {
		// To set up a system environment to run selenium scripts in browser
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Eclipse\\Eclipse-workspace\\April
		// Batch\\LearnSelenium\\drivers\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load a url into my browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser window
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		driver.close();

	}
}
