package com.mindtree.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.dto.LoginDto;
import com.mindtree.dto.RegisterDto;
import com.mindtree.dto.UserDto;
import com.mindtree.entity.User;
import com.mindtree.service.UserService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Users")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method=RequestMethod.POST)
	public String Create(@RequestBody RegisterDto registerDto)
	{
		return userService.createUser(registerDto);
	}
	@RequestMapping(value="/{userId}",method=RequestMethod.GET)
	public User getUser(@RequestParam Long userId)
	{
		return userService.getUser(userId);
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAllUsers()
	{  
		return userService.getAllUsers();
	}
	@RequestMapping(method=RequestMethod.PUT)
	public String updateUser(@RequestParam UserDto userDto)
	{
		return userService.updateUser(userDto);
	}
	@RequestMapping(value="/vendors",method=RequestMethod.GET)
	public List<User> getUserByRole(@RequestParam long roleId)
	{
		return userService.getUserByRole(roleId);
	}
	/**
	 * @param userId
	 * @return
	 */
	@RequestMapping(value="/{userId}",method=RequestMethod.DELETE)
	public String deleteUser(@RequestParam Long userId)
	{
		return userService.deleteUser(userId);
	}
	
	@RequestMapping(value="/orders/{userId}",method=RequestMethod.GET)
	public List<User> getOrdersByVendorId(@PathVariable long roleId)
	{
		return null;//userService.getOrderByVendorId(roleId);
	}
	
	@RequestMapping(value="user/",method=RequestMethod.POST)
	public User getUserByemail(@RequestBody LoginDto loginDto)
	{
		return userService.getUserByemail(loginDto);//userService.getOrderByVendorId(roleId);
	}
	
	
}
