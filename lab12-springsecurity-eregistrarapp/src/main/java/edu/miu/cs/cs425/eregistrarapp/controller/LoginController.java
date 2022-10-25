package edu.miu.cs.cs425.eregistrarapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping(value = {"/public/login", "/eregistrar/public/login"})
    public String login(){
        System.out.println(passwordEncoder.encode("abc123"));
        System.out.println(passwordEncoder.matches("abc123", "$2a$10$TsktdvJcfwPNMPCmneKqnOJwG64CvergVlmFF9EthXniqGi7nmGVa"));
        return "/login";
    }
}
