package com.cognizant.freelancer.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.freelancer.controller.ProjectDetails;
import com.cognizant.freelancer.controller.ProposedProject;
import com.cognizant.freelancer.dao.ProjectDetails_DAO;
import com.cognizant.freelancer.util.DbConnector;

public class ProjectDetailsBO {

	public int addProject(ProjectDetails cr) throws ClassNotFoundException, SQLException, ParseException {
		// TODO Auto-generated method stub
		ProjectDetails_DAO pddao=new ProjectDetails_DAO();
		int num=pddao.addProject(cr);
		return num;
	}

	public List<ProjectDetails> viewProject(ProjectDetails cr) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		ProjectDetails_DAO pddao=new ProjectDetails_DAO();
		List<ProjectDetails> list=new ArrayList();
		list=pddao.viewProject(cr);
		return list;
	}

	public List<ProposedProject> viewApprovedProjects(String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		ProjectDetails_DAO pddao=new ProjectDetails_DAO();
		List<ProposedProject> list1=new ArrayList();
		list1=pddao.viewApprovedProjects(email);
		return list1;
	}
	public ProjectDetails userviewproject(int id)  {
		// TODO Auto-generated method stub		
		ProjectDetails_DAO pddao=new ProjectDetails_DAO();
        ProjectDetails project=new ProjectDetails();
        project=pddao.userviewproject(id);  
         
       
		return project;
	}
}
