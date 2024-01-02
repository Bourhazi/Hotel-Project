package com.HotelProject.HotelProject.model;

import jakarta.persistence.*;
import lombok.Data;
//import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "user",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
    private String email;
    private String password;
    //@OneToMany(mappedBy = "user" ,fetch = FetchType.LAZY)
    //private List<Reservation> reservations;
    @ManyToMany(fetch = FetchType.EAGER , cascade =CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id",referencedColumnName = "id"),
            inverseJoinColumns =@JoinColumn(
                    name = "role_id",referencedColumnName = "id")
            )
    private Collection<Role> roles;

    public User(String firstname, String lastname, String email, String password, Collection<Role> roles) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }


}
