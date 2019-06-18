package com.cognizant.freelancer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.freelancer.model.SkillDetailsBO;

/**
 * Servlet implementation class Project_servlet2
 */
public class Project_servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Project_servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int t=Integer.parseInt(request.getParameter("title"));
		HttpSession s=request.getSession();
		s.setAttribute("t", t);
		/*response.sendRedirect("UserProject.jsp");*/
		SkillDetailsBO skillbo=new SkillDetailsBO();
		List<Skill_Details> list=skillbo.viewProject(t);
		System.out.println(list);
		request.setAttribute("skilllist", list);
		RequestDispatcher rd=request.getRequestDispatcher("Seestatus.jsp");  
		//servlet2 is the url-pattern of the second servlet  
		  
		rd.forward(request, response);//method may be include or forward  
	}

}
