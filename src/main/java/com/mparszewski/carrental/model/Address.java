package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "adres")
public class Address {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_adresu", length = 20)
    private int id;

    @NotNull
    @Column(name = "panstwo", length = 20)
    private String country;

    @NotNull
    @Column(name = "miasto", length = 20)
    private String city;

    @NotNull
    @Column(name = "numer_ulicy", length = 20)
    private String streetNumber;

    @NotNull
    @Column(name = "kod_pocztowy", length = 20)
    private String postalCode;

}
