package week3.day1;

public class HDFCBank implements RBI,SEBI{

	public void debitCharges(int custID) {
		System.out.println("Charges Debited");
	}

	public void creditInterest() {
		System.out.println("Interest Credited");
	}
	//-----------------------------------------------------------//
	public void sellCreditCard() {
		System.out.println("Sell Credit card");
	}
	public void sellPersonalLoan() {
		System.out.println("Sell Personal Loan");
	}
	

}
