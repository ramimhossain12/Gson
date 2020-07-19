package com.example.gson;

import android.widget.ListView;

import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    //familymember serializedname

    @SerializedName("fmaily")
    private List<FamilyMember> mFamily;


    //constructor


    public Employee(String mfirstName, int mage, String mmail, Address mAddress, List<FamilyMember> mFamily) {
        this.mfirstName = mfirstName;
        this.mage = mage;
        this.mmail = mmail;
        this.mAddress = mAddress;
        this.mFamily = mFamily;
    }
}
