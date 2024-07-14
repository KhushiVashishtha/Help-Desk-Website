package com.gx.Dao;

import java.sql.Connection;

public class IssueUser {

	private Connection conection;
	

	public IssueUser() {
		super();
	}

	public IssueUser(Connection conection, int id, String name, String email, String mobile, String city, String dob, String issue, String State, boolean updateCheck, boolean resolveCheck) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.dob = dob;
		this.issue = issue;
		this.state=state;
		this.updateCheck = updateCheck;
		this.resolveCheck = resolveCheck;
	}

	

	private int id;
	private String name;
	private String email;
	private String mobile;
	private String city;
	private String dob;

	private String issue;
	private String state;
	private boolean updateCheck;	
	private boolean resolveCheck;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean getUpdateCheck() {
		return updateCheck;
	}

	public void setUpdateCheck(boolean updateCheck) {
		this.updateCheck = updateCheck;
	}

	public boolean getResolveCheck() {
		return resolveCheck;
	}

	public void setResolveCheck(boolean resolveCheck) {
		this.resolveCheck = resolveCheck;
	}


	




	

}
