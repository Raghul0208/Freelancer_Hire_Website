package com.cognizant.freelancer.model;

public class Skill_Details {
	private String skillName;
	private String emailid;
	private String projectid;
	public Skill_Details(String emailid,String skillName,String projectid) {
		super();
		this.skillName = skillName;
		this.emailid = emailid;
		this.projectid=projectid;
		
	}
	
	public String getProjectid() {
		return projectid;
	}

	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}

	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	
	
	

}
