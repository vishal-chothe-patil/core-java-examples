package com.vbc.schemeform.model;

// Address model class with basic fields
public class Address {
    public String housenoBuildingName;
    public String landmark;
    public String city;
    public String tehsil;
    public String district;
    public String state;
    public int pincode;

    // Use toString() helps convert object data into a clean string,
    // Overriding it gives meaningful output instead of memory hash.
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

}
