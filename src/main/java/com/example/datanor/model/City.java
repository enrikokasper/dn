package com.example.datanor.model;

public class City {
    long id;
    String name;
    String countryCode;
    String stateCode;


    public City() {
    }

    public City(long id, String name, String countryCode, String stateCode) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.stateCode = stateCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
}
