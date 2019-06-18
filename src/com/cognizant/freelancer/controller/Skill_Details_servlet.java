package com.cognizant.freelancer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.freelancer.model.SkillDetailsBO;

/**
 * Servlet implementation class Skill_Details_servlet
 */
public class Skill_Details_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Skill_Details_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*PrintWriter out=response.getWriter();
		
		String emailid=request.getParameter("emailid");
		String skill_name=request.getParameter("skill");
		String projectid=request.getParameter("projectid1");
		Skill_Details cr=new Skill_Details(emailid,skill_name,projectid);		
		SkillDetailsBO sdbo=new SkillDetailsBO();
		
	
		
		 try {
				//int no=crd.addProject(cr);
				// out.print("Registration successful");
				 List<Skill_Details> c=sdbo.viewProject(cr);
				 for (Skill_Details skill_Details : c) {
					
				}
				
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }*/
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = response.getWriter();
		
		String emailid=request.getParameter("emailid");
		String skill_name=request.getParameter("skill");
		String projectid=request.getParameter("projectid1");
		Skill_Details cr=new Skill_Details(emailid,skill_name,projectid);		        
		
		//ProjectDetails cr=new ProjectDetails(projecttitle,projectduration,skillset1,skillset2,skillset3,skillset4,skillset5,skillset6,skillset7,skillset8,skillset9,skillset10,remarks);
	        
		 //Skill_Details_DAO crd =new Skill_Details_DAO();
		
		SkillDetailsBO sdbo=new SkillDetailsBO();
		 try {
				int no=sdbo.addUserSkill(cr);
				if(no!=0)
			response.sendRedirect("Userviewproject.jsp");
				
				

			} catch (SQLException | ClassNotFoundException | ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	
		
	}

}
