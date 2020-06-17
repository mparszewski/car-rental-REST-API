package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ubezpieczenie")
public class Insurance {

    @Id
    @Column(name = "numer_polisy")
    private String policyNumber;

    @NotNull
    @Column(name = "nazwa_firmy")
    private String companyName;

    @Column(name = "typ")
    private String type;

    @Type(type = "timestamp")
    @Column(name = "data_zawarcia")
    private Date dateOfConclusion;

    @Type(type = "timestamp")
    @Column(name = "data_wygasniecia")
    private Date expirationDate;

    @Column(name = "wysokosc_skladki", length = 2, precision = 5)
    private double premiumAmount;

    @ManyToOne
    @JoinColumn(name = "id_samochodu")
    private Car car;
}
