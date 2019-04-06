package com.YLYLO.mappers;

import com.YLYLO.entites.Car;
import com.YLYLO.entites.State;
import com.YLYLO.models.UserModel;

public class UserModelToEntities {
	
	public void save(UserModel userModel) {
		Car car = new Car(
				userModel.getCarModel(),
				userModel.getCarMake(),
				userModel.getCarColor(),
				userModel.getCarYear());
		State state = new State(userModel.getCityName());
		
	}
	


}
