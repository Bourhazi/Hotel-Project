package com.HotelProject.HotelProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChambreController {
    @GetMapping("/chambre")
    public  String Chambre(){
        return "Chambre";
    }
}
