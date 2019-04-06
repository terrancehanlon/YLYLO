package com.YLYLO.entites;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    Car car;
    String city;
    String phoneNumber;
    

    public User(Car car, String city) {
        this.car = car;
        this.city = city;
    }

    public String getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
