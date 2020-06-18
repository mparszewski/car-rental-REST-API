package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "samochod")
public class Car {

    @Id
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

    @ManyToMany
    @JoinTable(
            name = "parametr_samochodu",
            joinColumns = @JoinColumn(name = "id_samochodu"),
            inverseJoinColumns = @JoinColumn(name = "id_parametru")
    )
    private List<ParameterType> parameterTypes;

    @OneToMany(mappedBy = "car")
    private List<Insurance> insurances;

    @OneToMany(mappedBy = "car")
    private List<Reservation> reservations;
}
