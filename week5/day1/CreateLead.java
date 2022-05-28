package week5.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ReadExcelData;

public class CreateLead extends ProjectSpecificMethods {
	@Test(dataProvider = "testData")
	public void runCreateLead(String username, String password, String cName, String fName, String lName) {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
	}
	
	@DataProvider
	public String[][] testData() throws IOException {
		String[][] data = ReadExcelData.readData("tc001");
		return data;
	}

	/*@DataProvider
	public String[][] testData() {
		// 2D array to store the test data
		String[][] array = new String[2][5];

		array[0][0] = "Demosalesmanager";
		array[0][1] = "crmsfa";
		array[0][2] = "TL";
		array[0][3] = "Hari";
		array[0][4] = "R";

		array[1][0] = "DemoCSR";
		array[1][1] = "crmsfa";
		array[1][2] = "TL";
		array[1][3] = "Babu";
		array[1][4] = "M";

		return array;

	}*/
}
