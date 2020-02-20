package com.example.gsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //GSON CLASS object
        Gson gson = new Gson();

        /*
        Only Int and String
         */

        /*

        Employee employee = new Employee("Yaman",21,"yaman@gmail.com");

        String json = gson.toJson(employee);

        String new_json = "{\"firstname\":\"Yaman\",\"age\": \21,\"mail\":\"yaman@gmail.com\"}";

        Employee employee1 = gson.fromJson("json",Employee.class);

        Log.i("print Json",json);

         */

        /*
        Nested Objects in JSON/GSON
         */

        /*
        Address address = new Address("India","Noida/Delhi");

        Employee employee = new Employee("Manish",22,"mainsh@gmail.com",address);

        String json = gson.toJson(employee);

        Log.i("print Json",json);
        */

        Address address = new Address("India","Ghaziabad");
        List<FamilyMember> family = new ArrayList<>();

        family.add(new FamilyMember("doctor",30));
        family.add(new FamilyMember("surgeon",40));
        family.add(new FamilyMember("chef",50));

        Employee employee = new Employee("Mayank",25,"xyz@gmail.com",address,family,"PassXYZ@123");
        String json = gson.toJson(employee);
        Log.i("Json Object:",json);

    }
}
