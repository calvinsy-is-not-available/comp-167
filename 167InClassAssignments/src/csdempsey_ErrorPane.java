/**
 * 
 * 
 * Calvin S. Dempsey Jr
 * Comp 167
 * Section 02
 * 30 November 2022
 * 
 * 
 * This program is a dialogue used in the 'csdempsey_EditAccount' dialogue.
 * 	The purpose of this file is to display an error message when called.
 * 	Note: Error messages are set within the csdempsey_EditAccount and csdempsey_BankAccount files.
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class csdempsey_ErrorPane extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JTextArea textAreaErrorMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			csdempsey_ErrorPane dialog = new csdempsey_ErrorPane();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public csdempsey_ErrorPane() {
		init();
		
		
		
	}
	
	public void init() {
		setTitle("Error");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textAreaErrorMessage = new JTextArea();
		textAreaErrorMessage.setEditable(false);
		textAreaErrorMessage.setForeground(new Color(255, 0, 0));
		textAreaErrorMessage.setFont(new Font("Calibri Light", Font.BOLD, 10));
		textAreaErrorMessage.setBounds(38, 41, 377, 181);
		contentPanel.add(textAreaErrorMessage);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	// Fetches error message from csdempsey_BankAccount
	public void ErrorType (String errorMessage) {
		textAreaErrorMessage.setText(errorMessage);
	}
}
