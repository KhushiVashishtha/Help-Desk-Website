package com.gx.Dao;

public class User1 {
	private int id;
	private String name;
		private String email;
		private String phone;
		private String password;
		private String Admin;
		public User1() {
			super();
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone
					+"]";
		}
			
		}
	
		
	
		
		


