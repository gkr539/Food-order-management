package com.mindtree.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Item implements Serializable {
	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 2450543877898709516L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long itemId;
	private double price;
	private String itemName;
	private String description;
	private Date createdOn;
	private Date updatedOn;
	private String createdBy;
	private String updatedBy;
	private boolean isActive;
	
	@ManyToOne
	private User user;
	
	
	

	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
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
	public Boolean getStatus() {
		return isActive;
	}
	public void setStatus(Boolean status) {
		this.isActive = status;
	}
	
	/**
	 * @param id
	 */
	public Item(long id) {
		this.itemId =  id;
	}
	

	public long getItemId() {
		return itemId;
	}
	/**
	 * @param itemId
	 * @param price
	 * @param itemName
	 * @param description
	 * @param createdOn
	 * @param updatedOn
	 * @param createdBy
	 * @param updatedBy
	 * @param isActive
	 */
	public Item(User user, double price, String itemName, String description, Date createdOn, Date updatedOn,
			String createdBy, String updatedBy, boolean isActive) {
		this.user = user;
		this.price = price;
		this.itemName = itemName;
		this.description = description;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.isActive = isActive;
	}
	/**
	 * @param itemId
	 * @param price
	 * @param itemName
	 * @param description
	 * @param createdBy
	 * @param updatedBy
	 * @param isActive
	 */
	public Item( double price, String itemName, String description, String createdBy, String updatedBy,
			boolean isActive) {
		
		this.price = price;
		this.itemName = itemName;
		this.description = description;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.isActive = isActive;
	}
	/**
	 * @param itemId
	 * @param price
	 * @param itemName
	 * @param description
	 * @param createdOn
	 * @param updatedOn
	 * @param createdBy
	 * @param updatedBy
	 * @param isActive
	 */
	public Item(int itemId, double price, String itemName, String description, Date createdOn, Date updatedOn,
			String createdBy, String updatedBy, boolean isActive) {
		this.itemId = itemId;
		this.price = price;
		this.itemName = itemName;
		this.description = description;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
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
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 */
	public Item() {
		
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
