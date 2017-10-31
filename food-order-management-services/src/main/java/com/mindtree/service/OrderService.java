package com.mindtree.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.dto.OrderDto;
import com.mindtree.dto.PostOrderDto;
import com.mindtree.entity.FoodOrder;

@Service
public interface OrderService {
	public String create(PostOrderDto postOrderDto);
	public String delete(int orderId);
	public String update(OrderDto orderDto);
	public List<FoodOrder> getOrdersByUserId(long userId);
}
