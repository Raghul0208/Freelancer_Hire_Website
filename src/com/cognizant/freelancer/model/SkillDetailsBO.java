package com.cognizant.freelancer.model;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.cognizant.freelancer.controller.Skill_Details;
import com.cognizant.freelancer.dao.Skill_Details_DAO;

public class SkillDetailsBO {

	public int addUserSkill(Skill_Details cr) throws ClassNotFoundException, SQLException, ParseException {
		// TODO Auto-generated method stub
		
		Skill_Details_DAO sddao=new Skill_Details_DAO();
		int num=sddao.addUserSkill(cr);
		return num;
	}

	public List<Skill_Details> viewProject(int t) {
		// TODO Auto-generated method stub
		List<Skill_Details> slist=null;
		Skill_Details_DAO sddao=new Skill_Details_DAO();
		slist=sddao.viewProject(t);
		return slist;
		



}
}