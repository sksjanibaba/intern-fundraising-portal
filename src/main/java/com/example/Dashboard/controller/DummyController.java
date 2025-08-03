package com.example.Dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


    @Controller
    public class DummyController {
        @GetMapping("/login")
        public String login(){
            return "login";
        }
        @GetMapping("/")
        public String home() {
            return "index";
        }

        @GetMapping("/leaderboard")
        public String leaderboardPage() {
            return "leaderboard";
        }
    }


