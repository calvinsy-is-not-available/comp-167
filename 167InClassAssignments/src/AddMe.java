import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Color;

public class AddMe {

	private JFrame frame;
	private JTextField txtAdd;
	private JList<String> list;
	private DefaultListModel<String> addList;
	private JButton btnDelete;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMe window = new AddMe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddMe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		addList = new DefaultListModel<String>(); 
		
		list = new JList<String>();
		list.setBackground(new Color(255, 255, 255));
		list.setBounds(268, 134, 89, -74);
		frame.getContentPane().add(list);
		
		JLabel lblError = new JLabel("");
		lblError.setForeground(new Color(255, 0, 0));
		lblError.setBounds(264, 10, 45, 13);
		frame.getContentPane().add(lblError);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtAdd.getText().length() !=0) {
					addList.addElement(txtAdd.getText());
					list.setModel(addList);
					txtAdd.setText(null);
					lblError.setText(null);
				}
				else {
					lblError.setText("No Value Added");
				}
			}
		});
		btnAdd.setBounds(44, 37, 89, 23);
		frame.getContentPane().add(btnAdd);
		
		txtAdd = new JTextField();
		txtAdd.setBounds(44, 80, 89, 19);
		frame.getContentPane().add(txtAdd);
		txtAdd.setColumns(10);
		
		
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					addList.remove(list.getSelectedIndex());
					list.setModel(addList);
				}
				catch (ArrayIndexOutOfBoundsException E) {
					lblError.setText("Invalid Selection");
				}
			}
		});
		btnDelete.setBounds(268, 193, 85, 21);
		frame.getContentPane().add(btnDelete);
		
		
	}
}
