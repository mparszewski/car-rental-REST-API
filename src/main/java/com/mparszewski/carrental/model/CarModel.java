package com.mparszewski.carrental.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "model_samochodu")
public class CarModel {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "model_samochodu", length = 30)
    private String model;

    @ManyToOne
    @JoinColumn(name = "marka", nullable = false)
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "typ_segmentu", nullable = false)
    private SegmentType segmentType;

    @OneToMany(mappedBy = "carModel")
    private List<Car> cars;
}
