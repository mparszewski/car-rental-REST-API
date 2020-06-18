package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "akcesorium")
public class Accessory {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_akcesorium")
    private int accessoryId;

    @NotNull
    @Column(name = "nazwa_akcesorium", length = 200)
    private String accessoryName;

    @Column(name = "model", length = 20)
    private String model;

    @Column(name = "producent", length = 20)
    private String manufacturer;

    @ManyToOne
    @JoinColumn(name = "cena_za_dzien", nullable = false)
    private PriceTariff dailyPrice;

    @ManyToOne(fetch = LAZY)
    @JoinColumns({
            @JoinColumn(name = "id_rezerwacji", referencedColumnName = "id_rezerwacji"),
            @JoinColumn(name = "id_samochodu", referencedColumnName = "id_samochodu")
    })
    private Reservation reservation;
}
