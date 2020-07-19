package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("first_name")
    private String mfirstName;
    @SerializedName("age")
    private int mage;
    @SerializedName("mail")
    private String mmail;

    public Employee(String firstName, int age, String mail) {
        this.mfirstName = firstName;
        this.mage = age;
        this.mmail = mail;
    }
}
