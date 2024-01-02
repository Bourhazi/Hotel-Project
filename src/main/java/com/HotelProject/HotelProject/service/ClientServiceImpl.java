package com.HotelProject.HotelProject.service;

import com.HotelProject.HotelProject.model.Client;
import com.HotelProject.HotelProject.model.Role;
import com.HotelProject.HotelProject.model.User;
import com.HotelProject.HotelProject.repository.ClientRepository;
import com.HotelProject.HotelProject.web.dto.ClientDto;
import com.HotelProject.HotelProject.web.dto.UserRegestrationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ClientServiceImpl implements ClientService{
    private ClientRepository clientRepository;
    @Override
    public Client save(ClientDto ClientDto) {
        Client client = new Client(ClientDto.getNom(),ClientDto.getPrenom(),ClientDto.getAdresse(),ClientDto.getTelephone(),
                ClientDto.getCin(),ClientDto.getGender(),ClientDto.getDateDeNaissance(),ClientDto.getEmail());
        return clientRepository.save(client);
    }
}
