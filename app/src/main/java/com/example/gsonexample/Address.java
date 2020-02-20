package com.example.gsonexample;


import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("city")
    private String mCity;

    public Address(String Country, String City) {
        this.mCountry = Country;
        this.mCity = City;
    }
}
