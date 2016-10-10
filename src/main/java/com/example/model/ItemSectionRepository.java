package com.example.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ItemSectionRepository extends CrudRepository<ItemSection, Long> {

	
	ItemSection findByItemAndSectionStore(@Param("item") Item item, @Param("store")Store store);

	ItemSection findByItem(@Param("item") Item item);


}
