package com.HotelProject.HotelProject.service;

import com.HotelProject.HotelProject.model.User;
import com.HotelProject.HotelProject.web.dto.UserRegestrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface UserService extends UserDetailsService {
    User save(UserRegestrationDto regestrationDto );

}
