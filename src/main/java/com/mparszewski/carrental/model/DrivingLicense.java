package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.FetchType.LAZY;

@Data
@Entity
@Table(name = "prawo_jazdy")
public class DrivingLicense {

    @Id
    @Column(name = "numer_prawa_jazdy")
    private String drivingLicenseNumber;

    @NotNull
    @Type(type = "timestamp")
    @Column(name = "data_wydania")
    private Date releaseDate;

    @NotNull
    @Type(type = "timestamp")
    @Column(name = "data_waznosci")
    private Date expirationDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "kategoria", length = 4)
    private Category category;

    @Column(name = "ograniczenia", length = 100)
    private String restrictions;

    @Column(name = "organ_wydajacy", length = 20)
    private String issuingAuthority;

    @OneToOne(fetch = LAZY, optional = false)
    @MapsId
    private Client client;
}
