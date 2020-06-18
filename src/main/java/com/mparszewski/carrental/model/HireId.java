package com.mparszewski.carrental.model;

import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode
@Embeddable
public class HireId implements Serializable {

    @Column(name = "id_rezerwacji")
    private int reservationId;

    @Column(name = "id_samochodu")
    private int carId;
}
