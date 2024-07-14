package com.gx.Dao;

public interface UserDao  {
public boolean userRegister(User1 us);    //created method
	
	public User1 login(String email,String password);
	public boolean checkPassword (int id, String ps);
	
	boolean addIssues(IssueUser iu);
	

	//boolean isValidUser(String email, String password);

	

}
