package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@EqualsAndHashCode
@Embeddable
public class ReservationId implements Serializable {

    @NotNull
    @Column(name = "id_samochodu")
    private int carId;

    @NotNull
    @Column(name = "id_rezerwacji")
    private int reservationId;

}
