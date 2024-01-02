package com.HotelProject.HotelProject.controller;

import com.HotelProject.HotelProject.service.ClientService;
import com.HotelProject.HotelProject.web.dto.ClientDto;
import com.HotelProject.HotelProject.web.dto.UserRegestrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {
    private ClientService clientService;

    @ModelAttribute("client")
    public ClientDto clientDto(){
        return new ClientDto();
    }
    @GetMapping
    public  String Client(){
        return "Client";
    }

    @PostMapping
    public String AddClient(@ModelAttribute("client") ClientDto clientDto){
        clientService.save(clientDto);
        return  "redirect:/client?success";
    }
}
