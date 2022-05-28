package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {
	public static void main(String[] args) {
		// Set up a driver
		WebDriverManager.chromedriver().setup();
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load an URL
		driver.get("http://www.leafground.com/pages/Window.html");
		// Maximize the screen
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("home")).click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		System.out.println("--------------------------------------------------");
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		List<String> windowHandlesList = new ArrayList<>(windowHandles);
		String newWindowHandle = windowHandlesList.get(1);
		System.out.println("--------------------------------------------------");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("--------------------------------------------------");

		driver.switchTo().window(newWindowHandle);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("--------------------------------------------------");

		driver.switchTo().window(windowHandlesList.get(0));
		
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		
		
		

	}
}
