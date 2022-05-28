package week3.day1;

public interface RBI {
	int minimumBalance = 5000;

	/**
	 * This method should debit chargers whenever the cust is getting any service
	 * from the bank
	 * 
	 * @param custID -> Customer ID of the customer
	 * @exception - NoSuchServiceException -> The customer is requesting for an
	 *            invalid service
	 * 
	 */
	public void debitCharges(int custID);
	
	public void creditInterest() ;
}
