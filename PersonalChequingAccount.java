// Imports the ArrayList class from the utility package.
import java.util.ArrayList;

/**
 * Program Name: PersonalChequingAccount.java
 * Purpose: A sub-class of the super BankAccount class that contain all the personal chequing account information and behaviours, also implements the interface InterestPayable to apply different use to calcInterest().
 * Coder: Hashem Abou Ahmad	-	0961218
 * Date: Jun 10, 2020
 */

public class PersonalChequingAccount extends BankAccount implements InterestPayable {

	//Declares a private String type variable to store the account number.
	private String accountNumber;
	//Declares a private integer type variable to store the number of withdrawals and deposits.
	private int numberWithdrawals, numberDeposits;
	//Declares a private double type variable to hold the balance.
	private double balance;
	//Declares a private boolean type variable to determine if the account is active.
	private boolean accountActive;
	//Declares and initializes a private CONSTANT static double type variables to hold the INTEREST RATE and the SERVICE FEE.
	private final static double INT_RATE = 0.025;
	private final static double SERVICE_FEE = 0.85;
	//Declares and initializes a double CONSTANT type variable to get rid of magic numbers.
	final double MINIMUM_ACCOUNT_BALANCE = 25.00;

	//Creates an ArrayList object of a Transaction class type and declares it as 'record' with a private access modifier.
	private ArrayList<Transaction> record = new ArrayList<Transaction>();

	//Declares a private integer type variable to hold the last day of the month.
	private int lastDay;

	//Creates a no argument constructor.
	PersonalChequingAccount() {

		//Assigns the customer name, account types, and account number to null.
		this.setCustomerName(null);
		this.setAccountTypes(null);
		this.accountNumber = null;
		//Assigns the boolean type variable to false.
		this.accountActive = false;
		//Assigns the balance and the number of withdrawals and deposits to 0.
		this.numberWithdrawals = 0;
		this.numberDeposits = 0;
		this.balance = 0.0;

	}//End of PersonalChequingAccount() constructor.

	//Creates a multiple argument constructor.
	PersonalChequingAccount(String customerName, String month, double balance) {

		//Sets the fields to the received arguments.
		this.setCustomerName(customerName);
		this.setMonth(month);
		this.balance = balance;
		//Sets the account type to a Chequing account.
		this.setAccountTypes("Chequing");
		//Sets the account number using the generateAccountNumber() method.
		this.accountNumber = this.generateAccountNumber();
		//Sets the account active boolean type variable using isAccountActive() method.
		this.accountActive = this.isAccountActive();

	}//End of PersonalChequingAccount() constructor.

	/**
	 * <p><b>Method Name:</b> getAccountNumber()
	 * <p><b>Purpose:</b> To return the account number.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A String.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public String getAccountNumber() {

		//Returns the account number.
		return this.accountNumber;

	}//End of getAccountNumber() method.

	/**
	 * <p><b>Method Name:</b> getNumberWithdrawals()
	 * <p><b>Purpose:</b> To return the number of withdrawals.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> An integer.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public int getNumberWithdrawals() {

		//Returns the number of withdrawals.
		return this.numberWithdrawals;

	}//End of getNumberWithdrawals().

	/**
	 * <p><b>Method Name:</b> getNumberDeposits()
	 * <p><b>Purpose:</b> To return the number of deposits.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> An integer.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public int getNumberDeposits() {

		//Returns the number of deposits.
		return this.numberDeposits;

	}//End of getNumberDeposits() method.

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
	 * <p><b>Method Name:</b> isAccountActive()
	 * <p><b>Purpose:</b> To return whether the account is active or not.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A boolean (true or false).
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public boolean isAccountActive() {

		//Checks if the balance is less than 25.
		if(this.balance < this.MINIMUM_ACCOUNT_BALANCE) {

			//Assigns account active to false and returns it.
			return this.accountActive = false;

		}else {

			//Assigns account active to true and returns it.
			return this.accountActive = true;

		}//End of trailing-else block.

	}//End of isAccountActive() method.

	/**
	 * <p><b>Method Name:</b> getInterestRate()
	 * <p><b>Purpose:</b> To return the interest rate.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A double.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public double getInterestRate() {

		//Returns the interest rate.
		return PersonalChequingAccount.INT_RATE;

	}//End of getInterestRate() method.

	/**
	 * <p><b>Method Name:</b> getServiceFee()
	 * <p><b>Purpose:</b> To return the service fee.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A double.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public double getServiceFee() {

		//Returns the service fee.
		return PersonalChequingAccount.SERVICE_FEE;

	}//End of getServiceFee() method.

	/**
	 * <p><b>Method Name:</b> generateAccountNumber()
	 * <p><b>Purpose:</b> To generate an account number randomly.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A String.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public String generateAccountNumber() {

		//Declares and initializes an integer CONSTANT type variable to get rid of magic numbers.
		final int RANDOM_DIGIT_ARRAY_SIZE = 6;

		//Creates an integer array type variable that holds 6 elements. 
		int[] randomDigitArray = new int[RANDOM_DIGIT_ARRAY_SIZE];
		//Declares a temporary and initializes it to an empty String.
		String temp = "";

		//Creates an enhanced for loop to traverse the array.
		for(int i : randomDigitArray) {
			//Initializes each array element to a random number.
			randomDigitArray[i] = (int)(Math.random() * 10);

			//Concatenates the random number to the temporary variable.
			temp += randomDigitArray[i];

		}//End of enhanced for loop.

		//Returns the account number including the six random digits.
		return "002-623490-" + temp + "-550";

	}//End of generateAccountNumber() method.

	/**
	 * <p><b>Method Name:</b> deposit()
	 * <p><b>Purpose:</b> To deposit money to the bank account.
	 * <p><b>Accepts:</b> A double for the amount and an integer for the day.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public void deposit(double depositAmount, int day) {

		//Updates the balance.
		this.balance += depositAmount;
		//Increments the number of deposits.
		this.numberDeposits++;
		//Determines if the account is active by calling the isAccountActive() method and assigning it to account active.
		this.accountActive = this.isAccountActive();
		//Records the transactions by calling the recordTransaction() method.
		this.recordTransaction(day, "Deposit", depositAmount, this.balance);

	}//End of the deposit() method.

	/**
	 * <p><b>Method Name:</b> withdrawal()
	 * <p><b>Purpose:</b> To withdraw money from the bank account.
	 * <p><b>Accepts:</b> A double for the amount and an integer for the day.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public void withdrawal(double withdrawalAmount, int day) {

		//Declares a String type variable and initializes it to null.
		String transactionMessage = null;

		//Checks if the balances is greater or equals than the withdrawal amount and if the account is active.
		if(this.balance >= withdrawalAmount && this.accountActive == true) {

			//Updates the balance.
			this.balance -= withdrawalAmount;
			//Increments the number of withdrawals.
			this.numberWithdrawals++;
			//Sets the transaction message.
			transactionMessage = "Withdrawal";

			//If the first expression does not satisfy the statement, this expression checks if the balance is less than the withdrawal amount.
		}else if(this.balance < withdrawalAmount) {

			//Sets the transaction message.
			transactionMessage = "Transaction cancelled. Insufficient funds";

			//If the first expression does not satisfy the second statement, this expression checks if the account is not active.
		}else if(this.accountActive == false) {

			//Sets the transaction message.
			transactionMessage = "Transaction cancelled. Account is inactive";

		}//End of trailing-else.

		//Determines if the account is active by calling the isAccountActive() method and assigns it to account active.
		this.accountActive = this.isAccountActive();

		//Records the transactions by calling the recordTransaction() method.
		this.recordTransaction(day, transactionMessage, withdrawalAmount, this.balance);

	}//End of withdrawal() method.

	/**
	 * <p><b>Method Name:</b> calcInterest()
	 * <p><b>Purpose:</b> To calculate the interest.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public void calcInterest() {

		//Creates a switch statement to determine which month it is and what is the last day of that month.
		switch(this.getMonth().toUpperCase()) {

			//Checks if the expression is matching the below month.
			case "JANUARY":
				//Sets the last day.
				this.lastDay = 31;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "FEBRUARY":
				//Sets the last day.
				this.lastDay = 29;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "MARCH":
				//Sets the last day.
				this.lastDay = 31;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "APRIL":
				//Sets the last day.
				this.lastDay = 30;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "MAY":
				//Sets the last day.
				this.lastDay = 31;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "JUNE":
				//Sets the last day.
				this.lastDay = 30;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "JULY":
				//Sets the last day.
				this.lastDay = 31;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "AUGUST":
				//Sets the last day.
				this.lastDay = 31;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "SEPTEMBER":
				//Sets the last day.
				this.lastDay = 30;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "OCTOBER":
				//Sets the last day.
				this.lastDay = 31;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "NOVEMBER":
				//Sets the last day.
				this.lastDay = 30;
				//Breaks out of the statement.
				break;

			//Checks if the expression is matching the below month.
			case "DECEMBER":
				//Sets the last day.
				this.lastDay = 31;
				//Breaks out of the statement.
				break;

			//If non matches, it sets last day to zero. 
			default:
				this.lastDay = 0;
		}//End of the switch statement.

		//Declares and initializes a double type variable to hold the monthly interest amount.
		double monthlyInterestAmount = 0.0;

		//Declares and initializes a double type CONSTANT variable to get rid of magic numbers.
		final double MINIMUM_BALANCE_FOR_INTEREST = 1000.0;
		//Declares and initializes a double CONSTANT type variable to get rid of magic numbers.
		final int MONTHS = 12;

		//Checks if the balance is greater or equals than 1000 dollars.
		if(this.balance >= MINIMUM_BALANCE_FOR_INTEREST) {
			//Calculates the monthly interest amount.
			monthlyInterestAmount = (PersonalChequingAccount.INT_RATE / MONTHS);
		}//End of single-selection if statement.

		//Updates the balance.
		this.balance *= (monthlyInterestAmount + 1.0);

		//Records the transactions by calling the recordTransaction() method.
		this.recordTransaction(this.lastDay, "Interest", monthlyInterestAmount, this.balance);

	}//End of calcInterest() method.

	/**
	 * <p><b>Method Name:</b> recordTransaction()
	 * <p><b>Purpose:</b> To record the transaction and hold the parameters to have different values in other methods.
	 * <p><b>Accepts:</b> An integer for the day, a String for the transaction, a double for the amount, and a double for the balance.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public void recordTransaction(int day, String transaction, double amount, double balance) {

		//Creates a new Transaction object.
		Transaction newTransaction = new Transaction();
		//Sets the parameters for the new object.
		newTransaction.set(this.getMonth(), day, transaction, amount, balance);
		//Adds the new object to the ArrayList.
		this.record.add(newTransaction);

	}//End of recordTransaction() method.

	/**
	 * <p><b>Method Name:</b> printTransaction()
	 * <p><b>Purpose:</b> To print the transactions in the ArrayList.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public void printTransactions() {

		//Outputs the title followed by the month.
		System.out.println("\n*****************************************");
		System.out.println("Transaction Record for the Month of " + this.getMonth());
		System.out.println("*****************************************");

		//Creates an enhanced for loop to traverse the ArrayList.
		for(Transaction i : this.record) {
			System.out.println(i);
		}//End of the enhanced for loop.

	}//End of printTransactions() method.

	/**
	 * <p><b>Method Name:</b> monthlyProcess()
	 * <p><b>Purpose:</b> To calculate the service fee and print the transactions.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	public void monthlyProcess() {

		//Declares and initializes a double type variable to hold the service fee.
		double serviceFee = 0.0;

		//Declares and initializes an integer CONSTANT type variable to get rid of magic numbers.
		final int MAXIMUM_WITHDRAWALS = 4;

		//Checks if the number of withdrawals is more than 4 withdrawals.
		if(this.numberWithdrawals > MAXIMUM_WITHDRAWALS) {
			//Calculates the service fee and assigns it to the double type variable.
			serviceFee = this.numberWithdrawals * PersonalChequingAccount.SERVICE_FEE;
			//Updates the balance.
			this.balance -= serviceFee;
		}//End of monthlyProcess() method.

		//Invokes the calcInterest() method to calculate the interest.
		this.calcInterest();

		//Records the transactions by calling the recordTransaction() method.
		this.recordTransaction(this.lastDay, "Service fee", serviceFee, this.balance);
		//Prints the transactions.
		this.printTransactions();
		//Determines if the account is active by calling the isAccountActive() method and assigning it to accountActive.
		this.accountActive = this.isAccountActive();

	}//End of monthlyProcess() method.

	/**
	 * <p><b>Method Name:</b> toString()
	 * <p><b>Purpose:</b> To Override the toString() method in the BankAccount() super class.
	 * <p><b>Accepts:</b> Nothing.
	 * <p><b>Returns:</b> A String.
	 * <p><b>Date:</b> Jun 10, 2020
	 */
	@Override
	public String toString() {

		//Returns the account number, number of withdrawals, number of deposits, the balance, if the account is active, annual interest rate, and the monthly service fee rate.
		return "Account Number: \t  " + this.accountNumber + "\nNumber of Withdrawals: \t  " + this.numberWithdrawals + "\nNumber of Deposits: \t  "
				+ this.numberDeposits + "\nBalance: \t\t  " + this.balance + "\nAccount Active: \t  " + this.accountActive + "\nAnnual Interest Rate: \t  "
				+ PersonalChequingAccount.INT_RATE + "\nMonthly Service Fee Rate: " + PersonalChequingAccount.SERVICE_FEE;

	}//End of toString() method.

}//End PersonalChequingAccount class.