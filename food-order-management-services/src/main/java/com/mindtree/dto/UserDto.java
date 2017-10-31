package com.mindtree.dto;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.mindtree.entity.FoodOrder;
import com.mindtree.entity.RoleMaster;
import com.mindtree.entity.User;

public class UserDto {

	private Long userId;
	private String userName;
	private String password;
	private String phoneNo;
	private String emailId;
	private Timestamp createdOn;
	private Timestamp updatedOn;
	private String createdBy;
	private String updatedBy;
	private boolean isActive;
	@OneToOne
	private RoleMaster rolemaster;
	@OneToMany
	private List<FoodOrder> orderList;
	
	public User getEntity(){
		User user=new User(userId,userName,password,phoneNo,emailId,createdOn,updatedOn,createdBy,updatedBy,isActive);
	     return user;
	}

	public UserDto() {
	
		}

	/**
	 * @param userId
	 * @param userName
	 * @param password
	 * @param phoneNo
	 * @param emailId
	 * @param createdOn
	 * @param updatedOn
	 * @param createdBy
	 * @param updatedBy
	 * @param isActive
	 * @param rolemaster
	 * @param orderList
	 */
	public UserDto(Long userId, String userName, String password, String phoneNo, String emailId, Timestamp createdOn,
			Timestamp updatedOn, String createdBy, String updatedBy, boolean isActive, RoleMaster rolemaster,
			List<FoodOrder> orderList) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.isActive = isActive;
		this.rolemaster = rolemaster;
		this.orderList = orderList;
	}
	
	
}
