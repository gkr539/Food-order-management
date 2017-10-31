package com.mindtree.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class RoleMaster implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8439055591004796185L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long roleId;
	private String role;
	private Timestamp createdOn;
	private Timestamp updatedOn;
	private String createdBy;
	private String updatedBy;
	public RoleMaster(long roleId, String role) {
		super();
		this.roleId = roleId;
		this.role = role;
	}
	private boolean isActive;
	/**
	 * 
	 */
	public RoleMaster() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param roleId
	 * @param role
	 * @param createdOn
	 * @param updatedOn
	 * @param createdBy
	 * @param updatedBy
	 * @param isActive
	 */
	public RoleMaster(long roleId, String role, Timestamp createdOn, Timestamp updatedOn, String createdBy,
			String updatedBy, boolean isActive) {
		this.roleId = roleId;
		this.role = role;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.isActive = isActive;
	}
	
	public long getRoleId() {
		return roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	
	
	
}
