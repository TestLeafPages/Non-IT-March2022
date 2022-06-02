package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	//public ChromeDriver driver;

	/*
	 * @Given("Open the chrome browser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * 
	 * }
	 * 
	 * @Given("Load the application url") public void loadApplication() {
	 * driver.get("http://leaftaps.com/opentaps"); }
	 */

	@Given("Enter the username as {string}") //Demosalesmanager
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);

	}
	
	@Given("Enter the password as {string}") //crmsfa
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);

	}
	
	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		Assert.assertTrue(displayed);

	}
	
	@But("Error message should be displayed")
	public void verifyErroeMessage() {
		boolean displayed = driver.findElement(By.id("errorDiv")).isDisplayed(); // true / false
		Assert.assertTrue(displayed);
	}
	
		

}
