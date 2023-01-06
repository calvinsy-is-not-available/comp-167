/**
 * 
 * 
 * Calvin S. Dempsey Jr
 * Comp 167
 * Section 02
 * 30 November 2022
 * 
 * This program is a dialogue to the main file 'csdempsey_GuiBanking' that allows a client to 
 * 	edit the balance of their account by either withdrawing or depositing an amount.
 * 	Note: the cancel button restores the initial balance value, thereby 
 *  emulating an 'undo' of sorts.
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

public class csdempsey_EditAccount extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	// Field for user to pass in amount to be deposited or withdrawn
	private JTextField txtAmount;
	// Name label
	JLabel lblName;
	// ID label
	JLabel lblID;
	// Balance label
	JLabel lblBalance;
	// global Bank Account object
	csdempsey_BankAccount userAccount;
	// list that will be used to display previous transactions
	JList list;
	// DefaultListModel that will be used for the above list
	DefaultListModel<String> defaultListModelAccount = new DefaultListModel<String>();
	// ArrayList that will be used to add previous transactions to above list
	ArrayList<String> arrayListTransactions = new ArrayList<String>();
	// Will be used to keep track of balance passed in with Bank Account info for canceling purposes
	private int balance;
	
	

	/**
	 * Launch the application.
	 */
	// To make any class runnable, it needs a main method
	public static void main(String[] args) {
		try {
			csdempsey_EditAccount dialog = new csdempsey_EditAccount();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public csdempsey_EditAccount(csdempsey_BankAccount userAccount) {
		// Storing passed in balance in case cancel is pressed
		balance = userAccount.getBalance();
		// assigning the given Bank Account object to the globally stored Bank Account object
		this.userAccount = userAccount;
		//Initializing
		init();
		// Using given info to set the attributes of the Bank Account object 
		lblName.setText(userAccount.getCustomerName());
		lblID.setText(userAccount.getCustomerId());
		lblBalance.setText(Integer.toString(userAccount.getBalance()));
	}
	
	// Test EditAccount
	public csdempsey_EditAccount() {
		userAccount = new csdempsey_BankAccount("Test User", "Test ID");
		userAccount.setBalance(100);
		init();
		lblName.setText(userAccount.getCustomerName());
		lblID.setText(userAccount.getCustomerId());
		lblBalance.setText(Integer.toString(userAccount.getBalance()));
	}
	
	private void init() {
		// Title
		setTitle("Edit Account");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			// Name label
			lblName = new JLabel("Name");
			lblName.setBounds(124, 31, 85, 13);
			contentPanel.add(lblName);
		}
		
		// ID label
		lblID = new JLabel("New label");
		lblID.setBounds(124, 66, 85, 13);
		contentPanel.add(lblID);
		
		// Balance Label
		lblBalance = new JLabel("");
		lblBalance.setBounds(124, 103, 45, 13);
		contentPanel.add(lblBalance);
		
		// ID Label
		JLabel lblIDLabel = new JLabel("ID");
		lblIDLabel.setBounds(35, 66, 85, 13);
		contentPanel.add(lblIDLabel);
		
		// Another Balance label
		JLabel lblBalanceLabel = new JLabel("Balance");
		lblBalanceLabel.setBounds(35, 103, 68, 13);
		contentPanel.add(lblBalanceLabel);
		
		// Another Name Label
		JLabel lblNameLabel = new JLabel("Name");
		lblNameLabel.setBounds(35, 31, 85, 13);
		contentPanel.add(lblNameLabel);
		
		// textField used to obtain info passed in by user
		txtAmount = new JTextField();
		txtAmount.setBounds(35, 138, 96, 19);
		contentPanel.add(txtAmount);
		txtAmount.setColumns(10);
		
		// Deposit button
		JButton btnDeposit = new JButton("Deposit");
		// Deposit button actionListener
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					userAccount.depositGui(Integer.parseInt(txtAmount.getText()));
					lblBalance.setText(Integer.toString(userAccount.getBalance()));
					txtAmount.setText(null);
					csdempsey_BankAccount.lastAction = "Deposited ";
					updateTransaction(userAccount);
				}
				catch (NumberFormatException error) {
					csdempsey_ErrorPane alert = new csdempsey_ErrorPane();
				    alert.ErrorType("Failed to parse integer, " + "\n" +
				    					"enter integers only please");
				    alert.setVisible(true);
				    txtAmount.setText(null);
				}
				
			}
		});
		btnDeposit.setBounds(35, 167, 96, 19);
		contentPanel.add(btnDeposit);
		
		// withdraw button
		JButton btnWithdraw = new JButton("Withdraw");
		// withdraw button actionListener
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// attempts to scan in an integer
				try {
					userAccount.withdrawGui(Integer.parseInt(txtAmount.getText()));
					lblBalance.setText(Integer.toString(userAccount.getBalance()));
					txtAmount.setText(null);
					csdempsey_BankAccount.lastAction = "Withdrawn ";
					updateTransaction(userAccount);
				}
				// else if an integer is not entered,
					// an errorPane is instantiated and an error is thrown
				catch (NumberFormatException error) {
					csdempsey_ErrorPane alert = new csdempsey_ErrorPane();
				    alert.ErrorType("Failed to parse integer, " + "\n" +
				    					"enter integers only please");
				    alert.setVisible(true);
				    txtAmount.setText(null);
				}
				
				
			}
		});
		btnWithdraw.setBounds(35, 180, 96, 21);
		contentPanel.add(btnWithdraw);
		
		// list used to hold previous transactions
		list = new JList();
		list.setBounds(219, 30, 189, 197);
		contentPanel.add(list);
		
		// previous transaction label
		JLabel lblPreviousTransactions = new JLabel("Previous Transactions");
		lblPreviousTransactions.setBounds(219, 10, 189, 13);
		contentPanel.add(lblPreviousTransactions);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				// 'ok' button
				JButton okButton = new JButton("OK");
				// ok button actionListener
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					// passes accepted changes back to GuiBankAccount
						csdempsey_GuiBanking guiBankAccount = new csdempsey_GuiBanking();
					guiBankAccount.updateAccountData(userAccount);
					dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				// cancel button
				JButton cancelButton = new JButton("Cancel");
				// cancel button actionListener
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// uses initially passed-in balance to
							// reset the balance after changes are made
						userAccount.setBalance(balance);
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	// populates the previous transaction list
	public void updateTransaction (csdempsey_BankAccount userAccount) {
		arrayListTransactions.add(userAccount.getPreviousTransactionToString());
		
		for (String account : arrayListTransactions) {
			defaultListModelAccount.addElement(account);
		}
		
		// The below code caused a duplication error in my list
		  // Occurred because the arrayList was not cleared out
			//arrayListTransactions.forEach((action)->{
			//	defaultListModelAccount.addElement(action);
			//});
		
		list.setModel(defaultListModelAccount);
		
		// empties the arrayList so duplicates aren't presented in the list
		arrayListTransactions.clear();
	}
}
