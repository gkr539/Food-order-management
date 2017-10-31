package com.mindtree.serviceimpl;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.dao.ItemDao;
import com.mindtree.dao.UserDao;
import com.mindtree.dto.ItemDto;
import com.mindtree.entity.Item;
import com.mindtree.entity.User;
import com.mindtree.service.ItemService;

/**
 * @author m1037790
 *
 */


@Component
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDao	itemDao;
	@Autowired
	private UserDao userDao;
	@Override
	public String create(long userId,ItemDto itemDto) {
		// TODO Auto-generated method stub //comment
		
		try{
			User user = userDao.findOne(userId);
			Item item = new Item(user, itemDto.getPrice(),itemDto.getItemName(),itemDto.getDescription(),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),itemDto.getAuthor(), itemDto.getAuthor(), true);
			itemDao.save(item);
		}catch(Exception ex){
			ex.printStackTrace();
			return "Error creating the item:"+ex.toString();
		}
		return "Item succesfully created!!";
	}

	/* (non-Javadoc)
	 * @see com.mindtree.service.ItemService#delete(long)
	 */
	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		try{
			Item item = itemDao.findOne(id); 
			item.setStatus(false);
			itemDao.save(item);
		}
		catch(Exception ex){
			return "Error deleting the item :"+ex.toString();
		}
		return "Item succesfully deleted!!";
	}

	/* (non-Javadoc)
	 * @see com.mindtree.service.ItemService#update(long, java.lang.String, java.sql.Blob, double, java.lang.String)
	 */
	@Override
	public String update(long id, ItemDto itemDto) {
		// TODO Auto-generated method stub
		try { 
			Item item = itemDao.findOne(id); 
			item.setItemName(itemDto.getItemName()); 
			item.setPrice(itemDto.getPrice());
			item.setDescription(itemDto.getDescription()); 
			item.setActive(true);
			//item.setUpdatedBy(itemDto.getAuthor());
			//item.setUpdatedOn(new Date(System.currentTimeMillis()));
			itemDao.save(item); 
		} 
		catch (Exception ex) { 
			return "Error updating the user: " + ex.toString(); 
		} 
		return "Item succesfully updated!"; 

	}

	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		List<Item> itemList = itemDao.findAll();
		List<Item> activeItems=new ArrayList();
		for(Item i:itemList)
		if(i.isActive()){
			activeItems.add(i);
		}
		return activeItems;
	}

	@Override
	public List<Item> getItemsByVendorId(long id) {
		// TODO Auto-generated method stub
		User user = userDao.findOne(id);
		//	System.out.println(user.getUserId());
		List<Item> itemList = itemDao.findItemByUser(user);
		List<Item> activeItems=new ArrayList();
		for(Item i:itemList)
		if(i.isActive()){
			activeItems.add(i);
		}
		return activeItems;
			
	}
	@Override
	public Item getItemsByItemId(long id){
		
		
		return itemDao.findOne(id); 
	}



}
