package com.mparszewski.carrental.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "taryfa_cenowa")
public class PriceTariff {

    @Id
    @Column(name = "cena_za_dzien", length = 6, precision = 2)
    private double priceTariff;
}
