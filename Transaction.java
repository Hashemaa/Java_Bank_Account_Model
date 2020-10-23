// Imports the DecimalFormat class from the text package.
import java.text.DecimalFormat;

/**
 * Program Name: Transaction.java
 * Purpose: This is an aggregate class whose object can be a data member in another class.
 * Coder: Hashem Abou Ahmad	-	0961218
 * Date: Jun 10, 2020
 */

public class Transaction {

	//Creates a DecimalFormat object called formatter and pass a desired format to the one argument constructor located in the DecimalFormat class.
	DecimalFormat formatter = new DecimalFormat("$#,##0.00");

	//Declares a private String type variables to hold the month and the transaction.
	private String month, transaction;
	//Declares a private integer type variable to hold the day.
	private int day;
	//Declares a private double type variable to hold the amount and the balance in the account.
	private double amount, balance;

	//Creates a no argument constructor.
	Transaction() {

		//Assigns the fields to null and 0.
		this.month = null;
		this.day = 0;
		this.transaction = null;
		this.amount = 0.0;
		this.balance = 0.0;

	}//End of Transaction() constructor.

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
	 * <p><b>Method Name:</b> getDay()
	 * <p><b>Purpose:</b> To return the day.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> An integer.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public int getDay() {

		//Returns the day.
		return this.day;

	}//End of getDay() method.

	/**
	 * <p><b>Method Name:</b> getTransaction()
	 * <p><b>Purpose:</b> To return the transaction.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A String.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public String getTransaction() {

		//Returns the transaction.
		return this.transaction;

	}//End of getTransaction() method.

	/**
	 * <p><b>Method Name:</b> getAmount()
	 * <p><b>Purpose:</b> To return the amount.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A double.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public double getAmount() {

		//Returns the amount.
		return this.amount;

	}//End of getAmount() method.

	/**
	 * <p><b>Method Name:</b> getBalance()
	 * <p><b>Purpose:</b> To return the balance.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A double.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public double getBalance() {

		//Returns the balance.
		return this.balance;

	}//End of getBalance() method.

	/**
	 * <p><b>Method Name:</b> set()
	 * <p><b>Purpose:</b> To set the month, day, transaction, amount, and balance.
	 * <p><b>Accepts:</b> A String for the month, an integer for the day, a String for the transaction, a double for the amount, a double for the balance.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public void set(String month, int day, String transaction, double amount, double balance) {

		//Assigns the fields to the arguments.
		this.month = month;
		this.day = day;
		this.transaction = transaction;
		this.amount = amount;
		this.balance = balance;

	}//End of set() method.

	/**
	 * <p><b>Method Name:</b> toString()
	 * <p><b>Purpose:</b> To Override the toString() method from the Object's class.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A String.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	@Override
	public String toString() {

		//Returns the month, day, transaction, amount, and the balance.
		return this.month + "\t" + this.day + "\t" + this.transaction + ":\t" + formatter.format(this.amount) + "   \tBalance:\t" + formatter.format(this.balance);

	}//End of toString() method.

}//End Transaction class.