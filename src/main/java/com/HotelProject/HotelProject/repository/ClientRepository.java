package com.HotelProject.HotelProject.repository;

import com.HotelProject.HotelProject.model.Chambre;
import com.HotelProject.HotelProject.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
