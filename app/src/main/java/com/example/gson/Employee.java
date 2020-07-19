package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("first_name")
    private String mfirstName;
    @SerializedName("age")
    private int mage;
    @SerializedName("mail")
    private String mmail;


    //address
    @SerializedName("address")
    private Address mAddress;


    //constructor

    public Employee(String mfirstName, int mage, String mmail, Address mAddress) {
        this.mfirstName = mfirstName;
        this.mage = mage;
        this.mmail = mmail;
        this.mAddress = mAddress;
    }
}
