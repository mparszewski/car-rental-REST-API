package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;

@Data
@Entity
@Table(name = "wypozyczenie")
public class Hire {

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "reservationId", column = @Column(name = "id_rezerwacji", nullable = false)),
            @AttributeOverride(name = "carId", column = @Column(name = "id_samochodu", nullable = false)) })
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

    @OneToOne(fetch = LAZY, optional = false)
    @PrimaryKeyJoinColumn
    private Reservation reservation;

    @OneToMany(mappedBy = "reservation")
    private List<Accessory> accessories;

    @OneToMany(mappedBy = "hire")
    private List<Damage> damages;

}
