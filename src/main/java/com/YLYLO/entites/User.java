package com.YLYLO.entites;

public class User {

    String car;
    String city;

    public User(String car, String city) {
        this.car = car;
        this.city = city;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
