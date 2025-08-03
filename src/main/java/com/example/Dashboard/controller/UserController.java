package com.example.Dashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @GetMapping("/user")
    public Map<String,Object> getUser(){
        Map<String,Object> response=new HashMap<>();
        response.put("name","janibaba");
        response.put("refferalCode","janibaba2023");
        response.put("donations",6500);
        return  response;
    }
    @GetMapping("/leadership")
    public List<Map<String, Object>> getLeaderShip() {
        List<Map<String, Object>> leadership = new ArrayList<>();
        leadership.add(Map.of("name", "Janibaba", "donations", 6500));
        leadership.add(Map.of("name", "Divya", "donations", 5000));
        leadership.add(Map.of("name", "Ramya", "donations", 4000));
        return leadership;
    }

}
