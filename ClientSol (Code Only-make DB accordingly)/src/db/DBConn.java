package db;

import java.sql.*;

import javax.swing.*;

public class DBConn {
	public static Connection c;
	public static Statement st;
	public static ResultSet rs;
	public static PreparedStatement insertClient, getClient, updateClient;
	// public static
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientsol", "root", "8055");
			st = c.createStatement();
			insertClient = c.prepareStatement(
					"insert into clients_info (name, gender, dob, address, country, languages) values (?,?,?,?,?,?)");
			getClient = c.prepareStatement("Select * from clients_info where name like ?");
			updateClient = c.prepareStatement(
					"update clients_info set name=?, gender=?, dob=?, address=?, country=?, languages=? where cid=?");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Connection not establised !!");
		}
	}
}

/*
 * Why we use prepared statement here to insert details of client in
 * clients_info table? 
 * --> Every time a query is fired using 'Statement' class,
 * it firsts get compiled and then gets executes. But a query fired using
 * 'PreparedStatement' class gets compiled as the connection is established, and
 * takes values as the user enters the data. This prepared statement class is
 * used when we have to fire same query with different values or if the query is
 * very long <like register button>, very frequently. If we have to pass just a
 * single query (long or short)<like login button> we can go for statement
 * class.
 * 
 */

/*
 * we have declared all the variables at class level so that they can be
 * accessed by the local members of the class and declared as public and static,
 * so that they can be accessed outside the package and inside the static member
 * of (this) class.
 * 
 * Problem: we don't want our app to run same line of code again and again, if
 * asked to be done. Because running thousands of lines of code again and again
 * make the app. work slow.
 * 
 * Solution: We have kept all the code inside static block because of its
 * property. Code inside the static block will only execute once as the obj. of
 * that class is created, if we make more ofb.s of the same class, still it will
 * not execute but is in the memory as the class gets loaded in.
 * 
 * 
 */