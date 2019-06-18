package com.cognizant.freelancer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.freelancer.model.ProjectDetailsBO;

/**
 * Servlet implementation class See_Notification_servlet
 */
public class See_Notification_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public See_Notification_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession s=request.getSession();
		String email=(String) request.getSession(false).getAttribute("em");
		//String pswd=request.getParameter("");
	//	System.out.println("Email:"+email);
		
		ProjectDetailsBO pdbo=new ProjectDetailsBO();
		
		try {
			//int no=crd.addProject(cr);
			// out.print("Registration successful");
			 List<ProposedProject> c=pdbo.viewApprovedProjects(email);
			 for (ProposedProject projectDetails : c) {
				 System.out.println(projectDetails.getProjecttitle());
			}
			 
			 HttpSession session=request.getSession();
             request.setAttribute("pt",c );
             RequestDispatcher rd=request.getRequestDispatcher("Seenotification.jsp");  
     		  
             rd.forward(request, response);
		}
			 catch(Exception e)
			 {
				 e.printStackTrace();
			 }
		
	}

}
