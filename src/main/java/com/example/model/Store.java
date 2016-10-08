package com.example.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	@OneToMany(mappedBy = "store", cascade = CascadeType.PERSIST)
	private List<Section> sections = new ArrayList<Section>();

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

	public List<Section> getSections() {
		return sections;
	}

	public Section getSectionByName(String name) {
		for (Section section : sections) {
			if (name.equalsIgnoreCase(section.getName())) {
				return section;
			}
		}
		return null;
	}

	public void addSection(Section section) {

		if (null != section) {
			section.setStore(this);
			sections.add(section);
		}
	}

}
