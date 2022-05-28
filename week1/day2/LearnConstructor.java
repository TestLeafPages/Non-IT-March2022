package week1.day2;

public class LearnConstructor {
	public LearnConstructor() {
		System.out.println("This is executing from the constructor");
	}
public static void main(String[] args) {
	System.out.println("Hey");
	LearnConstructor obj = new LearnConstructor();
	System.out.println(obj);
	obj.printName();
}
public void printName() {
	System.out.println("Testleaf");
}
}
