package com.HotelProject.HotelProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping
public class mainController {
    @GetMapping("/login")
    public  String login(){
        return "login";
    }
    //@GetMapping("/")
    //public String home() {
      //  return "index";
    //}
}
