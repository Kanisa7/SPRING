package com.xfactor.openlibrary.controllers;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(@RequestParam String name, int number) {
        return "Hello " + name + " !! " + number + "--it's his id";
    }

    @GetMapping("/hi/{name}/{id}")
    public String sayHi(@PathVariable String name, @PathVariable int id) {
        return "Hello " + name + " !! " + id;
    }

    @GetMapping("/com/{name}")
    public String com(@PathVariable String name, @RequestParam int number) {
        return "Hello " + name + " !! " + number;
    }

    @GetMapping("/sayhi/{name}/{id}")
    public HashMap<String, Object> sayhi(@PathVariable String name, @PathVariable int id) {
        HashMap<String, Object> respHashMap = new HashMap<>();
        respHashMap.put("name", name);
        respHashMap.put("id", id);
        return respHashMap;
    }

}
