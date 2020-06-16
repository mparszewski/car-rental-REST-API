package com.mparszewski.carrental.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.EnumType.STRING;

@Embeddable
public class ReservationLocationId implements Serializable {

    @Enumerated(STRING)
    @Column(name = "typ")
    private ReservationType reservationType;

    @ManyToOne
    @JoinColumn(name = "id_rezerwacji")
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "id_samochodu")
    private Car car;
}
