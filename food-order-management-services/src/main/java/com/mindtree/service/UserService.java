package com.mindtree.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.dto.LoginDto;
import com.mindtree.dto.RegisterDto;
import com.mindtree.dto.UserDto;
import com.mindtree.entity.*;

@Service
public interface UserService {

	public String createUser(RegisterDto registerDto);
	public String updateUser(UserDto userDto);
	public String deleteUser(Long userId);
	public List<User> getAllUsers();
	public User getUser(Long userId);
	public User getUserByemail(LoginDto loginDto);
	public List<FoodOrder> getOrderByVendorId(long vendorId);
	public List<User> getUserByRole(long id);

}
