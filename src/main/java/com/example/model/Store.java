package com.example.model;

import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Store {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;

	@OneToMany
	@JoinTable(name="ITEM_LOCATION", joinColumns= @JoinColumn(name="STORE"), inverseJoinColumns=@JoinColumn(name="Section"))
	@MapKeyJoinColumn(name="ITEM")
	private Map<Item, Section> itemSectionMap;
	
	protected Store() {

	}

	public Store(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
