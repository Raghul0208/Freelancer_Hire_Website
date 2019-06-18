package com.cognizant.freelancer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cognizant.freelancer.controller.Admin;
import com.cognizant.freelancer.model.AdminBO;



/**
* Servlet implementation class Cust_Register_Servlet
*/

public class Admin_servlet extends HttpServlet {
                private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

                /**
                * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
                */
    
                protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                // TODO Auto-generated method stub
                                

response.getWriter().append("Served at: ").append(request.getContextPath());
String email, password;
email=request.getParameter("email");
password=request.getParameter("password");
PrintWriter out = response.getWriter();

 

AdminBO adminbo=new AdminBO();

    
    com.cognizant.freelancer.controller.Admin i;
                try {
                                i = adminbo.findUserByIdPwd(email, password);
                                if((i !=null))
                    {
                         HttpSession session=request.getSession();
                         session.setAttribute("int",i );
                         //out.println("please enter password and email");
                    response.sendRedirect("Adminview.jsp");
                }
                    else
                    {
                                out.println("Invalid email or password ");
                    }
                } catch (SQLException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                }
    

}




                                
                                

                /**
                * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
                */
                protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                                // TODO Auto-generated method stub
                
                
                                String firstname=request.getParameter("firstname");
                                String lastname=request.getParameter("lastname");
                                String contactnumber=request.getParameter("contactnumber");
                                String email=request.getParameter("email");
                                String password=request.getParameter("password");
                                
                
                                
        PrintWriter out = response.getWriter();
                                
       
        

    
                  com.cognizant.freelancer.controller.Admin ar;
                  try {
                ar=  new Admin(firstname,lastname,contactnumber,email,password);
                  AdminBO adminbo=new AdminBO();
                
                  int no= adminbo.addAdmin(ar);
                  if(no!=0)
                  {
                                                response.sendRedirect("Admin_login.jsp");
                  }
                  }
                  
                  
                  catch (SQLException e) {
                                                // TODO Auto-generated catch block
                                                e.printStackTrace();
                                } catch (ClassNotFoundException e) {
                                                // TODO Auto-generated catch block
                                                e.printStackTrace();
                                } catch (ParseException e) {
                                                // TODO Auto-generated catch block
                                                e.printStackTrace();
                                }
                
                
      
         
       }
}


