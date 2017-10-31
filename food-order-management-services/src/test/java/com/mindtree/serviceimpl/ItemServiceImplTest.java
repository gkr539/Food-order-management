package com.mindtree.serviceimpl;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.runners.MockitoJUnitRunner;
import com.mindtree.dao.ItemDao;
import com.mindtree.entity.Item;
import com.mindtree.entity.User;
import com.mindtree.dto.ItemDto;
@RunWith(MockitoJUnitRunner.class)
public class ItemServiceImplTest {

	@InjectMocks
	ItemServiceImpl itemService;
     
	@Mock
	ItemDao itemDao;
	@Test
	public void TestgetAllItems()
	{
		Item i1=new Item();
	    Item i2=new Item();
	    Item i3=new Item();
	    List<Item> itemList=new ArrayList<Item>();
	    itemList.add(i1);
	    itemList.add(i2);
	    itemList.add(i3);
		
		when(itemDao.findAll()).thenReturn(itemList);
		
	assertEquals(itemList,itemService.getAllItems());
	     verify(itemDao,times(1)).findAll();
	}
}