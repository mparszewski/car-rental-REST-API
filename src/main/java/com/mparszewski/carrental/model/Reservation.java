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
    @AttributeOverrides({
            @AttributeOverride(name = "reservationId", column = @Column(name = "id_rezerwacji", nullable = false)),
            @AttributeOverride(name = "carId", column = @Column(name = "id_samochodu", nullable = false)) })
    private ReservationId reservationId;

    @Type(type = "timestamp")
    @Column(name = "planowany_poczatek")
    private Date plannedStart;

    @Type(type = "timestamp")
    @Column(name = "planowany_koniec")
    private Date plannedFinish;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "id_samochodu", nullable = false, insertable = false, updatable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "id_klienta")
    private Client client;

    @OneToOne(fetch = LAZY, mappedBy = "reservation")
    private Hire hire;

    @OneToMany(mappedBy = "reservation")
    private List<ReservationLocation> reservationLocations;
}
