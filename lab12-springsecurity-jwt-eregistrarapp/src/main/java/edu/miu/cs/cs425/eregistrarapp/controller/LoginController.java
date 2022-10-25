package edu.miu.cs.cs425.eregistrarapp.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
    @GetMapping(value = {"/public/login", "/eregistrar/public/login"})
    public String login(){
        return "public/login";
    }
}
