package com.mparszewski.carrental.model;


import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "klient")
public class Client {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_klienta")
    private int clientId;

    @NotNull
    @Column(name = "haslo", length = 25)
    private String password;

    @NotNull
    @Type(type = "timestamp")
    @Column(name = "data_rejestracji")
    private Date registrationDate;

    @Column(name = "imie", length = 50)
    private String firstName;

    @Column(name = "nazwisko", length = 50)
    private String lastName;

    @Column(name = "pesel", length = 11)
    private String pesel;

    @NotNull
    @Column(name = "adres_email", length = 50)
    private String emailAddress;

    @NotNull
    @Column(name = "numer_kontaktowy", length = 12)
    private String phoneNumber;

    @Column(name = "nazwa", length = 50)
    private String name;

    @Column(name = "nip", length = 10)
    private String nip;

    @Column(name = "branza", length = 30)
    private String trade;

    @OneToOne(mappedBy = "client", cascade = ALL, fetch = LAZY)
    private DrivingLicense drivingLicense;

    @ManyToOne
    @JoinColumn(name = "numer_prawa_jazdy")
    private Address address;

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;
}
