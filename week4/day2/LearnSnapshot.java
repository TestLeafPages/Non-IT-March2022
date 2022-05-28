package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSnapshot {
	public static void main(String[] args) throws IOException {
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
		
		
		// Printscreen -> clip board -> FILE
		// MSPAINT -> Paste
		// Save it
		
		File sourceImage = driver.findElement(By.xpath("//button[text()='Alert Box']")).getScreenshotAs(OutputType.FILE);
		File destImage = new File("./snaps/IMG002.png");
		FileUtils.copyFile(sourceImage, destImage);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
