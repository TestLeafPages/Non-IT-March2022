package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class BMW extends Car {
	public BMW() {

	}

	public BMW(String name) {
		super();
	}

	public BMW(int num) {
		this("BMW");
	}

	public BMW(int num, int num2) {

	}

	public void autoPark() {
		System.out.println("Autopark");
		ChromeDriver
	}

	public void applyBrake() {
		System.out.println("Apply ABS Brake");
	}

	public void getBrakes() {
		this.applyBrake();
		super.applyBrake();
	}
}
