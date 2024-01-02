package com.HotelProject.HotelProject.web.dto;

import com.HotelProject.HotelProject.model.Chambre;
import com.HotelProject.HotelProject.model.Client;
import com.HotelProject.HotelProject.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class ReservationDto {
    private long id;
    private Date dateDepart;
    private Date dateArrive;
    private boolean status;
    private String lienReseration;
    private Chambre chambre;
    private Client client;


}
