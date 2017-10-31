package com.mindtree.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5481093538791665517L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String username;
	private String password;
	private String phoneNo;
	private String emailId;
	private Timestamp createdOn;
	private Timestamp updatedOn;
	private String createdBy;
	private String updatedBy;
	private boolean isActive;
	@OneToOne
	@JoinColumn(name = "role_id")
	private RoleMaster rolemaster;
	@OneToMany
	private List<FoodOrder> orderList;
	/**
	 * 
	 */
	public User() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param userId
	 * @param username
	 * @param password
	 * @param phoneNo
	 * @param emailId
	 * @param createdOn
	 * @param updatedOn
	 * @param createdBy
	 * @param updatedBy
	 * @param isActive
	 */
	public User(Long userId, String username, String password, String phoneNo, String emailId, Timestamp createdOn,
			Timestamp updatedOn, String createdBy, String updatedBy, boolean isActive) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.isActive = isActive;
	}
	public User(Long userId, String username, String password, String phoneNo, String emailId, RoleMaster rolemaster,
			List<FoodOrder> orderList) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.rolemaster = rolemaster;
		this.orderList = orderList;
	}
	
	public User(Long userId, String username, String password, String phoneNo, String emailId, Timestamp createdOn,
			Timestamp updatedOn, String createdBy, String updatedBy, boolean isActive, RoleMaster rolemaster) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.isActive = isActive;
		this.rolemaster = rolemaster;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	public Timestamp getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public RoleMaster getRolemaster() {
		return rolemaster;
	}
	public void setRolemaster(RoleMaster rolemaster) {
		this.rolemaster = rolemaster;
	}
	
	
}
