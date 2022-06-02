package week7.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	
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
		
		Assert.assertEquals(actualTitle, expectedTitle); // assertion will be failed
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed(); //true
		
		Assert.assertTrue(displayed); // if we get true, then the test case status will pass
	//	Assert.assertFalse(displayed); //if the value is false, then the testcase status will be pass
		                               //if we get true, then the testcase status will be failed
		
		
		
		
		
		
		
		
		
		/*
		 * if(expectedTitle.equals(actualTitle)) {
		 * System.out.println("Title is matching"); }else {
		 * System.out.println("Title is not matching"); }
		 */
			

			
			
			
			
			
			
			
			
			
			
			
			

	}

}
