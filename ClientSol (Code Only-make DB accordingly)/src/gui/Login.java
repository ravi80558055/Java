package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import db.DBConn;
import javafx.stage.Window;
import java.awt.Toolkit;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField uid;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/extraFiles/icon.png")));
		setLocationRelativeTo(null);
		
		setBackground(Color.LIGHT_GRAY);
		setTitle("ClientSol | Login");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 288);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.WHITE);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 25));
		lblLogin.setBounds(272, 11, 272, 42);
		contentPane.add(lblLogin);
		
		JLabel lblUserId = new JLabel("User ID : ");
		lblUserId.setForeground(Color.WHITE);
		lblUserId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUserId.setBounds(272, 88, 71, 14);
		contentPane.add(lblUserId);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(272, 142, 86, 14);
		contentPane.add(lblPassword);
		
		uid = new JTextField();
		uid.setBounds(368, 87, 176, 20);
		contentPane.add(uid);
		uid.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(368, 141, 176, 20);
		contentPane.add(pass);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = uid.getText();
				String s2 = String.valueOf(pass.getPassword());	
				//getPassword() returns a character array, so we are converting it in String(kepping data to be less confidential)
				//String's memory is alloted in pool which has no garbage collector, hence the memory can not be removed, once allocated.
				//whereas char-array's memory is alloted in heap which have GC, hence the memory can be removed once we are done with it.
				//to allow more secure, use char array and we have to read every char element from that, or if less secure is allow, then cast char-array in String.
				
				try {
					//to relate this project to a larger scale project, we are not writing all the connection code at a single place so that every time we want to 
					//perform some operation on database we need to load,connect,use ,and then tear down the connection. Instead, we have wrote the steps of accessing
					//the database in a class and make it's object in order to use them as many times as we want to use.(also we have put that code in static block.<why??--see that code>)
					
					//db.DBConn d = new db.DBConn();
//					Class.forName("com.mysql.jdbc.Driver");
//					Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientsol", "root", "8055");
//					Statement st = c.createStatement();
					db.DBConn.rs = db.DBConn.st.executeQuery("SELECT * FROM admin WHERE aid = '"+s1+"' AND pass = '"+s2+"';");
					
					if(DBConn.rs.next()) {	//if rs returns something, next() will point to it, i.e. evaluates to true hence if-block will execute
						String n = db.DBConn.rs.getString("name");
						new Register(n).setVisible(true);
						dispose();
						
					} else {
						JOptionPane.showMessageDialog(contentPane, "Invalid Login ID or Password !");
					}
					
					//make sure you don't tear down the connection over here. You have to cut it off from every part of code which stops the application.
					//for eg.- at window closing event of every window of the s/w, etc...
					
					//d.c.close();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(contentPane, e);
				}
				
			}
		});
		btnLogin.setBounds(272, 194, 272, 32);
		contentPane.add(btnLogin);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(51, 153, 204));
		label.setIcon(new ImageIcon(Login.class.getResource("/extraFiles/login.jpg")));
		label.setBounds(0, 0, 241, 284);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setOpaque(true);
		separator.setForeground(Color.DARK_GRAY);
		separator.setBounds(272, 71, 272, -18);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(new Rectangle(0, 0, 1, 0));
		separator_1.setForeground(new Color(128, 128, 128));
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setPreferredSize(new Dimension(5, 3));
		separator_1.setBounds(251, 11, 2, 237);
		contentPane.add(separator_1);
	}
}
