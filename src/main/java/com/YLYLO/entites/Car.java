package com.YLYLO.entites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
	
	String model;
	String make;
	String color;
	String year;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Car(String model, String make, String color, String year) {
		super();
		this.model = model;
		this.make = make;
		this.color = color;
		this.year = year;
	}
	
	 

}
