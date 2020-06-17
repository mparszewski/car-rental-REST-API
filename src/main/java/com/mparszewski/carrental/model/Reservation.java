package com.mparszewski.carrental.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

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

    @ManyToOne
    @JoinColumn(name = "id_samochodu", nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "id_klienta")
    private Client client;

    @OneToMany(mappedBy = "reservation")
    private List<Damage> damages;

    @OneToOne(fetch = LAZY, optional = false)
    @MapsId
    private Hire hire;

    @OneToMany(mappedBy = "reservation")
    private List<ReservationLocation> reservationLocations;
}
