package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "rodzaj_parametru")
public class ParameterType {

    @Id
    @Column(name = "id_parametru")
    private int parameterId;

    @NotNull
    @Column(name = "nazwa_parametru", length = 30)
    private String parameterName;

    @Column(name = "wartosc_tekstowa", length = 30)
    private String textValue;

    @Column(name = "wartosc_liczbowa", length = 5, precision = 5)
    private double numericValue;

    @Column(name = "jednostka", length = 10)
    private String unit;

    @ManyToMany(mappedBy = "parameterTypes")
    private List<Car> cars;
}
