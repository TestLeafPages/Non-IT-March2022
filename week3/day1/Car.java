package week3.day1;

public class Car extends Vehicle{
public void handBrake() {
	System.out.println("Hand Brake");
}
public void turnAC() {
	System.out.println("AC");
}
public void sunRoof() {
	Car obj = new Car();
	obj.handBrake();
	handBrake();
	this.handBrake();
}
}
