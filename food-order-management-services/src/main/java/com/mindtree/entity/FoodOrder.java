package com.mindtree.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//import javax.persistence.ManyToMany;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class FoodOrder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6986076623318955288L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	//private int userId;
	@OneToOne
	private User user;
	private boolean isActive;
	private Date createdOn;
	private Date updatedOn;
	private String createdBy;
	private String updatedBy;
	private String status;
	@OneToMany
	private List<ItemOrdered> itemOrderedList;
	public int getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId
	 * @param userId
	 * @param isActive
	 * @param createdOn
	 * @param updatedOn
	 * @param createdBy
	 * @param updatedBy
	 * @param status
	 * @param itemList
	 */
	
	public FoodOrder(User user, boolean isActive, Date createdOn, Date updatedOn, String createdBy,
			String updatedBy, String status, List<ItemOrdered> itemOrderedList) {
		super();
		
		this.user= user;
		this.isActive = isActive;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.status = status;
		this.itemOrderedList = itemOrderedList;
	}
	
	public List<ItemOrdered> getItemOrderedList() {
		return itemOrderedList;
	}
	public void setItemOrderedList(List<ItemOrdered> itemOrderedList) {
		this.itemOrderedList = itemOrderedList;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
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
	
	/**
	 * 
	 */
	public FoodOrder() {
		// TODO Auto-generated constructor stub
	}
}
