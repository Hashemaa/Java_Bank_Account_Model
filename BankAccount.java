
/**
 * Program Name: BankAccount.java
 * Purpose: An abstract class that acts as the super/base/parent class for all sub-classes (PersonalChequingAccount class & SavingAccount class).
 * Coder: Hashem Abou Ahmad	-	0961218
 * Date: Jun 10, 2020
 */

public abstract class BankAccount {

	//Declares a set of private String variables.
	private String customerName, accountType, month;

	//Declares a set of public abstract methods to be implemented in the sub-classes.
	public abstract String generateAccountNumber();
	public abstract void deposit(double depositAmount, int day);
	public abstract void withdrawal(double withdrawalAmount, int day);
	public abstract void recordTransaction(int day, String transaction, double amount, double balance);
	public abstract void monthlyProcess();

	//Creates a no argument constructor for this class.
	BankAccount() {

		//Assigns the private String variables to null.
		this.customerName = null;
		this.accountType = null;
		this.month = null;

	}//End of BankAccount() constructor.

	//Creates a multiple argument constructor for this class.
	BankAccount(String customerName, String accountType, String month) {

		//Assigns the private String variables to the appropriate arguments.
		this.customerName = customerName;
		this.accountType = accountType;
		this.month = month;

	}//End of BankAccount() constructor.

	/**
	 * <p><b>Method Name:</b> getCustomerName()
	 * <p><b>Purpose:</b> To return the customer name.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A String.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public String getCustomerName() {

		//Returns the customer name.
		return this.customerName;

	}//End of getCustomerName() method.

	/**
	 * <p><b>Method Name:</b> setCustomerName()
	 * <p><b>Purpose:</b> To set the name of the customer.
	 * <p><b>Accepts:</b> A String.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public void setCustomerName(String customerName) {

		//Sets the customer name as the received parameter.
		this.customerName = customerName;

	}//End of setCustomerName() method.

	/**
	 * <p><b>Method Name:</b> getAccountType()
	 * <p><b>Purpose:</b> To return the type of the account.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A String.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public String getAccountType() {

		//Returns the account type.
		return this.accountType;

	}//End of getAccountType() method.

	/**
	 * <p><b>Method Name:</b> setAccountTypes()
	 * <p><b>Purpose:</b> To set the account type.
	 * <p><b>Accepts:</b> A String.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public void setAccountTypes(String accountType) {

		//Sets the account type to the received parameter.
		this.accountType = accountType;

	}//End of setAccountTypes() method.

	/**
	 * <p><b>Method Name:</b> getMonth()
	 * <p><b>Purpose:</b> To return the month.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A String.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public String getMonth() {

		//Returns the month.
		return this.month;

	}//End of getMonth() method.

	/**
	 * <p><b>Method Name:</b> setMonth()
	 * <p><b>Purpose:</b> To set the month.
	 * <p><b>Accepts:</b> A String.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public void setMonth(String month) {

		//Sets the month to the received parameter.
		this.month = month;

	}//End of setMonth() method.

	/**
	 * <p><b>Method Name:</b> toString()
	 * <p><b>Purpose:</b> To Override the toString() method from the Object's class.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A String.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	@Override
	public String toString() {

		//Returns the customemr name, account type, and the current month.
		return "Customer: \t" + this.customerName + "\nAccount Type: \t" + this.accountType + "\nCurrent Month: \t" + this.month;

	}//End of toString() method.

}//End BankAccount class.