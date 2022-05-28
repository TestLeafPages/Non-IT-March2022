package week5.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	@Test
	public void b() {
		System.out.println("Test 1");
	}
	
	@Test(dependsOnMethods = {"week5.day1.LearnAttributes.c"}, alwaysRun = true)
	public void a() {
		System.out.println("Test 2");
	}
	
	@Test
	public void c() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Test 3");
		throw new RuntimeException();
	}
	/*
	 * (enabled = false) -> @Ignore
	 * (priority = -1)
	 * invocationCount = 7,invocationTimeOut = 5000,threadPoolSize = 2 
	 * timeOut = 1000
	 */
}
