package com.gx.Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gx.DBConnect.DBConnect;


public class UserDaoImpl implements UserDao {
	
	private static Connection conn;    //variable declaration 

	public UserDaoImpl(Connection conn) {
		super();                              //constructor
		this.conn = conn;                 
	}
     public boolean userRegister(User1 us) {
		boolean f = false;
		try {
		 String sql="insert into registerUser(email,password,phone) values(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString( 1,  us.getEmail());
			ps.setString( 2,  us.getPassword());
			ps.setString( 3,  us.getPhone());
		
			
			int i=ps.executeUpdate();
			if(i==1) {
				f=true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		 return f;
	}
	public User1 login(String email, String password) {
		User1 us=null;
		
		try {
			String sql="select * from registerUser where email=? and password =?";
			PreparedStatement ps =conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				us = new User1();
				us.setId(rs.getInt(1));
				us.setName(rs.getString(2));
				us.setEmail(rs.getString(3));
				us.setPassword(rs.getString(4));
				us.setPhone(rs.getString(5));
			
			
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return us;
		
	}
					@Override
			public boolean addIssues(IssueUser iu) {
				 String query = "INSERT INTO Issue (id, name, email, mobile, city, dob, issue, state) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

			        try (Connection connection = DBConnect.getConn();
			             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			        	   preparedStatement.setInt(1, iu.getId());
			            preparedStatement.setString(2, iu.getName());
			            preparedStatement.setString(3, iu.getEmail());
			            preparedStatement.setString(4, iu.getMobile());
			            preparedStatement.setString(5, iu.getCity());
			            preparedStatement.setString(6, iu.getDob());
			            preparedStatement.setString(7, iu.getIssue());
			            preparedStatement.setString(8, iu.getState());
//			            preparedStatement.setBoolean(9, iu.getUpdateCheck());
//			            preparedStatement.setBoolean(10, iu.getResolveCheck());
			            
			         

			            int rowsAffected = preparedStatement.executeUpdate();
	System.out.println("main issue hu");
			            return rowsAffected > 0;
			        } catch (SQLException e) {
			            e.printStackTrace();
			            return false;
			        }
			}
			
			public List<IssueUser> getAllIssues() {

				List<IssueUser> list = new ArrayList<IssueUser>();
				IssueUser issue = null;

				try {
					String sql = "Select * from issue";
				
					//	PreparedStatement ps = Connection.prepareStatement(query);
					PreparedStatement ps = conn.prepareStatement(sql);
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						issue = new IssueUser();
						issue.setId(rs.getInt(1));
						issue.setName(rs.getString(2));
						issue.setMobile(rs.getString(3));
						issue.setCity(rs.getString(4));
						issue.setDob(rs.getString(5));
					
						issue.setIssue(rs.getString(6));
						issue.setState(rs.getString(7));
						issue.setEmail(rs.getString(8));
						issue.setUpdateCheck(rs.getBoolean(9));
						issue.setResolveCheck(rs.getBoolean(10));
						
						list.add(issue);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

				return list;
			}
			@Override
		
			public boolean checkPassword(int id, String ps) {

				boolean f = false;

				try {

					String sql = "select * from user where id=? and password=?";
					PreparedStatement pst = conn.prepareStatement(sql);
					pst.setInt(1, id);
					pst.setString(2, ps);

					ResultSet rs = pst.executeQuery();
					while (rs.next()) {
						f = true;
					}
				} catch (Exception e) {

					e.printStackTrace();
				}
				return f;
			}
			
		 
			 public static void updateIssueState(int Id, String newState) {
			     try {  
				 String sql = "UPDATE issue SET state = ? WHERE id = ?";
			       
			             PreparedStatement pst = conn.prepareStatement(sql);
			            pst.setString(1, newState);
			            pst.setInt(2, Id);
			            pst.executeUpdate();
			        }
			 catch (Exception e) {

					e.printStackTrace();
				}

		

			 }
}
	


