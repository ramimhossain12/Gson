package com.example.gson;

import com.google.gson.annotations.SerializedName;

public class FamilyMember {

    @SerializedName("role")
    private String mRole;
    @SerializedName("age")
    private  int mage;

    public FamilyMember(String role , int age) {
        mRole = role;
        mage = age;
    }
}
