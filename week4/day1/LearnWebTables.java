package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTables {
public static void main(String[] args) {
	// Set up a driver
			WebDriverManager.chromedriver().setup();
			// Open a chrome browser
			ChromeDriver driver = new ChromeDriver();
			// Load an URL
			driver.get("http://www.leafground.com/pages/table.html");
			// Maximize the screen
			driver.manage().window().maximize();
			// Implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
			// Finding the table
			WebElement elementTable = driver.findElement(By.xpath("//h2"));
			
			List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
			
			// Iterate the rows to get the data
			for (int i = 1; i < rows.size(); i++) {
				// Cols inside the rows
				List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
//				for (int j = 0; j < cols.size(); j++) {
					System.out.println(cols.get(1).getText());
//				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
}
