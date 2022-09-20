package com.example.ej6.simplecontrollers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.google.gson.Gson;
import org.apache.tomcat.util.json.JSONParser;

public class Person {
    private String name;
    private String city;
    private Integer age;

    public Person(String name, String city, Integer age) {
        this.name = name;
        this.city = city;
        this.age = age+1;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString(){
        return new Gson().toJson(this);
    }
}
