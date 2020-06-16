package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.*;

@Data
@Entity
@Table(name = "rezerwacja")
public class Reservation {

    @EmbeddedId
    private ReservationId reservationId;

    @Type(type = "timestamp")
    @Column(name = "planowany_poczatek")
    private Date plannedStart;

    @Type(type = "timestamp")
    @Column(name = "planowany_koniec")
    private Date plannedFinish;

    @NotNull
    @Column(name = "id_samochodu")
    private int carId;
}
