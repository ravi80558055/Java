package p;

import java.sql.*;

public class TransactionExample {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/clientsol", "root", "8055");
            Statement st = c.createStatement();
            
            //By def. connection is set to auto-commit, means as the query is executed it also updates the data in database permanently.
            //so to understand how transactions take place first set auto commit to false on connection.
            c.setAutoCommit(false);
            //As auto-commit is set to false, user can see the change in data, but that change is temp., means database will not get updated.
            
            st.executeUpdate("update clients_info set name = 'polylol' where cid = 5");
            ResultSet rs = st.executeQuery("select * from clients_info where cid = 5");
            
        //    c.commit();   
            //by calling commit function on connection, it updates the database permanently, means temporary change becomed permanent.
            
            if(rs.next()){
                System.out.println("Name : "+rs.getString("name")+ "\t DOB: "+rs.getString("dob"));
            }
            
//            c.rollback();
//            ResultSet rs2 = st.executeQuery("select * from clients_info where country = 'India'");
//            if(rs2.next()){
//                System.out.println("Name : "+rs.getString("name")+ "\t DOB: "+rs.getString("dob"));
//            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
