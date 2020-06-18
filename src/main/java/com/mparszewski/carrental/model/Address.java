package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "adres")
public class Address {

    @Id
    @Column(name = "id_adresu", length = 20)
    private int id;

    @NotNull
    @Column(name = "panstwo", length = 20)
    private String country;

    @NotNull
    @Column(name = "miasto", length = 20)
    private String city;

    @NotNull
    @Column(name = "ulica", length = 20)
    private String street;

    @NotNull
    @Column(name = "numer_ulicy", length = 20)
    private String streetNumber;

    @NotNull
    @Column(name = "kod_pocztowy", length = 20)
    private String postalCode;

    @OneToMany(mappedBy = "address")
    private List<Client> client;

    @OneToOne(fetch = LAZY, mappedBy = "address")
    private Location location;

}
