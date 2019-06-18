package com.cognizant.freelancer.model;

public class FinalisedInfo {
	private String emailid;
	private String skill_name;
	private String projectid;
	private String status;
	public FinalisedInfo(String emailid, String skill_name,String projectid, String status) {
		super();
		this.emailid = emailid;
		this.skill_name = skill_name;
		this.projectid=projectid;
		this.status = status;
	}
	public FinalisedInfo() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getSkill_name() {
		return skill_name;
	}
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
