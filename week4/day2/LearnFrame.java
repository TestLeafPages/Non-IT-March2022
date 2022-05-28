package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {
	public static void main(String[] args) {
		// Set up a driver
		WebDriverManager.chromedriver().setup();
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load an URL
		driver.get("https://jqueryui.com/selectable/");
		// Maximize the screen
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		// Switch the context from webpage to frame
//		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(5);
		
		driver.findElement(By.xpath("//li[text()='Item 1']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Download")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
