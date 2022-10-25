package edu.miu.cs.cs425.eregistrarapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    @GetMapping(value = {"","home"})
    public String displayHomePage() {
        return "index";
    }
    @GetMapping(value = {"/about"})
    public String displayAboutUsPage() {
        return "about";
    }


    @GetMapping(value = {"/", "/eregistrar", "/eregistrar/public"})
   public String home0() {
        return "index";
   }
   @GetMapping(value = {"/home", "/eregistrar/public/home"})
   public String home1() {
      return "public/index";
   }
   @GetMapping(value = {"/public/about","/eregistrar/public/about"})
   public String about() {
        return "/about";
   }
    @GetMapping(value = {"/secured/home","/eregistrar/secured/home"})

    public String home2()  {
       return "secured/index";
   }

}
