package com.mindtree.controller;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.google.common.base.Verify;
import com.mindtree.dto.OrderDto;
import com.mindtree.dto.PostOrderDto;
import com.mindtree.entity.FoodOrder;
import com.mindtree.entity.Item;
import com.mindtree.entity.ItemOrdered;
import com.mindtree.entity.User;
import com.mindtree.service.OrderService;

import static org.mockito.Mockito.when;



@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {

	
	
	@InjectMocks
	OrderController orderController;
	
	@Mock
	OrderService orderService;
	
	@Test
	public void testCreate() {
	
		
		
		PostOrderDto orderDto=new PostOrderDto();
		
		List<Long> itemIdList=new ArrayList<Long>();
		itemIdList.add((long) 1);
		itemIdList.add((long) 2);
		List<Integer> countList=new ArrayList<Integer>();
		countList.add(1);
		countList.add(2);
		
		orderDto.setCountList(countList);
		orderDto.setUserId((long) 1);
		orderDto.setItemIdList(itemIdList);
		
		when(orderService.create(orderDto)).thenReturn("Order succesfully created!!");
		
		assertEquals("Order succesfully created!!", orderController.create(orderDto));
		
		//verify(orderService, times(1)).addOrder(orderDto);
		
		
		
		
		
		
		
		
		
		
		
	}

	@Test
	public void testDelete() {
		
		
		
//		List<Item> itemIdList=new ArrayList<Item>();
//		itemIdList.add(new Item());
//		itemIdList.add(new Item());
//		
//		
//	
//		
//
//		OrderDto orderDto=new OrderDto(1, 1, true, new Date(System.currentTimeMillis()),  new Date(System.currentTimeMillis()),
//				"Bhiswajit", "Goutham", "status",  itemIdList);
//		
//		
//		
//		
//		List<Integer> countList=new ArrayList<Integer>();
//		countList.add(1);
//		countList.add(2);
//		
		
		
		when(orderService.delete(1)).thenReturn("Order succesfully created!!");
		
		assertEquals("Order succesfully created!!", orderController.delete(1));
		
		
	}

	@Test
	public void testGetOrdersByUserId() {


		List<ItemOrdered> itemIdList=new ArrayList();
		itemIdList.add(new ItemOrdered());
		itemIdList.add(new ItemOrdered());
		
/*
		OrderDto orderDto=new OrderDto(1, 1, true, new Date(System.currentTimeMillis()),  new Date(System.currentTimeMillis()),
				"Bhiswajit", "Goutham", "status",  itemIdList);
		OrderDto orderDto1=new OrderDto(1, 1, true, new Date(System.currentTimeMillis()),  new Date(System.currentTimeMillis()),
				"Bhiswajit", "Goutham", "status",  itemIdList);*/
		
		
	
		User user = new User();
		
		/*
		FoodOrder(User user, boolean isActive, Date createdOn, Date updatedOn, String createdBy,
				String updatedBy, String status, List<ItemOrdered> itemOrderedList)
		*/
		List<FoodOrder> foodOrders = new ArrayList();
		FoodOrder foodOrder = new FoodOrder( user,  true, new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis()),
				"Bhiswajit", "Goutham", "status",  itemIdList);
		
//when(orderService.getOrdersByUserId(1)).thenReturn(foodOrder);
		
//		assertEquals("Order succesfully created!!", orderController.delete(1));
		
		
	
	}

	@Test
	public void testUpdate() {
		
		
              OrderDto orderDto = null;
              when(orderService.update(orderDto)).thenReturn("Order succesfully updated!");
	     
		assertEquals("Order succesfully updated!", orderController.update(orderDto));
	}

}
