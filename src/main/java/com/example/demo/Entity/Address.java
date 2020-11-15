package com.example.demo.Entity;

public class Address {
    private String zipcode;
    private String cityName;
    public Address(String zipcode, String cityName) {
        this.zipcode = zipcode;
        this.cityName = cityName;
    }

    public String getzipcode() {
        return zipcode;
    }

    public void setzipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
