package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {
public static void main(String[] args) {
	// Set up a driver
		WebDriverManager.chromedriver().setup();
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load an URL
		driver.get("https://www.amazon.in/");
		// Maximize the screen
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 13",Keys.ENTER);
		
		// Finding multiple elements with single locator value
		List<WebElement> mobileNames = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
		
		for (WebElement eachMobileName : mobileNames) {
			System.out.println(eachMobileName.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
