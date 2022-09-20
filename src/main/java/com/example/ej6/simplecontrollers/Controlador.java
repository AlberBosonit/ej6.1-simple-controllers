package com.example.ej6.simplecontrollers;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controlador {

    @GetMapping(value= "/hola/{name}")
    public String hola(@PathVariable String name) {
        return "Hola " + name;
    }

    @PostMapping(value= "/useradd")
    public String useradd(@RequestBody String person) {
        Person user = new Gson().fromJson(person, Person.class);
        return new Person(user.getName(), user.getCity(), user.getAge()).toString();
    }
}
