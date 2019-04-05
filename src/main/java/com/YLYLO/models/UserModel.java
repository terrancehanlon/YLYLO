package com.YLYLO.models;

import com.YLYLO.entites.User;

public class UserModel {
	
	String name;
	String phoneNumber;
	String carModel, carMake, carYear, carColor;
	String cityName, country, Zip;
	public UserModel(String name, String phoneNumber, String carModel, String carMake, String carYear, String carColor,
			String cityName, String country, String zip) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.carModel = carModel;
		this.carMake = carMake;
		this.carYear = carYear;
		this.carColor = carColor;
		this.cityName = cityName;
		this.country = country;
		Zip = zip;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarYear() {
		return carYear;
	}
	public void setCarYear(String carYear) {
		this.carYear = carYear;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}

	
	
	

}
