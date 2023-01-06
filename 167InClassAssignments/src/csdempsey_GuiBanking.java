/**
 * 
 * 
 * Calvin S. Dempsey Jr
 * Comp 167
 * Section 02
 * 30 November 2022
 * 
 * 
 * This program accomplishes an emulation of bank account application 
 * 	that can store a client's username, banking ID, and balance.
 * 	From those options a client can choose which account they would like to edit.
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class csdempsey_GuiBanking {

	// main user-interface
	private JFrame frmBankingApplication;
	//tracking val 
	int positionInArrayList = 0;
	// add button
	JButton btnAdd;
	// window object
	static csdempsey_GuiBanking window;
	// globally scoped bank account object
	csdempsey_BankAccount bankAccount;
	// defaultListModel of type Bank Account
	DefaultListModel<csdempsey_BankAccount> defaultListModelAccount = new DefaultListModel<csdempsey_BankAccount>();
	// arrayList type Bank Account
	ArrayList<csdempsey_BankAccount> arrayListAccounts;
	// list that displays Bank Account objects
	private JList list_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new csdempsey_GuiBanking();
					window.frmBankingApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public csdempsey_GuiBanking() {
		init();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void init() {
		// Instantiating the globally scoped arrayList 
		arrayListAccounts = new ArrayList<csdempsey_BankAccount>();
		frmBankingApplication = new JFrame();
		frmBankingApplication.setTitle("Banking Application");
		frmBankingApplication.setBounds(100, 100, 450, 300);
		frmBankingApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Instantiating the globally scope add button
		btnAdd = new JButton("Add");
		btnAdd.setBounds(10, 25, 85, 21);
		// actionListener for add button
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Show Add Account dialogue 
				csdempsey_AddAccount addAccount = new csdempsey_AddAccount(window);
				// deprecated method --> addAccount.show(true);
				// Supported version:
				addAccount.setVisible(true);
				
			}
		});
		frmBankingApplication.getContentPane().add(btnAdd);
		frmBankingApplication.getContentPane().setLayout(null);
		
		
		// declaring and instantiating edit button
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(10, 71, 85, 21);
		// actionListener for edit button
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bankAccount = arrayListAccounts.get(list_1.getSelectedIndex());
				csdempsey_EditAccount editAccount = new csdempsey_EditAccount(bankAccount);
				editAccount.setVisible(true);
			}
		});
		frmBankingApplication.getContentPane().add(btnEdit);
		
		// Instantiating globally scoped list that will display logged Bank Account objects
		list_1 = new JList();
		list_1.setBounds(230, 28, 196, 216);
		frmBankingApplication.getContentPane().add(list_1);
	}
	
	public void updateAccountData(csdempsey_BankAccount userAccount) {
		// the list will mirror the data contained by the object
		// however, we also want a collection that will hold the object-type BankAccount
		//Therefore, we will use an arrayList:
		arrayListAccounts.add(userAccount); 
		// To iterate through the string representations that will be added to the model,
		// we will use lambdas
		int i = positionInArrayList;
		while (i<arrayListAccounts.size()) {
			defaultListModelAccount.addElement(arrayListAccounts.get(i));
			i+=1;
		}
		//arrayListAccounts.forEach((account)->{
		//	defaultListModelAccount.addElement(account);
		//});
		/*
		 * for (csdempsey_BankAccount account : arrayListAccounts) {
		 * 		defaultListModelAccount.addElement(account);
		 * }
		 */
		list_1.setModel(defaultListModelAccount);
		positionInArrayList+=1;
		//arrayListAccounts.clear();
	}
}
