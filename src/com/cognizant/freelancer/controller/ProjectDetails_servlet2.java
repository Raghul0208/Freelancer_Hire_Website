package com.cognizant.freelancer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.freelancer.model.ProjectDetailsBO;

/**
 * Servlet implementation class ProjectDetails_servlet2
 */
public class ProjectDetails_servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectDetails_servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String projecttitle=request.getParameter("projecttitle");
		String projectduration=request.getParameter("projectduaration");
		String skillset1=request.getParameter("Skill1");
		String skillset2=request.getParameter("Skill2");
		String skillset3=request.getParameter("Skill3");
		String skillset4=request.getParameter("Skill4");
		String skillset5=request.getParameter("Skill5");
		String skillset6=request.getParameter("Skill6");
		String skillset7=request.getParameter("Skill7");
		String skillset8=request.getParameter("Skill8");
		String skillset9=request.getParameter("Skill9");
		String skillset10=request.getParameter("Skill10");
		String remarks=request.getParameter("remarks");
		
		 PrintWriter out = response.getWriter();
		 
		int adminid=0;
		int projectid=0; 
		ProjectDetails cr=new ProjectDetails(projecttitle,projectduration,skillset1,skillset2,skillset3,skillset4,skillset5,skillset6,skillset7,skillset8,skillset9,skillset10,remarks,projectid,adminid);
	        
		 //ProjectDetails_DAO crd =new ProjectDetails_DAO();
		
		ProjectDetailsBO pdbo=new ProjectDetailsBO();
		 try {
				//int no=crd.addProject(cr);
				// out.print("Registration successful");
				 List<ProjectDetails> c=pdbo.viewProject(cr);
				 HttpSession session=request.getSession();
                 request.setAttribute("pt",c );
                 RequestDispatcher rd=request.getRequestDispatcher("Proposedproject.jsp");  
         		//servlet2 is the url-pattern of the second servlet  
         		  
         		rd.forward(request, response);//method may be include or forward  

			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          
	      
	}

}
