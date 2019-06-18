package com.cognizant.freelancer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.freelancer.controller.Skill_Details;
import com.cognizant.freelancer.util.DbConnector;

public class Skill_Details_DAO {
public int addUserSkill(Skill_Details custregister) throws SQLException, ParseException, ClassNotFoundException {
		
		
		
        /*Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1");*/  
		
		Connection con=DbConnector.getConnection();
      
      
      //int id=10001;
      PreparedStatement st = con.prepareStatement("INSERT INTO skill_details1 VALUES(?,?,?,skill_seq.nextval)");
      st.setString(1, custregister.getEmailid());

      st.setString(2, custregister.getSkillName());
      
      st.setString(3, custregister.getProjectid());
      int no=st.executeUpdate();
      return no;

}

public List<Skill_Details> viewProject(int t) {
	List<Skill_Details> slist=null;
	try
	{
	Connection connection=DbConnector.getConnection();
	String sql ="select emailid,skill_name,projectid from skill_details1 where projectid=?";
	
	PreparedStatement statement=connection.prepareStatement(sql);
	statement.setInt(1,t);
 slist=new ArrayList<>();
	
	ResultSet resultSet = statement.executeQuery();

	while(resultSet.next()){
	System.out.println("in while");
	Skill_Details sd=new Skill_Details(resultSet.getString(1), resultSet.getString(2),resultSet.getString(3))	;
	slist.add(sd);
	
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println(slist);
	return slist;
}

/*public List<Skill_Details> viewProposedProject(Skill_Details cr) throws ClassNotFoundException, SQLException
{
	Connection con=DbConnector.getConnection();
	
    List<Skill_Details> list=new ArrayList();
    HttpSession ses=request.getSession();
    Integer t=(Integer)ses.getAttribute("t");
    System.out.println(t);
    PreparedStatement st = con.prepareStatement("select emailid,skill_name,projectid from skill_details1 where projectid=?");
    st.setString(1, cr.getProjectid());
    ResultSet rs = st.executeQuery();
    
    Skill_Details s;
    
    while(rs.next())
    {
    	s=new Skill_Details(rs.getString(1),rs.getString(2),rs.getString(3));
    	list.add(s);
    }
	return list;
     
}*/
}
