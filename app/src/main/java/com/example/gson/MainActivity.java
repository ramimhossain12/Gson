package com.example.gson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.ttID);


        Gson gson = new Gson();
      /*
        Employee employee = new Employee("Ramim",20,"ramim85@gamil.com");
        String json = gson.toJson(employee);

       */

        String json = "{\"first_name\":\"Ramim\",\"age\":30,\"mail\":\"ramim@gmail.com\"}";
        Employee employee = gson.fromJson(json, Employee.class);


    }
}