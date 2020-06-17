package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "lokalizacja_rezerwacji")
public class ReservationLocation {

    @EmbeddedId
    private ReservationLocationId reservationLocationId;

    @NotNull
    @Type(type = "timestamp")
    @Column(name = "data")
    private Date data;

    @ManyToOne
    @JoinColumn(name = "id_lokalizacji")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "id_samochodu")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "id_rezerwacji")
    private Reservation reservation;

}
