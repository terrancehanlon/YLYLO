package com.YLYLO.entites;

import java.util.List;

public class State {

	Country country;
	List<Zip> zipcodes;
	String name;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public List<Zip> getZipcodes() {
		return zipcodes;
	}
	public void setZipcodes(List<Zip> zipcodes) {
		this.zipcodes = zipcodes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public State(Country country, List<Zip> zipcodes, String name) {
		super();
		this.country = country;
		this.zipcodes = zipcodes;
		this.name = name;
	}
	
	
}
