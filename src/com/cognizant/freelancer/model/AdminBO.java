package com.cognizant.freelancer.model;

import java.sql.SQLException;
import java.text.ParseException;

import com.cognizant.freelancer.controller.Admin;
import com.cognizant.freelancer.dao.Admin_DAO;

public class AdminBO {

                public int addAdmin(Admin ar) throws ClassNotFoundException, SQLException, ParseException {
                                // TODO Auto-generated method stub
                                Admin_DAO admindao=new Admin_DAO();
                                int num=admindao.addAdmin(ar);
                                return num;
                }

                public Admin findUserByIdPwd(String email, String password) throws SQLException {
                                // TODO Auto-generated method stub
                                
                                Admin_DAO admindao=new Admin_DAO();
                                Admin ad=admindao.findUserByIdPwd(email,password);
                                return ad;
                }

                
                

                
                
                
                
                
}
