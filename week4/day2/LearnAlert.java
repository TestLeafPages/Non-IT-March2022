package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	public static void main(String[] args) {
		// Set up a driver
		WebDriverManager.chromedriver().setup();
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load an URL
		driver.get("http://www.leafground.com/pages/Alert.html");
		// Maximize the screen
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Clicking the alert box button
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
		// Switch the context from webpage to alert
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println("Alert Text: "+ text);
		
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		
		String promptText = promptAlert.getText();
		System.out.println(promptText);
		
		promptAlert.sendKeys("Testleaf Chennai");
		
		
		promptAlert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
