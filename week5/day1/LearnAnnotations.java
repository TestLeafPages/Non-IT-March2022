package week5.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite Execution");
	}
	@BeforeTest
	public void bt() {
		System.out.println("Before Test Execution");
	}
	@BeforeClass
	public void bc() {
		System.out.println("Before Class Execution");
	}
	@BeforeMethod
	public void bm() {
		System.out.println("Before Method Execution");
	}
	@Test
	public void test1() {
		System.out.println("Test 1 Execution");
	}
	@Test
	public void test2() {
		System.out.println("Test 2 Execution");
	}
	@AfterMethod
	public void am() {
		System.out.println("After Method Execution");
	}
	@AfterClass
	public void ac() {
		System.out.println("After Class Execution");
	}
	@AfterTest
	public void at() {
		System.out.println("After Test Execution");
	}
	@AfterSuite
	public void as() {
		System.out.println("After Suite Execution");
	}
}
