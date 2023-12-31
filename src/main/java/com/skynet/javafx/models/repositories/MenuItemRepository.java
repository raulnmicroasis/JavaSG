package com.skynet.javafx.models.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.skynet.javafx.models.MenuItem;

public interface MenuItemRepository extends CrudRepository<MenuItem, Long> {
 
	public List<MenuItem> findByParent(Long parent);

}
