package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Data
@Entity
@Table(name = "lokalizacja")
public class Location {

    @Id
    @Column(name = "id_lokalizacji")
    private int locationId;

    @NotNull
    @Column(name = "liczba_miejsc_parkingowych")
    private int parkingPlaces;


    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "adres_id_adresu")
    private Address address;

    @OneToMany(mappedBy = "location")
    private List<ReservationLocation> reservationLocations;
}
