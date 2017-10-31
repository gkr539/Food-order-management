package com.mindtree.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.dto.ItemDto;
import com.mindtree.entity.Item;

/**
 * @author m1037790
 *
 */
@Service
public interface ItemService {

	public String create(long userId,ItemDto itemDto);
	/**
	 * @param id
	 * @return
	 */
	public String delete(long id);
	
	/**
	 * @param id
	 * @param ItemName
	 * @param description
	 * @param price
	 * @param updatedBy
	 * @return
	 */
	public String update(long id,ItemDto itemDto);
	
	/**
	 * @return
	 */
	public List<Item> getAllItems();
	public List<Item> getItemsByVendorId(long id);
	public Item getItemsByItemId(long id);
	
	
}
