package com.HotelProject.HotelProject.service;

import com.HotelProject.HotelProject.model.Client;
import com.HotelProject.HotelProject.model.User;
import com.HotelProject.HotelProject.web.dto.ClientDto;
import com.HotelProject.HotelProject.web.dto.UserRegestrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface ClientService {
    public Client save(ClientDto ClientDto);
}
