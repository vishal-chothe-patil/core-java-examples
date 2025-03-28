package com.vbc.schemeform.model;

public class Address {
    public String housenoBuildingName;
    public String landmark;
    public String city;
    public String tehsil;
    public String district;
    public String state;

    @Override
    public String toString() {
        return "Address{" +
                "housenoBuildingName='" + housenoBuildingName + '\'' +
                ", landmark='" + landmark + '\'' +
                ", city='" + city + '\'' +
                ", tehsil='" + tehsil + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public int pincode;

}
