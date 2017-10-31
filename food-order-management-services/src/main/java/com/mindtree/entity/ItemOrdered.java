package com.mindtree.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class ItemOrdered implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4917269291829852444L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemOrderId;
	@OneToOne
	private Item item;
	private int count;
	/**
	 * 
	 */
	public ItemOrdered() {
		
	}
	
	/**
	 * @param itemOrderId
	 * @param item
	 * @param count
	 */
	public ItemOrdered( Item item, int count) {
		
		this.item = item;
		this.count = count;
	}

	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
