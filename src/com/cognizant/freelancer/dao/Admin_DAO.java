package com.cognizant.freelancer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import com.cognizant.freelancer.controller.Admin;
import com.cognizant.freelancer.util.DbConnector;


public class Admin_DAO {
                public  int addAdmin(Admin adminreg) throws SQLException, ParseException, ClassNotFoundException {
                                
                                
//                            
//        Class.forName("oracle.jdbc.driver.OracleDriver");  
//                            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Pc377935:1521:xe","freelancer2","password-1");  
                                  
                                Connection con= DbConnector.getConnection();
                                                
      

      PreparedStatement st = con.prepareStatement("INSERT INTO admin_details VALUES(?,?,?,?,?,admin_id_seq.nextval)");
      
      st.setString(1, adminreg.getFirstname());
      st.setString(2, adminreg.getLastname());
      st.setString(3, adminreg.getContactnumber());
      st.setString(4, adminreg.getEmail());
      st.setString(5, adminreg.getPassword());
     
      
      int no=st.executeUpdate();
     
      return no;
    }
                public  Admin findUserByIdPwd(String email, String password) throws SQLException {
                                Connection con = null;
                                try {
                                                
                                                con = DbConnector.getConnection();
                                } catch (ClassNotFoundException e) {
                                                // TODO Auto-generated catch block
                                                e.printStackTrace();
                                }
        PreparedStatement st = con.prepareStatement("SELECT * FROM admin_details WHERE email=? AND password=?");
        st.setString(1, email);
        st.setString(2, password);
      // User_registration i=null;
        ResultSet rs = st.executeQuery();
        Admin i = null;
                                if(rs.next())
           i= new Admin(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
       
      return i; 
                }

//                private static Connection getConnection() throws ClassNotFoundException, SQLException {
//                Connection con=DbConnector.getConnection();
//                                return con;
//                }

}
