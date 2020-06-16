package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "parametr_samochodu")
public class CarParameter {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_parametru")
    private int parameterId;

    @NotNull
    @Column(name = "id_samochodu")
    private int carId;
}
