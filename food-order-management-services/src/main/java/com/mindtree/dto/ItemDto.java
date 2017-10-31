package com.mindtree.dto;

public class ItemDto {
	private String itemName;
	private String description;
	private double price;
	private String author;
	/**
	 * 
	 */
	public ItemDto() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param itemName
	 * @param description
	 * @param price
	 * @param author
	 */
	public ItemDto(String itemName, String description, double price, String author) {
		this.itemName = itemName;
		this.description = description;
		this.price = price;
		this.author = author;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
