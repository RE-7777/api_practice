package com.example.demo;

public class Address {
    private String postAddress;
    private String cityName;
    public Address(String postAddress, String cityName) {
        this.postAddress = postAddress;
        this.cityName = cityName;
    }

    public String getpostAddress() {
        return postAddress;
    }

    public void setpostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
