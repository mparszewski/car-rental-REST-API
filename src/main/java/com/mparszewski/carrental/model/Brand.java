package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "marka")
public class Brand {

    @Id
    @Column(name = "marka", length = 20)
    private String brand;

    @NotNull
    @Column(name = "kraj_pochodzenia", length = 20)
    private String country;

    @OneToMany(mappedBy = "brand")
    private List<CarModel> carModels;

}
