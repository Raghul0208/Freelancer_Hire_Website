package com.cognizant.freelancer.model;

import java.sql.SQLException;
import java.text.ParseException;

import com.cognizant.freelancer.controller.User_registration;
import com.cognizant.freelancer.dao.User_registration_DAO;

public class UserBO {

	public int addUserRegister(User_registration cr) throws ClassNotFoundException, SQLException, ParseException {
		// TODO Auto-generated method stub
		
		User_registration_DAO userdao=new User_registration_DAO();
		int num=userdao.addUserRegister(cr);
		return num;
	}

	public User_registration findUserByIdPwd(String email, String password) throws SQLException {
		// TODO Auto-generated method stub
		
		User_registration_DAO userdao=new User_registration_DAO();
		User_registration id=userdao.findUserByIdPwd(email, password);
		return id;
	}


}
