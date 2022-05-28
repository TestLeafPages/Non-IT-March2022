package week3.day1;

public class MyBank {
public static void main(String[] args) {
	
	RBI bank = new HDFCBank();
	
	bank.creditInterest();
	bank.debitCharges(1234);
	bank.sellCreditCard();
	bank.sellPersonalLoan();
}
}
