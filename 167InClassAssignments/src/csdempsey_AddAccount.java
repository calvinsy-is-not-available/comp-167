/**
 * 
 * 
 * Calvin S. Dempsey Jr
 * Comp 167
 * Section 02
 * 30 November 2022
 * 
 * 
 * This program is a dialogue to the main file 'csdempsey_GuiBanking' that prompts the user
 * 	to add an account and its respective credentials.
 */

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class csdempsey_AddAccount extends JDialog {

	// main interface for the AddAccount Dialogue
	private final JPanel contentPanel = new JPanel();
	// GuiBankAccount object privately scoped
	private csdempsey_GuiBanking guiBanking;
	// Name textField
	private JTextField txtName;
	// ID textField
	private JTextField txtID;
	// Balance textField
	private JTextField txtBalance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			csdempsey_AddAccount dialog = new csdempsey_AddAccount();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public csdempsey_AddAccount(csdempsey_GuiBanking window) {
		guiBanking = window;
		init();
		
	}
	
	public csdempsey_AddAccount() {
		init();
	}
	
	
	private void init() {
		// Title
		setTitle("Add Account");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			// Name Label
			JLabel lblNewLabel = new JLabel("Name");
			lblNewLabel.setBounds(27, 48, 45, 13);
			contentPanel.add(lblNewLabel);
		}
		{
			// ID Label
			JLabel lblNewLabel_1 = new JLabel("ID");
			lblNewLabel_1.setBounds(27, 88, 45, 13);
			contentPanel.add(lblNewLabel_1);
		}
		{
			// Balance Label
			JLabel lblNewLabel_2 = new JLabel("Balance");
			lblNewLabel_2.setBounds(27, 132, 54, 13);
			contentPanel.add(lblNewLabel_2);
		}
		{
			// Name textField
			txtName = new JTextField();
			txtName.setBounds(80, 45, 143, 19);
			contentPanel.add(txtName);
			txtName.setColumns(10);
		}
		{
			// ID textField
			txtID = new JTextField();
			txtID.setBounds(80, 85, 143, 19);
			contentPanel.add(txtID);
			txtID.setColumns(10);
		}
		{
			// Balance textField
			txtBalance = new JTextField();
			txtBalance.setBounds(82, 129, 141, 19);
			contentPanel.add(txtBalance);
			txtBalance.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				// 'Ok' button
				JButton okButton = new JButton("OK");
				// actionListener for ok button
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// local Bank Account object
						csdempsey_BankAccount account = new csdempsey_BankAccount(txtName.getText(), txtID.getText());
						// Setting balance passed in to the local Bank Account object
						account.setBalance(Integer.parseInt(txtBalance.getText()));
						// Passing back the bank account to the list
						guiBanking.updateAccountData(account);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				// 'cancel' button
				JButton cancelButton = new JButton("Cancel");
				// actionListener for cancel button
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//System.exit cancels the application
						//Dispose just closes the app
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
