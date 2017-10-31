package com.mindtree.dto;

import java.sql.Date;
import java.sql.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.entity.FoodOrder;
import com.mindtree.entity.Item;
import com.mindtree.entity.ItemOrdered;
import com.mindtree.entity.User;




public class OrderDto {
	
	
	

	private int orderId;
	private int userId;
	private boolean isActive;
	private Date createdOn;
	private Date updatedOn;
	private String createdBy;
	private String updatedBy;
	private String status;
	
	private List<ItemOrdered> itemList;
	public int getOrderId() {
		return orderId;
	}
	
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date date) {
		this.createdOn = date;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
public  FoodOrder getEntity(){
		
		User user = new User();
		FoodOrder foodOrder;
		foodOrder=new FoodOrder(user, isActive, createdOn, updatedOn, createdBy, updatedBy, status, itemList);
		
		
		return foodOrder;
		
	}

	public OrderDto(int orderId, int userId, boolean isActive, Date createdOn, Date updatedOn,
			String createdBy, String updatedBy, String status, List<Item> itemList) {
		super();
	
		this.orderId = orderId;
		this.userId = userId;
		this.isActive = isActive;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.status = status;
		//this.itemList = itemList;
	}

	public OrderDto(int userId, boolean isActive, Date createdOn, 
			String createdBy, String status, List<Item> itemList) {
	

		this.userId = userId;
		this.isActive = isActive;
		this.createdOn = createdOn;
		
		this.createdBy = createdBy;
		
		this.status = status;
		//this.itemList = itemList;
	}
	
	
	
	public OrderDto(){};
	
}
