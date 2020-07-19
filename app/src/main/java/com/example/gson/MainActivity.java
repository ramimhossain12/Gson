package com.example.gson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.ttID);

        // gson obj
        Gson gson = new Gson();


        /*
        ///obj for address;
        Address address = new Address("Bangladesh", "Dhaka");


       // obj for family member;
        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 25));
        family.add(new FamilyMember("Daugther", 3));

        //Employee employee = new Employee("Ramim", 20, "ramim85@gamil.com", address, family);
        String json = gson.toJson(family);

         */


        String json = "[{\"role\":\"Wife\",\"age\":25},{\"role\":\"Daugther\",\"age\":3}]";
        Type familyType = new TypeToken<ArrayList<FamilyMember>>(){}.getType();
        FamilyMember[] family = gson.fromJson(json, familyType);


    }
}

