package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.EAGER;

@Data
@Entity
@Table(name = "wypozyczenie")
public class Hire {

    @EmbeddedId
    private HireId hireId;

    @NotNull
    @Enumerated(STRING)
    @Column(name = "status", length = 10)
    private Status status;

    @Column(name = "liczba_dni")
    private int daysAmount;

    @Column(name = "przebieg_przed")
    private int mileageBefore;

    @Column(name = "przebieg_po")
    private int mileageAfter;

    @OneToOne(fetch = EAGER, optional = false)
    @MapsId
    private Reservation reservation;

    @ManyToOne(fetch = EAGER, optional = false)
    @MapsId
    private Car car;

}
