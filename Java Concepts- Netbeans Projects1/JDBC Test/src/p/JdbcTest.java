package p;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JdbcTest {
    public static void main(String[] args) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");   //JDBC driver class path for MySQL Database
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "8055");  //Getting connection to DB
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ClientSol", "ClientSol");
            Statement s = c.createStatement();
            //test1.login table have 2 fields: uid and pass ;and both are varchar.
            //s.executeUpdate("insert into login values ('admin', 'adminpass')");
            
            s.executeUpdate("insert into test1 values ('admin', 'adminpass')");
            System.out.println("SUCCESS!!");
            c.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
}
