package com.cognizant.freelancer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.freelancer.dao.FinalisedInfo_DAO;
import com.cognizant.freelancer.model.FinalisedInfoBO;

/**
 * Servlet implementation class FinalisedInfo_servlet
 */
public class FinalisedInfo_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalisedInfo_servlet() {
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
		doGet(request, response);
		PrintWriter out = response.getWriter();
		String emailid[]=request.getParameterValues("eid");
		String skill_name[]=request.getParameterValues("sn");
		String projectid[]=request.getParameterValues("pid");
		String status[]=request.getParameterValues("approve");
	   // out.print(emailid[0]);
		List<FinalisedInfo> list=new ArrayList<>();
		for(int i=0;i<status.length;i++)
		{
		FinalisedInfo cr=new FinalisedInfo(emailid[i],skill_name[i],projectid[i],status[i]);
		list.add(cr);
		} 
		
		//ProjectDetails cr=new ProjectDetails(projecttitle,projectduration,skillset1,skillset2,skillset3,skillset4,skillset5,skillset6,skillset7,skillset8,skillset9,skillset10,remarks);
	        
		 //FinalisedInfo_DAO crd =new FinalisedInfo_DAO();
		
		FinalisedInfoBO fibo=new FinalisedInfoBO();
		 try {
			 int no=fibo.addFinalInfo(list);
			 if(no!=0)
				response.sendRedirect("Adminview.jsp");
				

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
