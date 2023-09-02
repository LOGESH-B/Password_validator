package PwValidator;

import java.io.*;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.ImageIcon;
import java.awt.Color;

public class PasswordValidator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	// Main Method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordValidator frame = new PasswordValidator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Atleast 12 char
	private boolean isPasswordLengthValid(String password) {
		return password.length() >= 12;
	}

	//contains Uppercase
	private boolean containsUppercaseLetter(String password) {
		return password.matches(".*[A-Z].*");
	}

	//starts with char
	private boolean startwithchar(String password) {
		return password.matches("^[a-zA-Z].*");
	}

	//contains num
	private boolean containsNumber(String password) {
		return password.matches(".*\\d.*");
	}

	//contains special char
	private boolean containsSpecialCharacter(String password) {
		return password.matches(".*[@#$%^&+=].*");
	}

	/**
	 * Create the frame.
	 */
	//constructor
	public PasswordValidator() {
		setTitle("Pasword Validator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 613);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JPanel panel = new JPanel();
		contentPane.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 38, 18, 163, 0, 160, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 56, 33, 0, 26, 29, 28, 24, 30, 39, 72, 130, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);
		
		//label note
		JLabel lblNewLabel_2 = new JLabel("Note:To check the Breached Password type(Logeshb.20it@kongu.edu)");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		//label 1
		JLabel Check1 = new JLabel("At Least 12");
		Check1.setForeground(new Color(255, 0, 0));
		Check1.setHorizontalAlignment(SwingConstants.LEFT);
		Check1.setText("At Least 12 Alphanumeric");
		GridBagConstraints gbc_Check1 = new GridBagConstraints();
		gbc_Check1.anchor = GridBagConstraints.WEST;
		gbc_Check1.insets = new Insets(0, 0, 5, 5);
		gbc_Check1.gridx = 3;
		gbc_Check1.gridy = 3;
		panel.add(Check1, gbc_Check1);

		//label 2
		JLabel Check2 = new JLabel("Start with char");
		Check2.setForeground(new Color(255, 0, 0));
		Check2.setForeground(new Color(255, 0, 0));
		Check2.setHorizontalAlignment(SwingConstants.LEFT);
		Check2.setText("Should Start with Character");
		GridBagConstraints gbc_Check2 = new GridBagConstraints();
		gbc_Check2.anchor = GridBagConstraints.WEST;
		gbc_Check2.insets = new Insets(0, 0, 5, 5);
		gbc_Check2.gridx = 3;
		gbc_Check2.gridy = 4;
		panel.add(Check2, gbc_Check2);

		
		//label 3
		JLabel Check3 = new JLabel("Special char");
		Check3.setForeground(new Color(255, 0, 0));
		Check3.setHorizontalAlignment(SwingConstants.LEFT);
		Check3.setText("At Least One Special Character");
		GridBagConstraints gbc_Check3 = new GridBagConstraints();
		gbc_Check3.anchor = GridBagConstraints.WEST;
		gbc_Check3.insets = new Insets(0, 0, 5, 5);
		gbc_Check3.gridx = 3;
		gbc_Check3.gridy = 5;
		panel.add(Check3, gbc_Check3);

		
		//abel 4
		JLabel Check4 = new JLabel("Capital letter");
		Check4.setForeground(new Color(255, 0, 0));
		Check4.setHorizontalAlignment(SwingConstants.LEFT);
		Check4.setText("At Least One Capital Letter");
		GridBagConstraints gbc_Check4 = new GridBagConstraints();
		gbc_Check4.anchor = GridBagConstraints.WEST;
		gbc_Check4.insets = new Insets(0, 0, 5, 5);
		gbc_Check4.gridx = 3;
		gbc_Check4.gridy = 6;
		panel.add(Check4, gbc_Check4);

		
		//label 5
		JLabel Check5 = new JLabel("One Number");
		Check5.setForeground(new Color(255, 0, 0));
		Check5.setHorizontalAlignment(SwingConstants.LEFT);
		Check5.setText("At Least One Number");
		GridBagConstraints gbc_Check5 = new GridBagConstraints();
		gbc_Check5.anchor = GridBagConstraints.WEST;
		gbc_Check5.insets = new Insets(0, 0, 5, 5);
		gbc_Check5.gridx = 3;
		gbc_Check5.gridy = 7;
		panel.add(Check5, gbc_Check5);
		
		// label img
		JLabel lblNewLabel_1 = new JLabel("Check Your Password Strength");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 9;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		// label message
		JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 10;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		// textfield
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(15);

		
		// button
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setEnabled(false);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 1;
		panel.add(btnNewButton, gbc_btnNewButton);

		// Listen for changes in the text
		textField.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent e) {
				handleChange();
			}

			public void removeUpdate(DocumentEvent e) {
				handleChange();
			}

			public void insertUpdate(DocumentEvent e) {
				handleChange();
			}
			
			//Handling Onchange event
			public void handleChange() {

				try {

					String password = textField.getText();
					int c = 0;

					if (!isPasswordLengthValid(password)) {
						Check1.setForeground(new Color(255, 0, 0));
					} else {
						Check1.setForeground(new Color(0, 255, 0));
						c++;
					}

					if (!startwithchar(password)) {
						Check2.setForeground(new Color(255, 0, 0));
					} else {
						Check2.setForeground(new Color(0, 255, 0));
						c++;
					}

					if (!containsSpecialCharacter(password)) {
						Check3.setForeground(new Color(255, 0, 0));
					} else {
						Check3.setForeground(new Color(0, 255, 0));
						c++;
					}

					if (!containsUppercaseLetter(password)) {
						Check4.setForeground(new Color(255, 0, 0));
					} else {
						Check4.setForeground(new Color(0, 255, 0));
						c++;
					}

					if (!containsNumber(password)) {
						Check5.setForeground(new Color(255, 0, 0));
					} else {
						Check5.setForeground(new Color(0, 255, 0));
						c++;
					}
					
					//for enable/disable button
//					for now it is enabled for the checking for breached password
					if (c == 5) {
						btnNewButton.setEnabled(true);
					} else {
			        	btnNewButton.setEnabled(false);
//						btnNewButton.setEnabled(true);
					}


				} catch (Exception e) {
					System.out.println(e.getMessage());
					lblNewLabel.setText(e.getMessage());
				}

			}
		});

		
	

		//handle Onsubmit event
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader fr = new FileReader(System.getProperty("user.dir")+"\\PasswordValidator\\src\\PwValidator\\1L.txt");
					BufferedReader br = new BufferedReader(fr);
					int len = -1, flag = 1;
					String s = textField.getText();
					while (len <= 50000) {
						if (s.equals(br.readLine())) {
							System.out.println("Password Match Found");
							flag = 0;
							break;
						}
						len++;
					}
					if (flag != 1) {
						lblNewLabel_1
								.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + "\\PasswordValidator\\assets\\cancel.png")
										.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
//						lblNewLabel_1.setText("<html><img src="+System.getProperty("user.dir") +"\\assets\\cancel.png" +" height=300 width=300//></html>");
						lblNewLabel.setText("<html><p>Password already breached!<br>Please use Strong password</p></html>");
						lblNewLabel_1.setText("");
					} else {
						lblNewLabel_1
								.setIcon(new ImageIcon(new ImageIcon(System.getProperty("user.dir") + "\\PasswordValidator\\assets\\tick.png")
										.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
						lblNewLabel.setText("Password is Strong");
						lblNewLabel_1.setText("");
					}
				} catch (Exception err) {
					System.out.println(err.getMessage());
				}
			}

		});

	}
}