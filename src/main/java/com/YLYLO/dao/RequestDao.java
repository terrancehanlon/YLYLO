package com.YLYLO.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.YLYLO.entites.User;

@Repository
public interface RequestDao extends JpaRepository<User, Integer>{
	
	
	@Query("SELECT u FROM user WHERE u.car_id = :carId and u.city_id = :cityId")
	public ResponseEntity<User> alertUser(@Param("carId") int carId, @Param("cityId") int cityId);
	

}
