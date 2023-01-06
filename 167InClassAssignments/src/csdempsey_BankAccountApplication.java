/**
 * 
 * 
 * Calvin S. Dempsey Jr
 * Comp 167
 * Section 02
 * 4 November 2022
 */
// Driver Code
import java.util.Scanner;

public class csdempsey_BankAccountApplication {
	
	// global var work-around to determine last action (i.e. withdraw, deposit)
	public static String lastAction = "-1";

	// shows the menu which users can choose from five options
	public static void showMenu (csdempsey_BankAccount userAccount) {
		// formatting for borders
		for (int i=0; i<50; i+=1) {
			System.out.print("_");
		}
		System.out.println();
		for (int i =0; i<50; i+=1) {
			System.out.print("*");
		}
		// smaller welcome message after user bank account is instantiated 
		System.out.println("\n" + "Welcome " + userAccount.getCustomerName() + "\n" + "Your ID is " + userAccount.getCustomerId());	
	
		// formatting for the menu 
		System.out.println("\n"+"\n" + "A. Check Balance" + "\n" + "B. Deposit" + "\n" + "C. Withdraw" + "\n" + "D. Previous Balance" + "\n" + "E. Exit");
		System.out.println();
		
		// formatting for user choice
				for (int i = 0; i<50; i+=1) {
					System.out.print("=");
				}
				System.out.println("\n"+ "Enter an option : ");
				for (int i = 0; i<50; i+=1) {
					System.out.print("=");
				}
				System.out.println();
	
	}
	// gets and interprets the input from the user
	public static void getMenuOption(char input,csdempsey_BankAccount userAccount, Scanner scnr) {
		// switch case to determine what the user selected and how to carry out that action
		switch (input) {
		// choice: check balance	
		case 'a':
				// formatting for borders
				System.out.println("\n" + "\n" + "\n");
				for (int i = 0; i<50; i+=1) {
					System.out.print("-");
				}
				// acting on user request
				System.out.println("\n" + "Current balance: " + userAccount.getBalance());
				// formatting for borders
				for (int i = 0; i<50; i+=1) {
					System.out.print("-");
				}
				System.out.println();
				break;
		// choice: deposit currency into user bank account	
		case 'b':
				// formatting for borders
				for (int i = 0; i<50; i+=1) {
					System.out.print("-");
				}
				// initiating user-exchange
				System.out.println("\n" + "Enter amount to deposit" + "\n");
				// formatting for borders
				for (int i = 0; i<50; i+=1) {
					System.out.print("-");
				}
				System.out.println("\n" + "\n" + "\n");
				// acting on user request
				userAccount.deposit(scnr.nextInt());
				lastAction = "Deposited";
				break;
		// choice: withdraw currency from user bank account	
		case 'c':
				// formatting for borders
				for (int i = 0; i<50; i+=1) {
					System.out.print("-");
				}
				// initiating user-exchange
				System.out.println("\n" + "Enter amount to withdraw" + "\n");
				// formatting for borders
				for (int i = 0; i<50; i+=1) {
					System.out.print("-");
				}
				System.out.println("\n" + "\n" + "\n");
				// acting on user request
				userAccount.withdraw(scnr.nextInt());
				lastAction = "Withdrawn";
				break;
		// choice: get the previous transaction from user bank account; can probably be made more efficient with a node	
		case 'd':
				// print statements for last transaction
				userAccount.getPreviousTransaction();
				break;
		// abstracted choice: error code in case user does not enter anticipated choice
		default:
			// edge-case pseudo try-catch for input mismatch exception e
			System.out.println("Invalid choice");
			System.out.println("Please enter a character: A, B, C, D, E");
			break;
			
			}
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// creating main bank account object
		csdempsey_BankAccount userAccount = new csdempsey_BankAccount();
		// setting initial conditions
		userAccount.setBalance(0);
		userAccount.setPreviousTransaction(0);
		// prompting the menu to show once
		showMenu(userAccount);
		// initially grabs user input for given options
		char input = scnr.next().charAt(0);
		Character.toLowerCase(input);
		while (input!='e') {
			// uses user input to make selection accordingly
			getMenuOption(input, userAccount, scnr);
			// prints formatting for borders
			for (int i = 0; i<50; i+=1) {
				System.out.print("=");
			}
			System.out.println("\n"+ "Enter an option : ");
			for (int i = 0; i<50; i+=1) {
				System.out.print("=");
			}
			System.out.println();
			// gets next char-option from user
			input = scnr.next().charAt(0);
		}
		
		// prints exit message
		System.out.println("\n"+"\n"+"\n"+"Thank you, " + userAccount.getCustomerName() + ", for using Aggie Bank");
		for (int i =0; i<50; i+=1) {
			System.out.print("*");
		}
	}
}
