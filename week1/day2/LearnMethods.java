package week1.day2;

public class LearnMethods {

	public static void main(String[] args) {
		// ClassName objectName = new ClassName();
		LearnMethods obj = new LearnMethods();

		// obj.methodName();
		obj.printMyName();

		long phoneNumber = obj.getPhoneNumber();
		System.out.println(phoneNumber);

		String location = obj.getLocation();
		System.out.println(obj.getLocation());

		int sum = obj.addTwoNumbers(4, 11);
		System.out.println(sum);
	}
	// accessModifier returnType methodName(args){actions}

	public void printMyName() {
		System.out.println("Testleaf");
	}

	private long getPhoneNumber() {
		long phoneNumber = 9887766554L;
		return phoneNumber;
	}

	String getLocation() {
		return "Chennai";
	}

	public int addTwoNumbers(int a, int b) {
		return a + b;
	}

}
