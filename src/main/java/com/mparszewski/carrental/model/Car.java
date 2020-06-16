package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Data
@Entity
@Table(name = "samochod")
public class Car {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_samochodu")
    private int carId;

    @Column(name = "rok_produkcji")
    private int productionYear;

    @NotNull
    @Column(name = "przebieg")
    private int mileage;

    @ManyToOne
    @JoinColumn(name = "model_samochodu", nullable = false)
    private CarModel carModel;

    @ManyToOne
    @JoinColumn(name = "cena_za_dzien", nullable = false)
    private PriceTariff dailyPrice;
}
