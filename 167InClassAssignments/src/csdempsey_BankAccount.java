/**
 * 
 * 
 * Calvin S. Dempsey Jr
 * Comp 167
 * Section 02
 * 4 November 2022
 * 
 * This program is the foundation of the main file 'csdempsey_GuiBanking'
 * 	This file defines and supports all banking feature present in csdempsey_GuiBanking
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
	// Used for GuiBankAccount
	static String lastAction;
	private String consoleExpression = "No Transaction Occured";
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
	// Object for driver code, instantiates bank account object and sets two private fields
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
	
	public void setPreviousTransaction(int transaction) {_previousTransaction = transaction;}
	
	// fetches previous action and associated numerical amount with said action
		// used for previous assignment. Not used for GuiBankAccount
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
			// Below was used for previous assignment 
			// System.out.println(csdempsey_BankAccountApplication.lastAction +": "+ _previousTransaction);
			// consoleExpression = csdempsey_BankAccountApplication.lastAction +": "+ _previousTransaction; 
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
	//Same above withdraw method from above but errors prompt the errorPane dialogue
	public void withdrawGui(int amount) {
		int tempBalance = _balance;
		if (amount < 0) {
			// Display an alert dialog 
			csdempsey_ErrorPane alert = new csdempsey_ErrorPane();
            alert.ErrorType("Error: Negative value, please enter only positive integers.");
            alert.setVisible(true);
         }
		else if (amount > _balance) {
			while (_balance!=0) {
				_balance-=1;
				amount-=1;
			}
			csdempsey_ErrorPane alert = new csdempsey_ErrorPane();
			alert.ErrorType("Most sincerest apologies, Overdraft detected: " +"\n"+ amount + " US Dollars greater than current balance");
			alert.setVisible(true);
			setPreviousTransaction(tempBalance);
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
	//Same above deposit method from above but errors prompt the errorPane dialogue
	public void depositGui(int amount) {
		int tempBalance = _balance;
		if (amount < 0) {
			csdempsey_ErrorPane alert = new csdempsey_ErrorPane();
			alert.ErrorType("Error: Negative value, please enter only positive integers.");
			alert.setVisible(true);
			setPreviousTransaction(tempBalance);
		}
		else {
			setPreviousTransaction(amount);
			_balance += amount;
		}
	}
	
	//Overloaded Operators
	public String toString(){
		return _customerName+" "+_customerId;
		}
	//Used for GuiBankAccount
	public String getPreviousTransactionToString() {
		consoleExpression = lastAction +": "+ _previousTransaction;
		return consoleExpression;
	}
}
