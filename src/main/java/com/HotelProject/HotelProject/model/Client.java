package com.HotelProject.HotelProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "client")
@Data @AllArgsConstructor @NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String cin;
    private String gender;
    @Column(name = "date_de_naissance")
    private Date dateDeNaissance;
    private String email;
    @OneToMany(mappedBy = "client" ,fetch = FetchType.LAZY)
    private List<Reservation> reservations;


    public Client(String nom, String prenom, String adresse, String telephone, String cin, String gender, Date dateDeNaissance, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.cin = cin;
        this.gender = gender;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
    }
}
