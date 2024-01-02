package com.HotelProject.HotelProject.web.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class ClientDto {
    private long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String cin;
    private String gender;
    private Date dateDeNaissance;
    private String email;
}
