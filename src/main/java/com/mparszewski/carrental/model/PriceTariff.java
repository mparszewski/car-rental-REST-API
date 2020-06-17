package com.mparszewski.carrental.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "taryfa_cenowa")
public class PriceTariff {

    @Id
    @Column(name = "cena_za_dzien", length = 6, precision = 2)
    private double priceTariff;

    @OneToMany(mappedBy = "dailyPrice")
    private List<Car> cars;

    @OneToMany(mappedBy = "dailyPrice")
    private List<Accessory> accessories;
}
