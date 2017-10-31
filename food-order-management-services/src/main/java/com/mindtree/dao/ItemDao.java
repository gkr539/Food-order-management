package com.mindtree.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mindtree.entity.Item;
import com.mindtree.entity.User;

@Repository
@Transactional
public interface ItemDao extends JpaRepository<Item,Long> {
	public List<Item> findItemByUser(User user);
}
