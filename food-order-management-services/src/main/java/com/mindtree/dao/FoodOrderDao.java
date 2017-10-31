package com.mindtree.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.entity.FoodOrder;
import com.mindtree.entity.Item;
import com.mindtree.entity.User;


@Repository
@Transactional
public interface FoodOrderDao extends CrudRepository<FoodOrder,Integer> {

	//@Query("select f from food_order f where f.userid = ?1")
	//public List<FoodOrder> findFoodOrderByUserId(int userId);
	
	public List<FoodOrder> findFoodOrderByUser(User user);
	
	
	@Query("select distinct(orderId) from FoodOrder  ")
	public List<FoodOrder> getFoodOrderByVendorId();
	
	
//	
//	@Query("")
//	public List<Item> getFoodOrderItemsByVendorId();
	
	
}
