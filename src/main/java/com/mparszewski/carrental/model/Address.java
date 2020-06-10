package com.mparszewski.carrental.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "adres")
public class Address {

    @Id
    @Column(name = "id_adresu")
    private int id;

    @Column(name = "panstwo")
    private String country;

    @Column(name = "miasto")
    private String city;

    @Column(name = "numer_ulicy")
    private String streetNumber;

    @Column(name = "kod_pocztowy")
    private String postalCode;

}
