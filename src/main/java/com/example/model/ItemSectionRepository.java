package com.example.model;

import org.springframework.data.repository.CrudRepository;

public interface ItemSectionRepository extends CrudRepository<ItemSection, Long>{
	
	ItemSection findByStoreAndItem(Store store, Item item);

}
