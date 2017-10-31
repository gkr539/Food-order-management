package com.mindtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.dto.OrderDto;
import com.mindtree.dto.PostOrderDto;
import com.mindtree.entity.FoodOrder;
import com.mindtree.service.OrderService;

@CrossOrigin(origins = "*")
@RestController
@EnableAutoConfiguration
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	
	
	
	@RequestMapping( method = RequestMethod.POST)
	@ResponseBody
	public String create(@RequestBody PostOrderDto postOrderDto )
	{
		return orderService.create(postOrderDto);

	}
	
	
	@RequestMapping(value="/{orderId}", method = RequestMethod.DELETE)
	@ResponseBody
	public String delete(@PathVariable(value="orderId") int orderId){	
	
		return orderService.delete(orderId);
	}
	
	@RequestMapping(value="/{orderId}" ,method = RequestMethod.GET)
	@ResponseBody
	public List<FoodOrder> getOrdersByUserId(@PathVariable(value="orderId") int orderId){
		
		
		return orderService.getOrdersByUserId(orderId);
		
		
		
	}
	
	@RequestMapping(value="/{orderId}" ,method = RequestMethod.PUT)
	@ResponseBody
	public String update(@RequestBody OrderDto orderDto){
		
		
		return orderService.update(orderDto);
		
		
		
	}
	
	
	
	
}
