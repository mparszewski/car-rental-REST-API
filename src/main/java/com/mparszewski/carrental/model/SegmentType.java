package com.mparszewski.carrental.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "typ_segmentu")
public class SegmentType {

    @Id
    @Column(name = "typ_segmentu", length = 15)
    private String segmentType;

    @OneToMany(mappedBy = "segmentType")
    private List<CarModel> carModels;
}
