package com.web.entity;

public class User {
	private String UserID;
	private String UserName;
	private String Userpwd;
	private String Userphone;
	
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserpwd() {
		return Userpwd;
	}
	public void setUserpwd(String userpwd) {
		Userpwd = userpwd;
	}
	public String getUserphone() {
		return Userphone;
	}
	public void setUserphone(String userphone) {
		Userphone = userphone;
	}
}
