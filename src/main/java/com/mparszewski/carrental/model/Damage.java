package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "uszkodzenie")
public class Damage {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_uszkodzenia")
    private int damageId;

    @NotNull
    @Column(name = "klasa_uszkodzenia", length = 20)
    private String damageClass;

    @NotNull
    @Column(name = "stopien_uszkodzenia")
    private int damageDegree;

    @NotNull
    @Column(name = "opis_uszkodzenia")
    private String damageDescription;

    @ManyToOne(fetch = LAZY)
    @JoinColumns({@JoinColumn(name = "id_rezerwacji", referencedColumnName = "id_rezerwacji", nullable = false),
            @JoinColumn(name = "id_samochodu", referencedColumnName = "id_samochodu", nullable = false)})
    private Hire hire;
}
