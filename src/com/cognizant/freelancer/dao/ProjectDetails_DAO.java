package com.cognizant.freelancer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.freelancer.controller.ProjectDetails;
import com.cognizant.freelancer.controller.ProposedProject;
import com.cognizant.freelancer.util.DbConnector;

public class ProjectDetails_DAO {
	public int addProject(ProjectDetails custregister) throws SQLException, ParseException, ClassNotFoundException {
		
		
		
        /*Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1");  */
		
		Connection con=DbConnector.getConnection();

      
      
      //int id=10001;
      PreparedStatement st = con.prepareStatement("INSERT INTO project_details VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,pro_seq.nextval,1000)");
     
      st.setString(1, custregister.getProjecttitle());
      st.setString(2, custregister.getProjectduration());
      st.setString(3, custregister.getSkillset1());
      st.setString(4, custregister.getSkillset2());
      st.setString(5, custregister.getSkillset3());
      st.setString(6, custregister.getSkillset4());
      st.setString(7, custregister.getSkillset5());
      st.setString(8, custregister.getSkillset6());
      st.setString(9, custregister.getSkillset7());
      st.setString(10, custregister.getSkillset8());
      st.setString(11, custregister.getSkillset9());
      st.setString(12, custregister.getSkillset10());
      st.setString(13, custregister.getRemarks());
      
      int no=st.executeUpdate();
      return no;
    }

	public List<ProjectDetails> viewProject(ProjectDetails cr) throws SQLException, ClassNotFoundException {
		 /*Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Pc254053:1521:xe","freelancer","password-1"); */ 
			
		Connection con=DbConnector.getConnection();
		
         List<ProjectDetails> list=new ArrayList();
	      
			
	      //int id=10001;
		//System.out.println("before");
	      PreparedStatement st = con.prepareStatement("SELECT * FROM project_details");
	      //st.setString(1, cr.getProjecttitle());  
          //st.setInt(2, cr1.getMinimumexperience());  
          //st.setString(3, cr1.getEmployeeid());  
          //ProjectDetails  c=null;
          ResultSet rs = st.executeQuery();
         ProjectDetails c;
		while(rs.next())
         {
        	  //System.out.println(rs.getString(1));
        	 c= new ProjectDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getInt(14),rs.getInt(15));
        	  
        	  list.add(c);
         }
          
          
       
          return list;
        }

	public List<ProposedProject> viewApprovedProjects(String mail) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Connection con=DbConnector.getConnection();
		System.out.println(mail);
        List<ProposedProject> list=new ArrayList();
        PreparedStatement st = con.prepareStatement("select Proposed_project1.emailid,Proposed_project1.projectid,project_details.projecttitle from Proposed_project1 "
        		+ "join project_details on project_details.projectid=Proposed_project1.projectid "
        		+ "		where Proposed_project1.emailid=?");
        st.setString(1, mail);
        
        ResultSet rs = st.executeQuery();
        ProposedProject cc;
        
        while(rs.next())
        {
        	//System.out.println(rs.getString(3));
       	 cc= new ProposedProject(rs.getString(1),rs.getInt(2),rs.getString(3));
        	list.add(cc);
        	
        }
        //System.out.println(list);
		return list;
	}

	
	public ProjectDetails userviewproject(int id)  {
		 ProjectDetails project=null;
		try
		{
		// TODO Auto-generated method stub
		
		Connection con=DbConnector.getConnection();
		
       project=new ProjectDetails();
        
        PreparedStatement st = con.prepareStatement("select * from project_details where projectid=?");
        st.setInt(1, id);
        
        ResultSet rs = st.executeQuery();
        
        
        while(rs.next())
        {
        	
       	project= new ProjectDetails(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(14));
        
        	
        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return project;
	}

	     


}
