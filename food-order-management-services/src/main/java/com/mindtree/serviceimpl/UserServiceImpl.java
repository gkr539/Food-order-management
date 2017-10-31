package com.mindtree.serviceimpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mindtree.dao.RoleMasterDao;
import com.mindtree.dao.UserDao;
import com.mindtree.dto.LoginDto;
import com.mindtree.dto.RegisterDto;
import com.mindtree.dto.UserDto;
import com.mindtree.entity.FoodOrder;
import com.mindtree.entity.RoleMaster;
import com.mindtree.entity.User;
import com.mindtree.service.UserService;



@Component
public class UserServiceImpl  implements UserService{

	@Autowired
	UserDao userDao;
	@Autowired
	RoleMasterDao roleMasterDao;
	
	@Override
	public String createUser(RegisterDto registerDto) {
		try{
		userDao.save(registerDto.getEntity());
		}
		catch(Exception e){
			return "Error creating user";
		}
		return "User created successfully";
	}

	@Override
	public String updateUser(UserDto userDto) {
		try{
			User user=userDao.findOne(userDto.getEntity().getUserId());
			//userDao.
			}
			catch(Exception e){
				return "Error updating user";
			}
			return "User updated successfully";
		
	}

	@Override
	public String deleteUser(Long userId) {
		try{
		userDao.delete(userId);
		}catch(Exception e)
		{
			return "Error deleting user";
		}
		return "User deleted successfully";
	}

	@Override
	public List<User> getAllUsers() {
		return (List<User>)userDao.findAll();
	}

	@Override
	public User getUser(Long userId) {
	 return userDao.findOne(userId);
	}

	

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

//	@Override
//	protected void finalize() throws Throwable {
//		// TODO Auto-generated method stub
//		super.finalize();
//	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public List<User> getUserByRole(long id) {
		// TODO Auto-generated method stub
		RoleMaster rolemaster = roleMasterDao.findOne(id);
		List<User> userList = userDao.findUserByRolemaster(rolemaster);
		return userList;
	}

	@Override
	public List<FoodOrder> getOrderByVendorId(long vendorId) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public User getUserByemail(LoginDto loginDto) {
		// TODO Auto-generated method stub
		 return userDao.findUserByEmailIdAndPassword(loginDto.getEmail(),loginDto.getPassword());
	}

}
