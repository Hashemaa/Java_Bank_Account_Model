// Imports the DecimalFormat class from the text package.
import java.text.DecimalFormat;

/**
 * Program Name: BankAccountTester.java
 * Purpose: To test the entire program including the classes.
 * Coder: Hashem Abou Ahmad	-	0961218
 * Date: Jun 12, 2020
 */

public class BankAccountTester {

	//Creates a DecimalFormat object called formatter and pass a desired format to the one argument constructor located in the DecimalFormat class.
	public static DecimalFormat formatter = new DecimalFormat("$#,##0.00");

	public static void main(String[] args) {

		//Creates a PersonalChequingAccount object that passes arguments to the multiple argument constructor.
		PersonalChequingAccount chequing = new PersonalChequingAccount("Janice Joplin", "March", 2345);

		//Inovkes the printChequing() method and passes it the object.
		BankAccountTester.printChequing(chequing);

		//Applies transactions.
		chequing.deposit(25.98, 5);
		chequing.withdrawal(1300.00, 6);
		chequing.withdrawal(1700.00, 10);
		chequing.deposit(1050.00, 11);
		chequing.withdrawal(1700.00, 11);
		chequing.deposit(25.98, 25);
		chequing.withdrawal(400.00, 26);
		chequing.withdrawal(27.00, 28);
		chequing.withdrawal(7.50, 28);

		//Invokes the monthlyProcess() method to print the transactions that happened within the month.
		chequing.monthlyProcess();

		//Prints a new line.
		System.out.println();
		//Inovkes the printChequing() method and passes it the object.
		BankAccountTester.printChequing(chequing);

		//Creates a SavingAccount object that passes arguments to the multiple argument constructor.
		SavingAccount saving = new SavingAccount("Elvis Presley", "March", 6100);

		//Inovkes the printSaving() method and passes it the object.
		BankAccountTester.printSaving(saving);

		//Applies transactions.
		saving.deposit(500.00, 3);
		saving.withdrawal(1000.00, 6);
		saving.deposit(250.00, 15);
		saving.withdrawal(3000.00, 21);
		saving.withdrawal(825.00, 28);
		saving.deposit(250.00, 29);

		//Prints a new line.
		System.out.println();
		//Invokes the monthlyProcess() method to print the transactions that happened within the month.
		saving.monthlyProcess();

		//Prints a new line.
		System.out.println();
		//Inovkes the printSaving() method and passes it the object.
		BankAccountTester.printSaving(saving);

		//Outputs End of program to indicate that the program has fully executed.
		System.out.println("\n******************************************** End of program ********************************************");
		
	}//End main() method.

	/**
	 * <p><b>Method Name:</b> printChequing()
	 * <p><b>Purpose:</b> To output the results as well to reduce redundancy.
	 * <p><b>Accepts:</b> A PersonalChequingAccount object.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 12, 2020
	 */
	public static void printChequing(PersonalChequingAccount chequing) {

		System.out.println("****************************************");
		System.out.println("Cutsomer Name: \t" + chequing.getCustomerName());
		System.out.println("Account Type: \t" + chequing.getAccountType());
		System.out.println("Current Month: \t" + chequing.getMonth());
		System.out.println("****************************************");

		System.out.println("Account Number: \t" + chequing.getAccountNumber());
		System.out.println("Number of Withdrawals: \t" + chequing.getNumberWithdrawals());
		System.out.println("Number of Deposits: \t" + chequing.getNumberDeposits());
		System.out.println("Balance: \t\t" + formatter.format(chequing.getBalance()));
		System.out.println("Account Active: \t" + chequing.isAccountActive());
		System.out.println("Annual Interest Rate: \t" + chequing.getInterestRate() * 100.0 + "%");
		System.out.println("Monthly Service Fee: \t" + formatter.format(chequing.getServiceFee()) + " (applied to no. of withdrawals if withdrawals over 4)");

	}//End of printChequing() method.

	/**
	 * <p><b>Method Name:</b> printSaving()
	 * <p><b>Purpose:</b> To output the results as well to reduce redundancy.
	 * <p><b>Accepts:</b> A printSaving object.
	 * <p><b>Returns:</b> Nothing.
	 * <p><b>Date:</b> Jun 12, 2020
	 */
	public static void printSaving(SavingAccount saving) {

		System.out.println("****************************************");
		System.out.println("Cutsomer Name: \t" + saving.getCustomerName());
		System.out.println("Account Type: \t" + saving.getAccountType());
		System.out.println("Current Month: \t" + saving.getMonth());
		System.out.println("****************************************");

		System.out.println("Account Number: \t" + saving.getAccountNumber());
		System.out.println("Number of Withdrawals: \t" + saving.getNumberWithdrawals());
		System.out.println("Number of Deposits: \t" + saving.getNumberDeposits());
		System.out.println("Balance: \t\t" + formatter.format(saving.getBalance()));
		System.out.println("Account Active: \t" + saving.isAccountActive());
		System.out.println("Annual Interest Rate: \t" + saving.getInterestRate() * 100 + "%");

	}//End of printSaving() method.

}//End BankAccountTester class.