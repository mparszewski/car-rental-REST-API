package com.mparszewski.carrental.model;

import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.FetchType.*;

@Data
@Entity
@Table(name = "lokalizacja_rezerwacji")
public class ReservationLocation {

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "reservationId", column = @Column(name = "id_rezerwacji", nullable = false)),
            @AttributeOverride(name = "carId", column = @Column(name = "id_samochodu", nullable = false)),
            @AttributeOverride(name = "reservationType", column = @Column(name = "typ", nullable = false, length = 10)) })
    private ReservationLocationId reservationLocationId;

    @NotNull
    @Type(type = "timestamp")
    @Column(name = "data")
    private Date data;

    @ManyToOne
    @JoinColumn(name = "id_lokalizacji")
    private Location location;
    
    @ManyToOne(fetch = LAZY)
    @JoinColumns({
            @JoinColumn(name = "id_rezerwacji", referencedColumnName = "id_rezerwacji", nullable = false, insertable = false, updatable = false),
            @JoinColumn(name = "id_samochodu", referencedColumnName = "id_samochodu", nullable = false, insertable = false, updatable = false) })
    private Reservation reservation;

}
