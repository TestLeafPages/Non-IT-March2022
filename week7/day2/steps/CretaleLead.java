package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CretaleLead extends BaseClass{
		
	@When("Click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	
	@Then("MyHomePage should be displayed")
	public void verifyMyHomePage() {
		boolean displayed = driver.findElement(By.xpath("//div[text()='My Home']")).isDisplayed();
		Assert.assertTrue(displayed);

	}
	
	
}
