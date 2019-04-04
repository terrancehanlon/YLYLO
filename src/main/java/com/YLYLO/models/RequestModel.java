package com.YLYLO.models;

import com.YLYLO.entites.User;

public class RequestModel {
	
	User user;

	public RequestModel(User user) {
		super();
		this.user = user;
	}
	
	public RequestModel() {}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
