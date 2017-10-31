package com.mindtree.serviceimpl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.mindtree.dao.FoodOrderDao;
import com.mindtree.dao.ItemDao;
import com.mindtree.dao.ItemOrderedDao;
import com.mindtree.dao.UserDao;
import com.mindtree.dto.OrderDto;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceImplTest {

	@InjectMocks
	OrderServiceImpl orderServiceImpl;
	
	@Mock
	 FoodOrderDao foodOrderDao;
	@Mock
	 UserDao userDao;
	@Mock 
	ItemDao itemDao;
	@Mock
	 ItemOrderedDao itemOrderedDao;
	
	
	@Test
	public void testCreate() {

		
		
	}

	@Test
	public void testDelete() {
	
		OrderDto orderDto = new OrderDto();
		orderDto.setOrderId(1);
	//	doNothing().when(foodOrderDao.delete(1));
		
		
		
	}

	@Test
	public void testUpdate() {
	//	fail("Not yet implemented");
	}

	@Test
	public void testGetOrdersByUserId() {
	//	fail("Not yet implemented");
	}

}
