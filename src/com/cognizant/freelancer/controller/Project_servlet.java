package com.cognizant.freelancer.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.freelancer.model.ProjectDetailsBO;

/**
 * Servlet implementation class Project_servlet
 */
public class Project_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Project_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int t=Integer.parseInt(request.getParameter("title"));
		HttpSession s=request.getSession();
		s.setAttribute("t", t);
		/*response.sendRedirect("UserProject.jsp");*/
		ProjectDetailsBO projectbo=new ProjectDetailsBO();
		ProjectDetails project=projectbo.userviewproject(t);
		request.setAttribute("project", project);
		
		
		
		
		
		RequestDispatcher rd=request.getRequestDispatcher("UserProject.jsp");  
		//servlet2 is the url-pattern of the second servlet  
		  
		rd.forward(request, response);//method may be include or forward  
	}

}
