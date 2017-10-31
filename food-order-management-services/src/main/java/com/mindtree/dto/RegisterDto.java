package com.mindtree.dto;

import java.sql.Date;
import java.util.List;

import com.mindtree.entity.FoodOrder;
import com.mindtree.entity.RoleMaster;
import com.mindtree.entity.User;

public class RegisterDto {

	private String userName;
	private String password;
	private String emailId;
	private String phoneNumber;
	private long roleId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	public User getEntity(){
		
		
		
		RoleMaster roleMaster=new RoleMaster();
		roleMaster.setRoleId(roleId);
		
		User user=new User((long)0, userName, password, phoneNumber, emailId, null, null, "b", "b", true,roleMaster);
		return user;
	}
	
	
	
	
	
	
	
	
}
