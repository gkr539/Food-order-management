package com.mindtree.dto;

import java.util.List;


public class PostOrderDto {
	private Long userId;
	private List<Long> itemIdList;
	private List<Integer> countList;
	/**
	 * 
	 */
	public PostOrderDto() {
		
	}
	/**
	 * @param userId
	 * @param itemIdList
	 * @param countList
	 */
	public PostOrderDto(Long userId, List<Long> itemIdList, List<Integer> countList) {
		this.userId = userId;
		this.itemIdList = itemIdList;
		this.countList = countList;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<Long> getItemIdList() {
		return itemIdList;
	}
	public void setItemIdList(List<Long> itemIdList) {
		this.itemIdList = itemIdList;
	}
	public List<Integer> getCountList() {
		return countList;
	}
	public void setCountList(List<Integer> countList) {
		this.countList = countList;
	}
	
	
	
	
	
}
