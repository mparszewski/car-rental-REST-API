package com.mparszewski.carrental.model;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Enumerated;
import java.io.Serializable;

import static javax.persistence.EnumType.STRING;

@EqualsAndHashCode
@Embeddable
public class ReservationLocationId implements Serializable {

    @Enumerated(STRING)
    @Column(name = "typ")
    private ReservationType reservationType;

    @Column(name = "id_rezerwacji")
    private int reservationId;

    @Column(name = "id_samochodu")
    private int carId;
}
