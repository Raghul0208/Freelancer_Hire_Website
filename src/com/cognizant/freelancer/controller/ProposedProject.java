package com.cognizant.freelancer.controller;

public class ProposedProject {

	private String projecttitle;
	private int projectid;
	private String emailid;
	public String getProjecttitle() {
		return projecttitle;
	}
	public void setProjecttitle(String projecttitle) {
		this.projecttitle = projecttitle;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public ProposedProject(String emailid, int projectid, String projecttitle) {
		super();
		this.emailid = emailid;
		this.projectid = projectid;
		this.projecttitle = projecttitle;
	}
	
	
	
}
