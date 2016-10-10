package com.example.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StoreRepository extends CrudRepository<Store, Long> {

	Store findByName(@Param("name") String name);

}
