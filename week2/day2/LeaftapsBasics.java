package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsBasics {
public static void main(String[] args) {
	// Driver setup
	WebDriverManager.chromedriver().setup();
	// Open Chrome Browser
	ChromeDriver driver = new ChromeDriver();
	// Load the URL
	driver.get("http://leaftaps.com/opentaps/control/login");
	// Maximize the window
	driver.manage().window().maximize();
	
	// Finding the webelement
	WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
	// Entering some input in the text box
	elementUsername.sendKeys("Demosalesmanager");
	
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Other");
	
	
	
	
	
	
	
	
	
	
}
}
