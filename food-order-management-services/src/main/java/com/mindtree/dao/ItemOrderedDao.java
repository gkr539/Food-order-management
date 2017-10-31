package com.mindtree.dao;



import org.springframework.data.repository.CrudRepository;

import com.mindtree.entity.ItemOrdered;


public interface ItemOrderedDao extends CrudRepository<ItemOrdered, Long> {
}
