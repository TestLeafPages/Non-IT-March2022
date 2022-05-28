package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {
public static void main(String[] args) {
	// Set up a driver
	WebDriverManager.chromedriver().setup();
	// Open a chrome browser
	ChromeDriver driver = new ChromeDriver();
	// Load an URL
	driver.get("http://leaftaps.com/opentaps");
	// Maximize the screen
	driver.manage().window().maximize();
	// Implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	// Login into leaftaps
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa",Keys.ENTER);
	
	// CRMSFA click
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	// Leads tab click
	driver.findElement(By.linkText("Leads")).click();
	
	// Create Lead Click
	driver.findElement(By.linkText("Create Lead")).click();
	
	// Handling drop down using sendKeys
//	driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
	
	// Handling drop down using Select class
	//1. Find the drop down element
	WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	
	//2. Access the Select class
	Select select1 = new Select(sourceDropdown);
	
	//3. Select the value from the drop down
	select1.selectByIndex(1);
//	select1.deselectByIndex(1);
	
	WebElement marketingCampaignDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	
	Select select2 = new Select(marketingCampaignDropdown);
	
//	select2.selectByVisibleText("Car and Driver");
	
	select2.selectByValue("9000");
	List<WebElement> options = select2.getOptions();
	select2.selectByIndex(options.size()-1);
	
	for (WebElement eachOption : options) {
		System.out.println(eachOption.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
