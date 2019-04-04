package com.YLYLO.entites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	public Country(String name) {
		super();
		this.name = name;
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
