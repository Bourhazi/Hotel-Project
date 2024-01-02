package com.HotelProject.HotelProject.controller;

import com.HotelProject.HotelProject.service.UserService;
import com.HotelProject.HotelProject.web.dto.UserRegestrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegestrationController {
    private UserService userService;

    public UserRegestrationController(UserService userService) {
        super();
        this.userService = userService;
    }
    @ModelAttribute("user")
    public UserRegestrationDto userRegestrationDto(){
        return new UserRegestrationDto();
    }
    @GetMapping
    public  String showRegistrationForm(){
        return "registration";
    }
    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegestrationDto userRegestrationDto){
        userService.save(userRegestrationDto);
        return  "redirect:/registration?success";
    }
}
