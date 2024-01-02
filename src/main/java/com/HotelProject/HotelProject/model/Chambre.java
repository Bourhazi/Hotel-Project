package com.HotelProject.HotelProject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Table(name = "chambre",uniqueConstraints = @UniqueConstraint(columnNames = "codeChambre"))
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "chambre" ,fetch = FetchType.LAZY)
    private List<Reservation> reservations;
    @ManyToOne
    private Category category;
}