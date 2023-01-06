import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import java.awt.Color;

public class StreamingBudget01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StreamingBudget01 frame = new StreamingBudget01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public StreamingBudget01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1306, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrCapitalOneDemo = new JTextArea();
		txtrCapitalOneDemo.setForeground(Color.WHITE);
		txtrCapitalOneDemo.setBackground(Color.BLUE);
		txtrCapitalOneDemo.setFont(new Font("Times New Roman", Font.BOLD, 23));
		txtrCapitalOneDemo.setText("\t\t\t           Capital One Demo");
		txtrCapitalOneDemo.setBounds(25, 10, 1257, 22);
		contentPane.add(txtrCapitalOneDemo);
		
		JTextArea txtrSubscriptionOne = new JTextArea();
		txtrSubscriptionOne.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrSubscriptionOne.setText("Subscription List");
		txtrSubscriptionOne.setBounds(25, 42, 232, 22);
		contentPane.add(txtrSubscriptionOne);
		
		JTextArea txtrAmazon = new JTextArea();
		txtrAmazon.setText("Amazon Prime");
		txtrAmazon.setBounds(25, 86, 232, 22);
		contentPane.add(txtrAmazon);
		
		JTextArea txtrSpotify = new JTextArea();
		txtrSpotify.setText("Spotify");
		txtrSpotify.setBounds(25, 118, 232, 22);
		contentPane.add(txtrSpotify);
		
		JTextArea txtrNetflix = new JTextArea();
		txtrNetflix.setText("Netflix");
		txtrNetflix.setBounds(25, 150, 232, 22);
		contentPane.add(txtrNetflix);
		
		JTextArea txtrAppleMusic = new JTextArea();
		txtrAppleMusic.setText("Apple Music");
		txtrAppleMusic.setBounds(25, 182, 232, 22);
		contentPane.add(txtrAppleMusic);
		
		JTextArea txtrHulu = new JTextArea();
		txtrHulu.setText("Hulu");
		txtrHulu.setBounds(25, 214, 232, 22);
		contentPane.add(txtrHulu);
		
		JTextArea txtrDisneyPlus = new JTextArea();
		txtrDisneyPlus.setText("Disney Plus");
		txtrDisneyPlus.setBounds(25, 246, 232, 22);
		contentPane.add(txtrDisneyPlus);
		
		JTextArea txtrHboMax = new JTextArea();
		txtrHboMax.setText("HBO Max");
		txtrHboMax.setBounds(25, 278, 232, 22);
		contentPane.add(txtrHboMax);
		
		JTextArea txtrXboxGamepass = new JTextArea();
		txtrXboxGamepass.setText("Xbox Gamepass");
		txtrXboxGamepass.setBounds(25, 310, 232, 22);
		contentPane.add(txtrXboxGamepass);
		
		JTextArea txtrParamountPlus = new JTextArea();
		txtrParamountPlus.setText("Paramount Plus");
		txtrParamountPlus.setBounds(25, 342, 232, 22);
		contentPane.add(txtrParamountPlus);
		
		JTextArea txtrPlaystationPlus = new JTextArea();
		txtrPlaystationPlus.setText("PlayStation Plus");
		txtrPlaystationPlus.setBounds(25, 374, 232, 22);
		contentPane.add(txtrPlaystationPlus);
		
		JTextArea txtrCrunchyroll = new JTextArea();
		txtrCrunchyroll.setText("Crunchyroll");
		txtrCrunchyroll.setBounds(25, 406, 232, 22);
		contentPane.add(txtrCrunchyroll);
		
		JTextArea txtrEspnPlus = new JTextArea();
		txtrEspnPlus.setText("ESPN Plus");
		txtrEspnPlus.setBounds(25, 438, 232, 22);
		contentPane.add(txtrEspnPlus);
		
		JTextArea txtrAppleTv = new JTextArea();
		txtrAppleTv.setText("Apple TV");
		txtrAppleTv.setBounds(25, 470, 232, 22);
		contentPane.add(txtrAppleTv);
		
		JTextArea txtrActive = new JTextArea();
		txtrActive.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrActive.setText("Active");
		txtrActive.setBounds(263, 42, 143, 22);
		contentPane.add(txtrActive);
		
		JTextArea txtrNintendoOnline = new JTextArea();
		txtrNintendoOnline.setText("Nintendo Online");
		txtrNintendoOnline.setBounds(25, 500, 232, 22);
		contentPane.add(txtrNintendoOnline);
		
		JTextArea txtrPlanetFitness = new JTextArea();
		txtrPlanetFitness.setText("Planet Fitness");
		txtrPlanetFitness.setBounds(25, 532, 232, 22);
		contentPane.add(txtrPlanetFitness);
		
		//Amazon
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
					chckbxNewCheckBox.setBackground(Color.green);
				}
				else {
					chckbxNewCheckBox.setBackground(Color.lightGray);
				}
			}
		});
		chckbxNewCheckBox.setBounds(263, 86, 143, 21);
		contentPane.add(chckbxNewCheckBox);

		
		//Spotify
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(263, 118, 143, 21);
		contentPane.add(chckbxNewCheckBox_1);
		
		//Netlflix
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("");
		chckbxNewCheckBox_1_1.setBounds(263, 150, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1);
		
		//Apple Music
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("");
		chckbxNewCheckBox_1_1_1.setBounds(263, 182, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_1);
		
		//Hulu
		JCheckBox chckbxNewCheckBox_1_1_2 = new JCheckBox("");
		chckbxNewCheckBox_1_1_2.setBounds(263, 214, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_2);
		
		//DisneyPlus
		JCheckBox chckbxNewCheckBox_1_1_3 = new JCheckBox("");
		chckbxNewCheckBox_1_1_3.setBounds(263, 246, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_3);
		
		//HBO Max
		JCheckBox chckbxNewCheckBox_1_1_4 = new JCheckBox("");
		chckbxNewCheckBox_1_1_4.setBounds(263, 278, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_4);
		
		//Xbox Gamepass
		JCheckBox chckbxNewCheckBox_1_1_5 = new JCheckBox("");
		chckbxNewCheckBox_1_1_5.setBounds(263, 310, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_5);
		
		//Paramount Plus
		JCheckBox chckbxNewCheckBox_1_1_6 = new JCheckBox("");
		chckbxNewCheckBox_1_1_6.setBounds(263, 342, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_6);
		
		//Playstation Plus
		JCheckBox chckbxNewCheckBox_1_1_7 = new JCheckBox("");
		chckbxNewCheckBox_1_1_7.setBounds(263, 374, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_7);
		
		//Crunchyroll
		JCheckBox chckbxNewCheckBox_1_1_8 = new JCheckBox("");
		chckbxNewCheckBox_1_1_8.setBounds(263, 406, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_8);
		
		//Espn Plus
		JCheckBox chckbxNewCheckBox_1_1_9 = new JCheckBox("");
		chckbxNewCheckBox_1_1_9.setBounds(263, 438, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_9);
		
		//Apple TV
		JCheckBox chckbxNewCheckBox_1_1_10 = new JCheckBox("");
		chckbxNewCheckBox_1_1_10.setBounds(263, 470, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_10);
		
		//Nintendo
		JCheckBox chckbxNewCheckBox_1_1_11 = new JCheckBox("");
		chckbxNewCheckBox_1_1_11.setBounds(263, 498, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_11);
		
		//Planet Fitness
		JCheckBox chckbxNewCheckBox_1_1_12 = new JCheckBox("");
		chckbxNewCheckBox_1_1_12.setBounds(263, 533, 143, 21);
		contentPane.add(chckbxNewCheckBox_1_1_12);
		
		JTextArea txtrChoosePlan = new JTextArea();
		txtrChoosePlan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrChoosePlan.setText("Choose Plan");
		txtrChoosePlan.setBounds(416, 42, 143, 22);
		contentPane.add(txtrChoosePlan);
		
		
		
		JTextArea txtrBudget = new JTextArea();
		txtrBudget.setFont(new Font("Arial Black", Font.BOLD, 20));
		txtrBudget.setText("                    Budget");
		txtrBudget.setBounds(928, 42, 354, 35);
		contentPane.add(txtrBudget);
		
		//Amazon
		String[] amazonOptions = {"Default", "Standard Prime", "Student Prime"};
		JComboBox comboBox = new JComboBox(amazonOptions);
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedValue = comboBox.getSelectedItem().toString();
				String amazonPrice = "0";
				switch (selectedValue) {
				case "Standard Prime":
					amazonPrice = "14.99";
					break;
				case "Student Prime":
					amazonPrice = "7.49";
					break;
				default:
					amazonPrice = "0";
				}
				textField.setText(amazonPrice);
			}
		});
		comboBox.setBounds(412, 88, 147, 21);
		contentPane.add(comboBox);
		
		//Spotify
		String[] spotifyOptions = {"Default", "Standard Plan", "Student Plan"};
		JComboBox comboBox_1 = new JComboBox(spotifyOptions);
		comboBox_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedValue = comboBox_1.getSelectedItem().toString();
				String spotifyPrice = "0";
				switch (selectedValue) {
				case "Standard Plan":
					spotifyPrice = "4.99";
					break;
				case "Student Plan":
					spotifyPrice = "9.99";
					break;
				default:
					spotifyPrice = "0";
				}
				textField_1.setText(spotifyPrice);
				
			}
		});
		comboBox_1.setBounds(412, 118, 147, 21);
		contentPane.add(comboBox_1);
		
		//Netflix
		String[] netflixOptions = {"Default", "Basic Streaming", "Upgraded Streaming", "Deluxe Streaming"};
		JComboBox comboBox_2 = new JComboBox(netflixOptions);
		comboBox_2.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_2.setBounds(412, 150, 147, 21);
		contentPane.add(comboBox_2);
		
		//Apple Music
		String[] appleMusicOptions = {"Default", "Standard Plan", "Student Plan", "Family Plan"};
		JComboBox comboBox_3 = new JComboBox(appleMusicOptions);
		comboBox_3.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_3.setBounds(412, 182, 147, 21);
		contentPane.add(comboBox_3);
		
		//Hulu 
		String[] huluOptions = {"Default", "Standard Plan", "Standard: No Ads", "Live TV", "Live TV: No Ads"};
		JComboBox comboBox_4 = new JComboBox(huluOptions);
		comboBox_4.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_4.setBounds(412, 214, 147, 21);
		contentPane.add(comboBox_4);
		
		//DisneyPlus
		String[] disneyPlusOptions = {"Default", "Standard Plan", "Annual Plan (Yearly)"};
		JComboBox comboBox_5 = new JComboBox(disneyPlusOptions);
		comboBox_5.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_5.setBounds(412, 246, 147, 21);
		contentPane.add(comboBox_5);
		
		//HBO Max
		String[] hboMaxOptions = {"Default", "Standard Plan", "Upgraded Plan: No Ads"};
		JComboBox comboBox_6 = new JComboBox(hboMaxOptions);
		comboBox_6.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_6.setBounds(412, 278, 147, 21);
		contentPane.add(comboBox_6);
		
		//Xbox Gamepass
		String[] xboxGamepassOptions = {"Default", "Standard Gampass", "Gamepass Ultimate", "Xbox Live Gold"};
		JComboBox comboBox_7 = new JComboBox(xboxGamepassOptions);
		comboBox_7.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_7.setBounds(412, 310, 147, 21);
		contentPane.add(comboBox_7);
		
		//Paramount Plus
		String[] paramountPlusOptions = {"Default", "Standard", "Standard: No Ads", "Standard: Annual Plan (Yearly)", "No Ads: Annual Plan (Yearly)"};
		JComboBox comboBox_8 = new JComboBox(paramountPlusOptions);
		comboBox_8.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_8.setBounds(412, 342, 147, 21);
		contentPane.add(comboBox_8);
		
		//Playstation Plus
		String[] playstationPlusOptions = {"Default", "Plus: Monthly", "Plus: Quarterly", "Plus: Annual Plan (Yearly)",
				"Plus Extra: Monthly", "Plus Extra: Quarterly", "Plus Extra: Annual Plan (Yearly)",
				"Plus Premium: Monthly", "Plus Premium: Quarterly", "Plus Premium: Annual Plan (Yearly)"};
		JComboBox comboBox_9 = new JComboBox(playstationPlusOptions);
		comboBox_9.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_9.setBounds(412, 374, 147, 21);
		contentPane.add(comboBox_9);
		
		//Crunchyroll
		String[] crunchyrollOptions = {"Default", "Fan Plan", "Mega Fan Plan", "Ultimate Fan Plan"};
		JComboBox comboBox_10 = new JComboBox(crunchyrollOptions);
		comboBox_10.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_10.setBounds(412, 406, 147, 21);
		contentPane.add(comboBox_10);
		
		//ESPN Plus
		String[] espnPlusOptions = {"Default", "Standard Plan", "Standard: Annual Plan (Yearly)"};
		JComboBox comboBox_11 = new JComboBox(espnPlusOptions);
		comboBox_11.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_11.setBounds(412, 438, 147, 21);
		contentPane.add(comboBox_11);
		
		//Apple TV
		String[] appleTVOptions = {"Default", "Standard Plan", "Standard: Annual Plan (Yearly)"};
		JComboBox comboBox_12 = new JComboBox(appleTVOptions);
		comboBox_12.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_12.setBounds(412, 470, 147, 21);
		contentPane.add(comboBox_12);
		
		//Nintendo Online
		String[] nintendoOnlineOptions = {"Default", "Standarsd", "Standard: Three Months", "Standard: Annual Plan (Yearly)", 
				"Family Plan", "Expansion Plan", "Family: Expansion Plan"};
		JComboBox comboBox_13 = new JComboBox(nintendoOnlineOptions);
		comboBox_13.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_13.setBounds(412, 498, 147, 21);
		contentPane.add(comboBox_13);
		
		//Planet Fitness
		String[] planetFitnessOptions = {"Default", "Classic Plan", "Classic: Annual Plan (Yearly)", "Black Card: Monthly", "Black Card: Annual Plan"};
		JComboBox comboBox_14 = new JComboBox(planetFitnessOptions);
		comboBox_14.setFont(new Font("Arial Black", Font.BOLD, 14));
		comboBox_14.setBounds(412, 532, 147, 21);
		contentPane.add(comboBox_14);
		
		JTextArea txtrLastUsed = new JTextArea();
		txtrLastUsed.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrLastUsed.setText("\t             Last Used");
		txtrLastUsed.setBounds(928, 118, 354, 22);
		contentPane.add(txtrLastUsed);
		
		JTextArea txtrOtherSubscriptions = new JTextArea();
		txtrOtherSubscriptions.setText("Other Subscriptions");
		txtrOtherSubscriptions.setBounds(761, 42, 157, 22);
		contentPane.add(txtrOtherSubscriptions);
		
		JFormattedTextField frmtdtxtfldEnter = new JFormattedTextField();
		frmtdtxtfldEnter.setText("Enter");
		frmtdtxtfldEnter.setBounds(761, 86, 157, 19);
		contentPane.add(frmtdtxtfldEnter);
		
		JFormattedTextField frmtdtxtfldEnter_1 = new JFormattedTextField();
		frmtdtxtfldEnter_1.setText("Enter");
		frmtdtxtfldEnter_1.setBounds(761, 118, 157, 19);
		contentPane.add(frmtdtxtfldEnter_1);
		
		JFormattedTextField frmtdtxtfldEnter_2 = new JFormattedTextField();
		frmtdtxtfldEnter_2.setText("Enter");
		frmtdtxtfldEnter_2.setBounds(761, 150, 157, 19);
		contentPane.add(frmtdtxtfldEnter_2);
		
		JFormattedTextField frmtdtxtfldEnter_3 = new JFormattedTextField();
		frmtdtxtfldEnter_3.setText("Enter");
		frmtdtxtfldEnter_3.setBounds(761, 182, 157, 19);
		contentPane.add(frmtdtxtfldEnter_3);
		
		JFormattedTextField frmtdtxtfldEnter_4 = new JFormattedTextField();
		frmtdtxtfldEnter_4.setText("Enter");
		frmtdtxtfldEnter_4.setBounds(761, 214, 157, 19);
		contentPane.add(frmtdtxtfldEnter_4);
		
		JFormattedTextField frmtdtxtfldEnter_5 = new JFormattedTextField();
		frmtdtxtfldEnter_5.setText("Enter");
		frmtdtxtfldEnter_5.setBounds(761, 246, 157, 19);
		contentPane.add(frmtdtxtfldEnter_5);
		
		textField = new JTextField();
		textField.setBounds(569, 89, 130, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(569, 118, 130, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(569, 150, 130, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(569, 179, 130, 19);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(569, 214, 130, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(569, 246, 130, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(569, 278, 130, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(569, 310, 130, 19);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(569, 342, 130, 19);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(569, 374, 130, 19);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(569, 406, 130, 19);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(569, 438, 130, 19);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(569, 470, 130, 19);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(569, 498, 130, 19);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(569, 532, 130, 19);
		contentPane.add(textField_14);
		
		JTextArea txtrSelectedChoice = new JTextArea();
		txtrSelectedChoice.setFont(new Font("Times New Roman", Font.BOLD, 15));
		txtrSelectedChoice.setText("Selected Choice");
		txtrSelectedChoice.setBounds(569, 42, 130, 22);
		contentPane.add(txtrSelectedChoice);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(928, 148, 354, 19);
		contentPane.add(textField_15);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setForeground(Color.RED);
		formattedTextField.setBackground(Color.BLUE);
		formattedTextField.setBounds(928, 84, 352, 20);
		contentPane.add(formattedTextField);
	}
}
