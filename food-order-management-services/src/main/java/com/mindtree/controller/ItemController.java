package com.mindtree.controller;


import java.util.List;

//?itemName=idli&description=myfavdish&price=10&createdBy=vikram
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.dto.ItemDto;
import com.mindtree.entity.Item;
import com.mindtree.service.ItemService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/items")
public class ItemController {
	@Autowired
	ItemService itemService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public List<Item> home(){
		return itemService.getAllItems();
	}
	@RequestMapping(value="/{vendor_id}/create", method = RequestMethod.POST)
	@ResponseBody
	public String create(@PathVariable(value="vendor_id") long id,@RequestBody ItemDto itemDto)
	{
		return itemService.create(id,itemDto);
	}
	@RequestMapping(value="/{vendor_id}/update/{item_id}",method=RequestMethod.PUT)
	@ResponseBody
	public Item update(@PathVariable(value="item_id") int id,@RequestBody ItemDto itemDto)
	{
		itemService.update(id,itemDto);
		return itemService.getItemsByItemId(id);
	}
	
	@RequestMapping(value="/{vendor_id}/delete/{item_id}",method=RequestMethod.DELETE)
	@ResponseBody
	public String update(@PathVariable(value="item_id") long id)
	{
		itemService.delete(id);
		return "Item succesfully deleted!!";
	}
	@RequestMapping(value="/{vendor_id}/{item_id}",method=RequestMethod.GET)
	@ResponseBody
	public Item getItem(@PathVariable(value="item_id") long id)
	{		
		return itemService.getItemsByItemId(id);
	}
	@RequestMapping(value="/{vendor_id}",method=RequestMethod.GET)
	@ResponseBody
	public List<Item> getItemByVendor(@PathVariable(value="vendor_id") long id)
	{		
		return itemService.getItemsByVendorId(id);
	}
	

}
