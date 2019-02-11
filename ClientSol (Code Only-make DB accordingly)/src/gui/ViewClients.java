package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import com.toedter.calendar.JDayChooser;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.StringTokenizer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ViewClients extends JFrame {

	private JPanel contentPane;
	private JTextField details;
	private JTable table;
	private JTextField n;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewClients frame = new ViewClients();
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
	@SuppressWarnings("serial")
	public ViewClients() {
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage(ViewClients.class.getResource("/extraFiles/icon.png")));
		setResizable(false);
		setTitle("ClientSol | View Clients");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 610, 624);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblEnterName = new JLabel("Enter Name :");
		lblEnterName.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterName.setBounds(10, 11, 83, 16);
		contentPane.add(lblEnterName);

		details = new JTextField();
		details.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				DefaultTableModel dtm = (DefaultTableModel) table.getModel();
				try {
					int rows = dtm.getRowCount();
					while (rows-- != 0) {
						dtm.removeRow(0);
					}
					String n = details.getText();

					db.DBConn.getClient.setString(1, "%" + n + "%");	//we only have 1 '?' in prepared statement that's why '1' here.
					ResultSet rs = db.DBConn.getClient.executeQuery();
					while(rs.next()) {
						@SuppressWarnings("rawtypes")
						java.util.Vector<Comparable> v = new java.util.Vector<Comparable>();
						v.add(rs.getInt(1));
						v.add(rs.getString(2));
						v.add(rs.getString(3));
						v.add(rs.getDate(4));
						v.add(rs.getString(5));
						v.add(rs.getString(6));
						v.add(rs.getString(7));
						
						dtm.addRow(v);
					}
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(contentPane, "Unable to set Data !");
				}
			}
		});
		details.setBounds(103, 10, 481, 20);
		contentPane.add(details);
		details.setColumns(10);

		JLabel cidlabel = new JLabel("..........................................................................");
		cidlabel.setBounds(146, 261, 228, 14);
		contentPane.add(cidlabel);

		n = new JTextField();
		n.setBounds(146, 303, 228, 20);
		contentPane.add(n);
		n.setColumns(10);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(146, 413, 228, 55);
		contentPane.add(scrollPane_1);

		JTextArea a = new JTextArea();
		scrollPane_1.setViewportView(a);

		JDateChooser date = new JDateChooser();
		date.setBounds(146, 373, 228, 20);
		contentPane.add(date);

		JRadioButton M = new JRadioButton("Male");
		buttonGroup.add(M);
		M.setBounds(146, 339, 80, 23);
		contentPane.add(M);

		JRadioButton F = new JRadioButton("Female");
		buttonGroup.add(F);
		F.setBounds(230, 339, 83, 23);
		contentPane.add(F);

		JRadioButton O = new JRadioButton("Other");
		buttonGroup.add(O);
		O.setBounds(315, 339, 59, 23);
		contentPane.add(O);

		JComboBox cntry = new JComboBox();
		cntry.setModel(new DefaultComboBoxModel(new String[] {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan",
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
		
		cntry.setBounds(146, 484, 228, 20);
		contentPane.add(cntry);

		JCheckBox eng = new JCheckBox("English");
		eng.setBounds(146, 519, 80, 23);
		contentPane.add(eng);

		JCheckBox hindi = new JCheckBox("Hindi");
		hindi.setBounds(230, 519, 59, 23);
		contentPane.add(hindi);

		JCheckBox french = new JCheckBox("French");
		french.setBounds(306, 519, 68, 23);
		contentPane.add(french);


		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 38, 574, 187);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				tableMouseClicked(evt);
			}

			private void tableMouseClicked(MouseEvent evt) {
				int row = table.getSelectedRow();
				if(row != -1) {
					int id = (Integer)table.getValueAt(row, 0);
					String name = (String)table.getValueAt(row, 1);
					String gender = (String)table.getValueAt(row, 2);
					java.util.Date dob = (java.util.Date)table.getValueAt(row, 3);
					String address = (String)table.getValueAt(row, 4);
					String country = (String)table.getValueAt(row, 5);
					String languages = (String)table.getValueAt(row, 6);
					
					cidlabel.setText(id+"");	//empty string is concatenated to make int id to string
					
					n.setText(name);
					
					if(gender.equals("Male")) {
						M.setSelected(true);
					} else if(gender.equals("Female")) {
						F.setSelected(true);
					} else {
						O.setSelected(true);
					}
					
					date.setDate(dob);
					
					cntry.setSelectedItem(country);
					
					a.setText(address);
					
					//making initially all the languages uncheck and then selected lang. will be selected.
					eng.setSelected(false);
					hindi.setSelected(false);
					french.setSelected(false);
					StringTokenizer st = new StringTokenizer(languages,"/");
					while(st.hasMoreTokens()) {
						String s = st.nextToken();
						if(s.equals("English")) {
							eng.setSelected(true);
						} else if(s.equals("Hindi")) {
							hindi.setSelected(true);
						} else {
							french.setSelected(true);
						}
					}
				}
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {

		}, new String[] { "CID", "Name", "Gender", "DOB", "Address", "Country", "Languages" }) {
			boolean[] columnEditables = new boolean[] { false, false, false, false, false, false, false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});

		JLabel lblCid = new JLabel("CID : ");
		lblCid.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCid.setBounds(24, 260, 34, 15);
		contentPane.add(lblCid);

		JLabel lblName = new JLabel("Name  :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(24, 305, 45, 15);
		contentPane.add(lblName);

		JLabel lblGender = new JLabel("Gender :");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGender.setBounds(24, 342, 51, 15);
		contentPane.add(lblGender);

		JLabel lblDob = new JLabel("DOB :");
		lblDob.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDob.setBounds(24, 378, 34, 15);
		contentPane.add(lblDob);

		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(24, 417, 57, 15);
		contentPane.add(lblAddress);

		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCountry.setBounds(24, 486, 58, 15);
		contentPane.add(lblCountry);

		JLabel lblLanguages = new JLabel("Languages :");
		lblLanguages.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLanguages.setBounds(24, 522, 74, 15);
		contentPane.add(lblLanguages);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = n.getText();
				java.util.Date dt = date.getDate();
				String address = a.getText();
				
				if(dt != null && !name.equals(null) && !address.equals(null)) {
					//getting rest of the data
					String gender = "";
					if(M.isSelected()) {
						gender = M.getText();
					} else if(F.isSelected()) {
						gender = F.getText();
					} else {
						gender = O.getText();
					}
					
					String desh = (String)cntry.getSelectedItem();
					
					String languages = "";
					if(eng.isSelected()) {
						languages += eng.getText() + "/";
					}
					if(hindi.isSelected()) {
						languages += hindi.getText() + "/";
					}
					if(french.isSelected()) {
						languages += french.getText() + "/";
					}
				//	languages = languages.substring(0,(languages.length()-1));
					
					//database code for prepared statement
					try {
						int id = Integer.parseInt(cidlabel.getText());
						
						//update in DB
						db.DBConn.updateClient.setString(1, name);
						db.DBConn.updateClient.setString(2, gender);
							//converting java.util.Date to java.sql.Date
							java.sql.Date dob = new java.sql.Date(dt.getTime());
						db.DBConn.updateClient.setDate(3, dob);
						db.DBConn.updateClient.setString(4, address);
						db.DBConn.updateClient.setString(5, desh);
						db.DBConn.updateClient.setString(6, languages);
						db.DBConn.updateClient.setInt(7, id);
						db.DBConn.updateClient.executeUpdate();
						
						//successful updation
						JOptionPane.showMessageDialog(contentPane, "Updation Successful !");
						
						//getting table Model
						DefaultTableModel dtm = (DefaultTableModel)table.getModel();
						
						try {
							int rows = dtm.getRowCount();
							while(rows-- != 0) {
								dtm.removeRow(0);
							}
							String n = details.getText();
							db.DBConn.getClient.setString(1, "%"+n+"%");
							ResultSet rs = db.DBConn.getClient.executeQuery();
							while(rs.next()) {
								java.util.Vector<Comparable> v = new java.util.Vector<Comparable>();
								v.add(rs.getInt(1));
								v.add(rs.getString(2));
		                        v.add(rs.getString(3));
		                        v.add(rs.getDate(4));
		                        v.add(rs.getString(5));
		                        v.add(rs.getString(6));
		                        v.add(rs.getString(7));
		                        
		                        dtm.addRow(v);
							}
						} catch(Exception e) {
							JOptionPane.showMessageDialog(contentPane, e);
						}
					} catch(Exception e) {
						JOptionPane.showMessageDialog(contentPane, "Please fill all details !");
					}
				}
			}
		});
		btnUpdate.setForeground(Color.DARK_GRAY);
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(422, 284, 150, 36);
		contentPane.add(btnUpdate);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int del = JOptionPane.showConfirmDialog(contentPane, "Do you really want to Delete?", "Delete",
						JOptionPane.YES_NO_OPTION);

				if (del == JOptionPane.YES_OPTION) {
					try {
						int id = Integer.parseInt(cidlabel.getText());
						// delete query
						db.DBConn.st.executeUpdate("delete from clients_info where cid = " + id);
						JOptionPane.showMessageDialog(contentPane, "Deletion Success!");
						DefaultTableModel dtm = (DefaultTableModel)table.getModel();
						try {
							int rows = dtm.getRowCount();
							while(rows-- != 0) {
								dtm.removeRow(0);
							}
							String det = details.getText();
							db.DBConn.getClient.setString(1, "%"+det+"%");
							ResultSet rs = db.DBConn.getClient.executeQuery();
							while(rs.next()) {
								java.util.Vector<Comparable> v = new java.util.Vector<Comparable>();
								v.add(rs.getInt(1));
								v.add(rs.getString(2));
		                        v.add(rs.getString(3));
		                        v.add(rs.getDate(4));
		                        v.add(rs.getString(5));
		                        v.add(rs.getString(6));
		                        v.add(rs.getString(7));
		                        
		                        dtm.addRow(v);
							}
						} catch(Exception e) {
							JOptionPane.showMessageDialog(contentPane, e);
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(contentPane, e);
					}
				}

			}
		});
		btnDelete.setForeground(Color.DARK_GRAY);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setBounds(422, 357, 150, 36);
		contentPane.add(btnDelete);
	}
}
