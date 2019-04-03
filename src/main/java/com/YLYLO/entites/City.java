package com.YLYLO.entites;

public class City {
	
	Country country;
	State state;
	Zip zip;
	String name;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Zip getZip() {
		return zip;
	}
	public void setZip(Zip zip) {
		this.zip = zip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City(Country country, State state, Zip zip, String name) {
		super();
		this.country = country;
		this.state = state;
		this.zip = zip;
		this.name = name;
	}
	
	

}
