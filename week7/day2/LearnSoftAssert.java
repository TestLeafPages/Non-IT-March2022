package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSoftAssert {
	
	@Test
	public void leaftTapsLogin() {
		//Leaftaps - TestLeaf Automation Platform
		String expectedTitle = "TestLeaf Automation Platform";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String actualTitle = driver.getTitle();
		
		SoftAssert softAssert = new SoftAssert();
		
		//Assertion1 -> fail
		System.out.println("Assertion1");
		softAssert.assertEquals(actualTitle, expectedTitle);
	
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed(); //true
		
		//Assertion2 -> pass
		System.out.println("Assertion2");
		softAssert.assertTrue(displayed);
		
		//mandatory step
		softAssert.assertAll();
			
			
			
			
			
			
			
			
			

	}

}
