package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.UIManager;
import java.awt.Button;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.awt.event.InputEvent;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField tfname;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	@SuppressWarnings("deprecation")
	public Register(String n) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				try {
					db.DBConn.c.close();
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(contentPane, "Connection to DB not closed !");
				}
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Register.class.getResource("/extraFiles/icon.png")));
		initComponents();
		setLocationRelativeTo(null);
		setTitle("ClientSol: Welcome "+n+" | Register");
		JDateChooser date = new JDateChooser();
		date.setSelectableDateRange(new java.util.Date("01/01/1950"), new java.util.Date());
		
	}
	public Register() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				try {
					db.DBConn.c.close();
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(contentPane, "Connection to DB not closed !");
				}
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(Register.class.getResource("/extraFiles/icon.png")));
		initComponents();
		JDateChooser date = new JDateChooser();
		date.setSelectableDateRange(new java.util.Date("01/01/1950"), new java.util.Date());
	}
	
	void initComponents() {
		setResizable(false);
		setTitle("ClientSol: Welcome | Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 519);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOperations = new JMenu("Operations");
		mnOperations.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnOperations);
		
		JMenuItem mntmClientList = new JMenuItem("Client List");
		mntmClientList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Opening View Clients window
				new ViewClients().setVisible(true);
			}
		});
		mntmClientList.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		mntmClientList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnOperations.add(mntmClientList);
		
		JMenu mnOther = new JMenu("Other");
		mnOperations.add(mnOther);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				try {
//					db.DBConn.c.close();
//				} catch (Exception e) {
//					JOptionPane.showMessageDialog(contentPane, "Connection to database is not closed !");
//				}
				new Login().setVisible(true);
				dispose();
			}
		});
		mntmLogout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnOther.add(mntmLogout);
		
		JMenu mnMore = new JMenu("More");
		mnMore.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnMore);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(contentPane, "Designed and developed by Ravi");
			}
		});
		mntmAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mnMore.add(mntmAbout);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					db.DBConn.c.close();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(contentPane, "Connection to database is not closed !");
				}
				System.exit(0);
			}
		});
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		mnMore.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel card1 = new JPanel();
		card1.setBackground(UIManager.getColor("Button.light"));
		contentPane.add(card1, "card1");
		card1.setLayout(null);
		
		JLabel lblClientRegistrationForm = new JLabel("Client Registration Form");
		lblClientRegistrationForm.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 25));
		lblClientRegistrationForm.setHorizontalAlignment(SwingConstants.CENTER);
		lblClientRegistrationForm.setBounds(10, 11, 567, 27);
		card1.add(lblClientRegistrationForm);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(10, 49, 567, 14);
		card1.add(separator);
		
		JLabel lblName = new JLabel("Name : ");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(147, 85, 60, 18);
		card1.add(lblName);
		
		JLabel lblDob = new JLabel("D.O.B. : ");
		lblDob.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDob.setBounds(146, 161, 59, 18);
		card1.add(lblDob);
		
		JLabel lblAddress = new JLabel("Address : ");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAddress.setBounds(146, 197, 68, 18);
		card1.add(lblAddress);
		
		JLabel lblCountry = new JLabel("Country : ");
		lblCountry.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCountry.setBounds(147, 261, 66, 18);
		card1.add(lblCountry);
		
		tfname = new JTextField();
		tfname.setBounds(250, 85, 211, 20);
		card1.add(tfname);
		tfname.setColumns(10);
		
		JComboBox country = new JComboBox();
		country.setModel(new DefaultComboBoxModel(new String[] {"(---Choose Country---)", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan",
				"Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burma", "Burundi", 
				"Cambodia", "Cameroon", "Canada", "Cabo Verde", "Central African Republic", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Costa Rica", "Cote d'Ivoire", "Croatia", "Cuba", "Curacao", "Cyprus", "Czechia", 
				"Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Eswatini", "Ethiopia", 
				"Fiji", "Finland", "France", "Gabon", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Holy See", "Honduras", "Hong Kong", "Hungary", "Iceland", 
				"India", "Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, North", "Korea, South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", 
				"Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", 
				"Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "North Korea", "Norway",
				"Oman", "Pakistan", "Palau", "Palestinian Territories", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", 
				"Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Sint Maarten", 
				"Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland ", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", 
				"Timor-Leste", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"}));
		country.setBounds(250, 261, 211, 20);
		card1.add(country);
		
		JDateChooser date = new JDateChooser();
		date.setSelectableDateRange(new java.util.Date("01/01/1950"), new java.util.Date());		
		date.setBounds(250, 161, 211, 20);
		card1.add(date);
		
		JLabel lblGender = new JLabel("Gender : ");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblGender.setBounds(147, 122, 67, 18);
		card1.add(lblGender);

		JRadioButton male = new JRadioButton("Male");
		male.setSelected(true);
		buttonGroup.add(male);
		male.setBackground(SystemColor.controlHighlight);
		male.setBounds(250, 121, 71, 23);
		card1.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		buttonGroup.add(female);
		female.setBackground(SystemColor.controlHighlight);
		female.setBounds(317, 121, 84, 23);
		card1.add(female);
		
		JRadioButton other = new JRadioButton("Other");
		buttonGroup.add(other);
		other.setBackground(SystemColor.controlHighlight);
		other.setBounds(401, 121, 61, 23);
		card1.add(other);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(250, 197, 211, 50);
		card1.add(scrollPane);
		
		JTextArea taadd = new JTextArea();
		taadd.setRows(5);
		taadd.setColumns(10);
		scrollPane.setViewportView(taadd);
		
		JLabel lblLanguages = new JLabel("Languages : ");
		lblLanguages.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLanguages.setBounds(147, 301, 84, 18);
		card1.add(lblLanguages);
		
		JCheckBox eng = new JCheckBox("English");
		eng.setSelected(true);
		eng.setBackground(SystemColor.controlHighlight);
		eng.setBounds(250, 300, 71, 23);
		card1.add(eng);
		
		JCheckBox hindi = new JCheckBox("Hindi");
		hindi.setBackground(SystemColor.controlHighlight);
		hindi.setBounds(318, 300, 72, 23);
		card1.add(hindi);
		
		JCheckBox french = new JCheckBox("French");
		french.setBackground(SystemColor.controlHighlight);
		french.setBounds(390, 300, 71, 23);
		card1.add(french);		

		JPanel card2 = new JPanel();
		card2.setBackground(new Color(102, 255, 102));
		contentPane.add(card2, "card2");
		card2.setLayout(null);
		
		
		JLabel n = new JLabel("-------------------------------------------");
		n.setBounds(271, 93, 172, 14);
		card2.add(n);
		
		JLabel g = new JLabel("-------------------------------------------");
		g.setBounds(271, 136, 172, 14);
		card2.add(g);
		
		JLabel d = new JLabel("-------------------------------------------");
		d.setBounds(271, 175, 172, 14);
		card2.add(d);
		
		JLabel a = new JLabel("-------------------------------------------");
		a.setBounds(271, 211, 172, 14);
		card2.add(a);
		
		JLabel c = new JLabel("-------------------------------------------");
		c.setBounds(271, 276, 172, 14);
		card2.add(c);

		JLabel l = new JLabel("-------------------------------------------");
		l.setBounds(271, 320, 172, 14);
		card2.add(l);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = tfname.getText().trim();		//trim is used to neglect extra spaces in data to be stored
				java.util.Date dob = date.getDate();		//java supports 2 date class:(1) java.util.Date (we can perform operations on date and calculate the past or future date from it.)
																					//	 (2) java.sql.Date (we can select a range and perform database operation on this date class)
				String address = taadd.getText().trim();	//trim is used to neglect extra spaces in data to be stored
				if(date != null && !name.equals("") && !address.equals("")) {
					try {
						//now get the values entered in gender, country, languages
						String gender = "";
						if(male.isSelected()) {
							gender = male.getText();
						} else if(female.isSelected()) {
							gender = female.getText();
						} else {
							gender = other.getText();
						}
						
						String desh = (String)country.getSelectedItem();
						if(!desh.equals("(---Choose Country---)")) {
							String cntry = (String)country.getSelectedItem();
						} else {
							JOptionPane.showMessageDialog(country, "Choose your country !");
						}
						String lang = "";
						if(eng.isSelected()) {
							lang += eng.getText() + "/";
						}
						if(hindi.isSelected()) {
							lang += hindi.getText() + "/";
						}
						if(french.isSelected()) {
							lang += french.getText() + "/";
						}
						
						//removing the last slash
						lang = lang.substring(0, lang.length()-1);
						
						db.DBConn.insertClient.setString(1, name);
						db.DBConn.insertClient.setString(2, gender);
			//converting date into string
						java.sql.Date date = new java.sql.Date(dob.getTime());
						db.DBConn.insertClient.setDate(3, date);
						
						db.DBConn.insertClient.setString(4, address);
						db.DBConn.insertClient.setString(5, desh);
						db.DBConn.insertClient.setString(6, lang);
						db.DBConn.insertClient.executeUpdate();
						
						n.setText(name);
						g.setText(gender);
						d.setText(dob.toString());
						a.setText(address);
						c.setText(desh);
						l.setText(lang);
						
//switching to second card, PTR: card is on card layout which is on content pane, so we must first get content pane > cardLayout > call show mtd. on card layout
						java.awt.Container ct = getContentPane();
						java.awt.CardLayout cdl = (java.awt.CardLayout)ct.getLayout();
						cdl.show(ct, "card2");
						
					} catch(Exception e) {
						JOptionPane.showMessageDialog(card1, e);
					}
				} else {
					JOptionPane.showMessageDialog(card1, "Complete the Form !");
				}
			}
		});
		btnRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegister.setBackground(Color.LIGHT_GRAY);
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnRegister.setBounds(147, 374, 203, 38);
		card1.add(btnRegister);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfname.setText(null);
				date.setDate(null);
				taadd.setText(null);
				country.setSelectedItem("(---Choose Country---)");
				male.setSelected(true);
				eng.setSelected(true);
				hindi.setSelected(false);
				french.setSelected(false);
				
			}
		});
		btnReset.setBorder(UIManager.getBorder("Button.border"));
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReset.setForeground(Color.RED);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBackground(Color.LIGHT_GRAY);
		btnReset.setBounds(361, 374, 100, 38);
		card1.add(btnReset);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Register.class.getResource("/extraFiles/register-success.jpg")));
		label.setBounds(0, 219, 171, 257);
		card1.add(label);
		
		JLabel label_13 = new JLabel("");
		label_13.setBackground(SystemColor.controlHighlight);
		label_13.setIcon(new ImageIcon(Register.class.getResource("/extraFiles/register-success-bg.jpg")));
		label_13.setBounds(0, 0, 587, 459);
		card1.add(label_13);
		
		JLabel lblSuccess = new JLabel("Success !");
		lblSuccess.setHorizontalAlignment(SwingConstants.CENTER);
		lblSuccess.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 25));
		lblSuccess.setBounds(10, 11, 567, 36);
		card2.add(lblSuccess);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 47, 567, 14);
		card2.add(separator_1);
		
		JLabel label_1 = new JLabel("Name : ");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(135, 90, 60, 18);
		card2.add(label_1);
		
		JLabel label_3 = new JLabel("Gender : ");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_3.setBounds(135, 133, 67, 18);
		card2.add(label_3);
		
		JLabel label_4 = new JLabel("D.O.B. : ");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_4.setBounds(134, 172, 59, 18);
		card2.add(label_4);
		
		JLabel label_5 = new JLabel("Address : ");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_5.setBounds(134, 208, 68, 18);
		card2.add(label_5);
		
		JLabel label_6 = new JLabel("Country : ");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_6.setBounds(135, 272, 66, 18);
		card2.add(label_6);
		
		Button button = new Button("< Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				java.awt.Container ct = getContentPane();
				java.awt.CardLayout cdl = (java.awt.CardLayout)ct.getLayout();
				cdl.show(ct, "card1");
			}
		});
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setBackground(new Color(255, 69, 0));
		button.setBounds(229, 383, 129, 30);
		card2.add(button);
		
		JLabel lblLanguages_1 = new JLabel("Languages : ");
		lblLanguages_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLanguages_1.setBounds(135, 317, 84, 18);
		card2.add(lblLanguages_1);
	}
}
