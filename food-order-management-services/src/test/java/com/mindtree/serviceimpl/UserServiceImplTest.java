package com.mindtree.serviceimpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.mindtree.dao.ItemDao;
import com.mindtree.dao.UserDao;
import com.mindtree.entity.Item;
import com.mindtree.entity.User;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

	
	  @InjectMocks
		UserServiceImpl userService;
	     
		@Mock
		UserDao userDao;
		@Test
		public void testReturnAllUsers()
		{
			User u1=new User();
			User u2=new User();
			User u3=new User();
		    List<User> userList=new ArrayList<User>();
		    userList.add(u1);
		    userList.add(u2);
		    userList.add(u3);
			
			when(userDao.findAll()).thenReturn(userList);
			
		assertEquals(userList,userService.getAllUsers());
		    verify(userDao,times(1)).findAll();
		}
		
		
		@Test
		public void TestReturnUser()
		{
			User u=new User();
		    List<User> userList=new ArrayList<User>();
			
			when(userDao.findOne(new Long(8))).thenReturn(u);
			
		assertEquals(u,userService.getUser(new Long(8)));
		     // verify(itemDao,times(1)).getAllItems();
		}
	}
