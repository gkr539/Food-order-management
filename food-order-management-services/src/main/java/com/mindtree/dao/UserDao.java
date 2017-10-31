package com.mindtree.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.entity.RoleMaster;
import com.mindtree.entity.User;

public interface UserDao extends CrudRepository<User, Long> {
	public List<User> findUserByRolemaster(RoleMaster rolemaster);
	
	public User findUserByEmailIdAndPassword(String email,String password);
}
