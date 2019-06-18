package com.cognizant.freelancer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.cognizant.freelancer.controller.FinalisedInfo;
import com.cognizant.freelancer.util.DbConnector;

public class FinalisedInfo_DAO {
public int addFinalInfo(List<FinalisedInfo> custregister)  {
		
		
		
       /* Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1");*/  
	  int no=0;	
		try{
			Connection con=DbConnector.getConnection();
		
    
      
      //int id=10001;
		 PreparedStatement st = con.prepareStatement("INSERT INTO Proposed_project1 VALUES(?,?,?,?)");
		 for(FinalisedInfo obj:custregister)
			{
	     
	      st.setString(1, obj.getStatus());

	      st.setString(2, obj.getSkill_name());
	      
	      st.setString(3, obj.getProjectid());
	      
	      st.setString(4, obj.getStatus());
	      
	      
	        no=st.executeUpdate();
			}
		 }

	    catch(Exception e)
		{
	    	e.printStackTrace();
		}
	      return no;


}

}
