/**
 * 
 * 
 * Calvin S. Dempsey Jr
 * Comp 167
 * Section 02
 * 4 November 2022
 */
// Shell Code
import java.util.Scanner;

public class csdempsey_BankAccount {
	// Declaration block
	public static Scanner scnr = new Scanner(System.in);
	private int _balance;
	private String _customerId;
	private String _customerName;
	private int _previousTransaction;
	// Object for driver code, welcome message and info fetcher variant
	public csdempsey_BankAccount() {
		System.out.println();
		for (int i =0; i<50; i+=1) {
			System.out.print("*");
		}
		System.out.println();
		// Getting user info
		System.out.println("Aggie Bank");
		System.out.println("Please enter name associated with customer account followed by your ID on a newline");
		System.out.println("\n" + "E.G. " + "\n" + "Name: name" + "\n" + "ID: " + 1234 + "\n");
		System.out.println("Customer Name : ");
		System.out.println("Customer ID: ");
		_customerName = scnr.nextLine();
		_customerId = scnr.nextLine();
		
	}
	// Object for driver code, instantiates bank account object
	public csdempsey_BankAccount(String customerName, String customerId) {
		_customerName = customerName;
		_customerId = customerId;
	}
	// Accessor Methods
	public int getBalance() {return _balance;}
	
	public void setBalance(int balance) {_balance = balance;}
	
	public String getCustomerId() {return _customerId;}
	
	public void setCustomerId(String id) {_customerId = id;}
	
	public String getCustomerName() {return _customerName;}
	
	public void setCustomerName(String name) {_customerName = name;}
	
	// node type behaviour from this method
	public void setPreviousTransaction(int transaction) {_previousTransaction = transaction;}
	// fetches previous action and associated numerical amount with said action
	public void getPreviousTransaction() {
		if(_previousTransaction==0) {
			// formatting for borders
			for (int i = 0; i<50; i+=1) {
				System.out.print("-");
			}
			// printing edge-case statement
			System.out.println("\n" + "No transaction occured" +"\n");
			System.out.println("\n");
			// formatting for borders
			for (int i = 0; i<50; i+=1) {
				System.out.print("-");
			}
			System.out.println();
		}
		else {
			for (int i = 0; i<50; i+=1) {
				System.out.print("-");
			}
			System.out.println();
			System.out.println(csdempsey_BankAccountApplication.lastAction +": "+ _previousTransaction);
			System.out.println();
			for (int i = 0; i<50; i+=1) {
				System.out.print("-");
			}
			System.out.println("\n" + "\n" + "\n");
		}
	}
	// removes selected amount from user bank account object
	public void withdraw(int amount) {
		if (amount < 0) {
			System.out.println("Error: Negative value, please enter only positive integers.");
		}
		else if (amount > _balance) {
			while (_balance!=0) {
				_balance-=1;
				amount-=1;
			}
			System.out.println("\n" + "Most sincerest apologies, " + "\n" + "	Overdraft detected: " + amount + " US Dollars greater than current balance");
		}
		else {
			setPreviousTransaction(amount);
			_balance -= amount;
		}
	}
	// deposits currency into user bank account object
	public void deposit(int amount) {
		if (amount < 0) {
			System.out.println("Error: Negative value, please enter only positive integers.");
		}
		else {
			setPreviousTransaction(amount);
			_balance += amount;
		}
	}
}

