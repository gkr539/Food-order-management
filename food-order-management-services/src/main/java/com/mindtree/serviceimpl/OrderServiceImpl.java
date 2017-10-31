package com.mindtree.serviceimpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.dao.FoodOrderDao;
import com.mindtree.dao.ItemDao;
import com.mindtree.dao.ItemOrderedDao;
import com.mindtree.dao.UserDao;
import com.mindtree.dto.OrderDto;
import com.mindtree.dto.PostOrderDto;
import com.mindtree.entity.FoodOrder;
//import com.mindtree.dto.OrderDto;
import com.mindtree.entity.Item;
import com.mindtree.entity.ItemOrdered;
import com.mindtree.entity.User;
import com.mindtree.service.OrderService;



@Component
public class OrderServiceImpl implements OrderService {

	

	@Autowired
	private FoodOrderDao foodOrderDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ItemDao itemDao;
	@Autowired
	private ItemOrderedDao itemOrderedDao;
	@Override
	public String create(PostOrderDto postOrderDto) {
		// TODO Auto-generated method stub
		
		try{
			System.out.println(postOrderDto.getUserId());
			User user = userDao.findOne(postOrderDto.getUserId());
			List<ItemOrdered> itemOrderedList = new ArrayList<ItemOrdered>();
			List<Long> itemIdList = postOrderDto.getItemIdList();
			List<Integer> countList = postOrderDto.getCountList();
			for(int i=0;i< itemIdList.size();i++){
				Item item = itemDao.findOne(itemIdList.get(i));
				ItemOrdered itemOrdered = new ItemOrdered(item,countList.get(i));
				itemOrderedDao.save(itemOrdered);
				itemOrderedList.add(itemOrdered);
			}
			
			FoodOrder foodOrder =new FoodOrder(user,true, new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()), user.getEmailId(),
					user.getEmailId(),"active",itemOrderedList);
			
			foodOrderDao.save(foodOrder);

		}catch(Exception ex){
			ex.printStackTrace();
			return "Error creating the order:"+ex.toString();
		}
		return "Order succesfully created!!";
	}
	

	@Override
	public String delete(int orderId) {
		// TODO Auto-generated method stub
try{
			
			foodOrderDao.delete(orderId);

		}catch(Exception ex){
			ex.printStackTrace();
			return "Error deleting the order:"+ex.toString();
		}
		return "Order succesfully deleted!!";
	}
	

	@Override
	public String update(OrderDto orderDto) {
		
	try{
			
			foodOrderDao.save(orderDto.getEntity());

		}catch(Exception ex){
			ex.printStackTrace();
			return "Error updating the order:"+ex.toString();
		}
		return "Order succesfully Updated!";
	
	}

	@Override
	public List<FoodOrder> getOrdersByUserId(long userId) {
		

		try {
			User user = userDao.findOne(userId);
			return foodOrderDao.findFoodOrderByUser(user);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
		
	}

}
